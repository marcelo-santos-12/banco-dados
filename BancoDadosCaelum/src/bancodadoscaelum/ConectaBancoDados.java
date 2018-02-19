/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancodadoscaelum;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author marmh
 */
public class ConectaBancoDados {
    //todo objeto tera conexao com o banco de dados
    private final Connection conexao;
    public ConectaBancoDados(){
        this.conexao = new ConnectionFactory().getConnection();
    }
    
    public void adiciona(Bean bean){
        //codigo sql que sera executado nesse metodo
    String sql = "insert into pessoa"
            + "(nome) values"
            + "(?);"; 
    try{
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, bean.getNome());
        stmt.execute();
        stmt.close();
    }
    catch(SQLException ex){
        throw new RuntimeException(ex);
    }

    }
}