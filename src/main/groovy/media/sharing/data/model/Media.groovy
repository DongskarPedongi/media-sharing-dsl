/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package media.sharing.data.model

import javax.persistence.*

/**
 *
 * @author Luqman A. Siswanto
 */
@Entity
@Table(name="media")
class Media {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    Long id

    Long uploader_id

    String name

    Date date_added

    String link
}

