
package conection;

import java.sql.*;
        
public class conectaBD {
        public static void main(String[] args) {
        
        // Dados para conexão com o banco de dados
        String url = "jdbc:mysql://26.0.0.1/bd_perante";
        String usuario = "root";
        String senha = "";
        
        // Declaração de variáveis
        Connection conexao = null;
        Statement statement = null;
        ResultSet resultSet = null;
        
        try {
            // Conexão com o banco de dados
            conexao = DriverManager.getConnection(url, usuario, senha);
            
            // Execução de um SELECT na tabela "clientes"
            statement = conexao.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM clientes");
            
            // Processamento do resultado
            while (resultSet.next()) {
                int id = resultSet.getInt("cod_produto");
                String nome = resultSet.getString("nome_produto");
                String email = resultSet.getString("qtde_estoque");
                System.out.println(id + ", " + nome + ", " + email);
            }
            
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ou executar consulta: " + e.getMessage());
        } finally {
            // Fechamento das conexões
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (conexao != null) conexao.close();
            } catch (SQLException e) {
                System.out.println("Erro ao fechar conexão: " + e.getMessage());
            }
        }
        
    }
}
