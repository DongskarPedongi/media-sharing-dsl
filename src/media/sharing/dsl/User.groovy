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
class User extends DatabaseConnector {
    
    def id
    def username
    def name
    def email
    def password
    
    def get_id(username) {
        def user = sql.rows("SELECT * FROM user WHERE user.username="+"\""+username+"\"")[0]
        return user.id
    }
    
    def register(user) {
        
    }
    
    def edit(user) {
        
    }
    
    def like(user_id, media_id) {
        def command = "INSERT INTO `like`(media_id, user_id, value) VALUES "+\
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
        
    }
    
}

