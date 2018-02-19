/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancodadoscaelum;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author marmh
 */
public class ProcuraDados {
    public static void main(String[] args) throws SQLException {
        Connection conexao = new ConnectionFactory().getConnection();
        PreparedStatement stmt = conexao.prepareStatement("select * from pessoa;");
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                String nome = rs.getString("nome");
                    System.out.println(nome);
            }
            stmt.close();
            conexao.close();  
    }
}
