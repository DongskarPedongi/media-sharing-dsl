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
@Table(name="comments")
class Comment {
    @Id @GeneratedValue
    Long id

    Long media_id

    Long user_id

    String text

    Date date
}

