/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package media.sharing.dsl

/**
 *
 * @author Luqman A. Siswanto
 */
class Media extends DatabaseConnector {
    
    def id
    def uploader_id
    def name
    def date_added
    def link
    def likes
    
    def get_id(name) {
        def media = sql.rows("SELECT * FROM media WHERE media.name="+"\'"+name+"\'")[0]
        return media.id
    }
    
    def upload(uploader_id, name, link) {
        
    }
    
    def download(id) {
        
    }
    
    def get_likes(media_id) {
        
    }

    def like(user_id, media_id) {
        def command = "INSERT INTO like(media_id, user_id, value) VALUES "+\
                        "(${media_id}, ${user_id}, 1)"
        try {
            sql.execute(command);
            println("Like succedded")
        } catch(Exception ex) {
            sql.rollback()
            println("Like failed")
        }
    }

    def unlike(user_id, media_id) {
        def command = "INSERT INTO like(media_id, user_id, value) VALUES "+\
                        "(${media_id}, ${user_id}, -1)"
        try {
            sql.execute(command);
            println("Unlike succedded")
        } catch(Exception ex) {
            sql.rollback()
            println("Unlike failed")
        }
    }
    
}

