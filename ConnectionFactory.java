package ConnectionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public static Connection getConnection() throws SQLException{
		try {
			return DriverManager.getConnection("jdbc:postgressql://localhost/petShop","postgres","postgres");
		}catch(Exception e) {
			System.out.println("Erro encontrado na conexão com o banco ");
			throw new SQLException(e.getMessage());
		}
	}
	
}
