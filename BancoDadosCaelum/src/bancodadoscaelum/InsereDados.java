/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancodadoscaelum;

import java.sql.SQLException;

/**
 *
 * @author marmh
 */
public class InsereDados {

    public static void main(String[] args) throws SQLException {
            //inserindo dados no banco de dados
        
            Bean nome = new Bean();
            nome.setNome("sei la");
        
            ConectaBancoDados bd = new ConectaBancoDados();
            bd.adiciona(nome);
            System.out.println("gravado");
    }
    
}
