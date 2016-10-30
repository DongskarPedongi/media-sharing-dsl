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
class Comment extends DatabaseConnector {
    
    def id
    def media_id
    def user_id
    def text
    def date
    
    def add(media_id, user_id, text, date) {
        
    }
    
    def get_comment_from_media(media_id) {
        
    }
    
    def get_comment_from_user(user_id) {
        
    }
}

