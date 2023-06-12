package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory0 {

	public  Connection conexao() {

		try {
			return DriverManager.
					getConnection("jdbc:mysql://localhost:3306/livraria", "root","");
		} catch (SQLException e) {
			System.out.println("nao foi possivel realizar"
					+ "a conexao com o Bd");

		}
		return null;
	}

}