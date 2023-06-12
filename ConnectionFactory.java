package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection conexao = null;

		try {
			conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/livraria", "root", "");
			System.out.println("conexao ok!!");
			conexao.close();
		} catch (SQLException e) {
			System.out.println("nao foi possivel realizar a conexao com o Bd");

		}

	}

}
