<<<<<<< HEAD
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/AulaTeste"; 
        String usuario = "postgres"; 
        String senha = "admin"; 

    
        try (Connection conexao = DriverManager.getConnection(url, usuario, senha)) {
            System.out.println(" Conectado com sucesso!");
        } catch (SQLException e) {
            System.out.println(" Erro na conexão: " + e.getMessage());
        }
    }
}
=======
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/AulaTeste"; 
        String usuario = "postgres"; 
        String senha = "admin"; 

    
        try (Connection conexao = DriverManager.getConnection(url, usuario, senha)) {
            System.out.println(" Conectado com sucesso!");
        } catch (SQLException e) {
            System.out.println(" Erro na conexão: " + e.getMessage());
        }
    }
}
>>>>>>> 4b3a41181d1c811c651a34e3c4b91f5801e0fb1a
