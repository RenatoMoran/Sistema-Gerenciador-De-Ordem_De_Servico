package br.com.infox.dal;

import java.sql.*;

/**
 *
 * @author Renato Veiga
 */
public class ModuloConexao {

    // Método responsável por estabelecer a conexão com o banco de dados
    public static Connection conector() {

        java.sql.Connection conexao = null;

// A linha chama o driver 
        String driver = "com.mysql.jdbc.Driver";

// Armazenando informações referentes ao banco de dados
        String url = "jdbc:mysql://localhost:3306/dbinfox";

        String user = "root";
        String password = "";

// Estabelecendo a conexão com o banco de dados
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url,user, password);
            return conexao;
        } catch (Exception e) {
            // A linha abaixo serve de apoio para esclarecer o erro
            //System.out.println(e); // Imprime o erro caso não tenha sucesso em conectar com o banco de dados
            
            return null;
        }
        

    }

}
