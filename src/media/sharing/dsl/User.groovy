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
        def user = sql.rows("SELECT * FROM user WHERE user.username="+"\'"+username+"\'")[0]
        return user.id
    }
    
    def register(user) {
        def command = "INSERT INTO `user`(username, name, email, password) VALUES "+\
                        "('${user.username}', '${user.name}', '${user.email}', '${user.password}')"
        try {
            sql.execute(command);
            println("Register succedded")
        } catch(Exception ex) {
            sql.rollback()
            println("Register failed")
        }
    }
    
    def edit(user) {
        
    }

}

