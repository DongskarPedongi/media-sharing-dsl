package media.sharing.dsl

import media.sharing.data.HibernateTemplate
import media.sharing.data.model.User
import org.hibernate.Criteria
import org.hibernate.criterion.Restrictions

class UserProcessor {
    def sql

    def get_id(username) {
        def res
        new HibernateTemplate().doInSession({ sess ->
            Criteria criteria = sess.createCriteria(User.class)
            res = criteria.add(Restrictions.eq("username", username)).uniqueResult()
        }, true)
        return res.id
    }

    def register(user) {
        new HibernateTemplate().doInSession({ sess ->
            sess.save user
        }, true)
    }

    def edit(user) {

    }
}
