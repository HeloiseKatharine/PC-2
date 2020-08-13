/*
Atividade 2 - Conectando um banco de dados a uma aplicação
 */
package br.com.prog2.rh.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Heloise
 */
public class ConnectionFactory {

    public static Connection getConnection() {

        String driver = "com.mysql.jdbc.Driver"; //"org.postgresql.Driver";
        String user = "root"; //"postgres";/*Coloque o usuário criado para acesso ao banco*/
        String senha = "56fgANH*40ty";//"senha";/*Coloque a senha para acesso ao banco*/
        String url = "jdbc:mysql://localhost:3306/rh"; //"jdbc:postgresql://127.0.0.1:5432/rh";/*Coloque o servidor onde está instalado o banco*/

        Connection con = null;

        try {
            Class.forName(driver);
            con = (Connection) DriverManager.getConnection(url, user, senha);
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.print(ex.getMessage());
        }
        return con;
        /*try {
            Class.forName(driver);
            con = (Connection) DriverManager.getConnection(url, user, senha);

        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Conexão com erro: ", ex); //System.err.print(ex.getMessage());
        }
        return con;*/
    }

    public static void close(Connection con) {

        try {
            con.close();
        } catch (SQLException ex) {
            //Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
