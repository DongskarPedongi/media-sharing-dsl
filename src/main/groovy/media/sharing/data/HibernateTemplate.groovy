package media.sharing.data

import media.sharing.data.model.Comment
import media.sharing.data.model.Media
import media.sharing.data.model.User
import org.hibernate.Session
import org.hibernate.SessionFactory
import org.hibernate.cfg.Configuration

class HibernateTemplate {

    SessionFactory sf

    Session sess

    HibernateTemplate() {
        sf = new Configuration()
                .addAnnotatedClass(User.class)
                .addAnnotatedClass(Comment.class)
                .addAnnotatedClass(Media.class)
                .buildSessionFactory()
    }

    void doInSession(c, shutdown) {
        sess = sf.openSession()
        def tx = sess.beginTransaction()
        c(sess)
        tx.commit()
        sess.close()
        if (shutdown) this.shutdown()
    }

    void shutdown() {
        sf.close()
    }
}
