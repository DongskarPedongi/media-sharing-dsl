/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package media.sharing.dsl

import java.sql.*; 
import groovy.sql.Sql 

/**
 *
 * @author Luqman A. Siswanto
 */
class DatabaseConnector {
    def sql = Sql.newInstance('jdbc:mysql://localhost:3306/media_sharing_dsl', 'root', '', 'com.mysql.jdbc.Driver')
}

