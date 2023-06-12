package DAO;

import java.sql.PreparedStatement;
import java.util.Collection;

import Model.Editora;
import conexao.ConnectionFactory;

public class EditoraDAO {
	
	private ConnectionFactory Connection;
	
	public EditoraDAO() {
		this.Connection = new ConnectionFactory();
	}

	public void salvarEditora(Editora editora) {
		String sql = "insert into editora (nome.email)" + "values(?,?)";
		
		Collection conn = Connection.conexao();
		
		PreparedStatement prepareStatement = conn.preparedStatement(sql);
}
}