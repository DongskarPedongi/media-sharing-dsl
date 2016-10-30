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
    
}

