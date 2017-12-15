import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectionFactory {
    public static Connection getConexao() {
        try {
        	String configuracaoBancoEEsquema = "jdbc:mysql://localhost/projeto";
        	String usuario = "root";
        	String senha = "root";
        	Connection conexao = DriverManager.getConnection(configuracaoBancoEEsquema, usuario, senha);
        	if(conexao != null) {
        		System.out.println("Conectado com sucesso!");
        	} else {
        		System.out.println("Falha na conexão!");
        	}
        	return conexao;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
