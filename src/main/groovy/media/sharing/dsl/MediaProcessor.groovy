package media.sharing.dsl

import media.sharing.data.HibernateTemplate
import media.sharing.data.model.Media
import media.sharing.data.model.Vote
import org.hibernate.Criteria
import org.hibernate.criterion.Restrictions

class MediaProcessor {
    def sql

    def get_media(name) {
        def res
        new HibernateTemplate().doInSession({ sess ->
            Criteria criteria = sess.createCriteria(Media.class)
            res = criteria.add(Restrictions.eq("name", name)).uniqueResult()
        }, true)
        return res
    }

    def get_id(name) {
        return this.get_media(name).id
    }

    def upload(uploader_id, name, link) {
        def media = new Media(name: name, uploader_id: uploader_id, link: link, date_added: new Date())
        new HibernateTemplate().doInSession({ sess ->
            sess.save media
        }, true)
    }

    def download(id) {

    }

    def get_likes(media_id) {
        def total_like = sql.rows("SELECT sum(value) FROM likes WHERE media.id="+media_id)[0]
        return total_like
    }

    def like(user_id, media_id) {
        def vote = new Vote(user_id: user_id, media_id: media_id, value: 1)
        new HibernateTemplate().doInSession({ sess ->
            sess.save vote
        }, true)
    }

    def unlike(user_id, media_id) {
        def vote = new Vote(user_id: user_id, media_id: media_id, value: -1)
        new HibernateTemplate().doInSession({ sess ->
            sess.save vote
        }, true)
    }
}
