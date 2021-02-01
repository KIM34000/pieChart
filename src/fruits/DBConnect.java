/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fruits;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * <b>Cette classe permet d'intialiser une connexion JDBC à une base de données
 * MySQL.
 * </b>
 * <p>
 * Elle possède une seule méthode statique "<b><i>connect</i></b>" qui renvoie une 
 * instance de Connection.
 * </p>
 * @author Christophe
 * @version 1.1
 * @see DBConnect#connect
 */
public class DBConnect {
    /**
     * <p>
     * <b>
     * Cette méthode renvoie une une instance de Connection, qui permet 
     * d'établir une connexion avec une base de données MySQL.
     * </b>
     * </p>
     * 
     * <pre>
     * Class.forName("com.mysql.jdbc.Driver");
     * </pre>
     * <p>
     * Cette instruction permet de charger le connecteur (connector) JDBC 
     * pour MySQL.
     * </p>
     * <p>
     * Exemple de chaîne de connexion :
     * <i>"jdbc:mysql://localhost:3308/bdpilotes", "root", ""</i>. 
     * La base de données est localisée sur la machine de développement sur
     * le port 3308. Le nom de la base de données est "<b><i>bdpilotes</i></b>".
     * </p>
     * @return conn est une instance de Connection
     * @exception java.lang.ClassNotFoundException l'exception est levée quand
     * le connecteur JDBC n'est pas trouvé.
     * @exception SQLException l'exception est levée quand le serveur de bases
     * de données n'est pas trouvé ou que la base de données n'est pas trouvée.
     */

    public static Connection connect() throws ClassNotFoundException, SQLException{
        Connection conn = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bdfruit", "root", "");
            System.out.println("Connexion réussie !");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return conn;
    }

}


