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
class Translator {
    
    def media = new Media()
    def comment = new Comment()
    def user = new User()
    
    def sign(kentang) {
        
    }
    
    def up = {
        
    }
    
    def like(media_name) {
        [by: {username ->
            def media_id = media.get_id(media_name)
            def user_id = user.get_id(username)
            user.like(user_id, media_id)
        }]
    }
    
    def unlike(media_name) {
        [by: {username ->
            def media_id = media.get_id(media_name)
            def user_id = user.get_id(username)
            user.unlike(user_id, media_id)
        }]
    }
    
    def comment(text) {
        [by: {username ->
            [on: {media_name ->
                def now = new Date()
                def timestamp = now.toTimestamp()
                def media_id = media.get_id(media_name)
                def user_id = user.get_id(username)
                comment.add(media_id, user_id, text, timestamp)
            }]
        }]
    }
    
    def download(media_id) {
        
    }
}

