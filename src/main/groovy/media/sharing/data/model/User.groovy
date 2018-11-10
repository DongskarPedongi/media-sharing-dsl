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
@Table(name="users")
class User {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    Long id

    String username

    String name

    String email

    String password
}

