package media.sharing.dsl

import media.sharing.data.HibernateTemplate
import media.sharing.data.model.Comment
import org.hibernate.Criteria
import org.hibernate.criterion.Restrictions

class CommentProcessor {
    def sql

    def add(media_id, user_id, text, date) {
        def comment = new Comment(id: id, user_id: user_id, text: text, date: date)
        new HibernateTemplate().doInSession({ sess ->
            sess.save comment
        }, true)
    }

    def get_comment_from_media(media_id) {
        def res
        new HibernateTemplate().doInSession({ sess ->
            Criteria criteria = sess.createCriteria(Comment.class)
            res = criteria.add(Restrictions.eq("media_id", media_id))
        }, true)
        return res
    }

    def get_comment_from_user(user_id) {

    }
}
