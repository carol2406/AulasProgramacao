package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Collection;

import Model.Editora;
import conexao.ConnectionFactory;

public class EditoraDAO {
	
	private ConnectionFactory connection;
	
	public EditoraDAO() {
		this.connection = new ConnectionFactory();
	}

	public void salvarEditora(Editora editora) {
		String sql = "insert into editora (nome.email)" + "values(?,?)";
		
		Connection conn = connection.conexao();
		
		try {
			PreparedStatement prepareStatement = conn.prepareStatement(sql);
			
			prepareStatement.setString(1,"tec");
			prepareStatement.setString(2,"tec@gmail.com");
			
			prepareStatement.execute();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
}
}