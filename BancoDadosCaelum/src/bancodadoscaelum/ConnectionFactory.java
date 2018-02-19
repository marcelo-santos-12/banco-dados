/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancodadoscaelum;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author marmh
 */
public class ConnectionFactory {
    //cria novas conexoes sempre que chamada;
    //metodo que criara um conexao com o banco de dados sempre que necessario, ou seja, basta criar uma instancia da classe
    //classe connection e invocar esse metodo. Ex: Connection con = new ConnectionFactory().getConnection();
    public Connection getConnection(){
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/teste", "root", "");
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}
