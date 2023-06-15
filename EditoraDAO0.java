package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import Model.Editora;
import conexao.ConnectionFactory;

public class EditoraDAO0 {

	private static ConnectionFactory connection;

	public EditoraDAO0() {
		this.connection = new ConnectionFactory();
	}

	public void salvarEditora(Editora editora) {
		String sql = "insert into editora (nome,email)" + "values(?,?)";

		Connection conn = connection.conexao();

		try {
			PreparedStatement prepareStatement = conn.prepareStatement(sql);

			prepareStatement.setString(1, "tec");
			prepareStatement.setString(2, "tec@gmail.com");

			prepareStatement.execute();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public List<Editora> listarEditora() {
		List<Editora> editoras = new ArrayList<Editora>();

		Connection conn1 = connection.conexao();

		String sql1 = "SELECT * FROM editora";
		try {

			PreparedStatement statement0 = conn1.prepareStatement(sql1);
			ResultSet resultado1 = statement0.executeQuery();

			while (resultado1.next()) {
				Editora editora0 = new Editora();
				editora0.setIdEditora(resultado1.getLong("ideditora"));
				editora0.setNome(resultado1.getString("nome"));
				editora0.setEmai(resultado1.getString("Email"));

				editoras.add(editora0);

			}

			conn1.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return editoras;
	}

	public static Editora buscareditora(long id) {

		Editora editora = new Editora();

		Connection conn = connection.conexao();
		try {
			String sql = "SELECT * FROM Editora WHERE idEditora = ?";

			PreparedStatement preparedStatement = conn.prepareStatement(sql);

			preparedStatement.setLong(1, id);
			ResultSet resultado = preparedStatement.executeQuery();

			resultado.next();
			editora.setIdEditora(resultado.getLong("ideditora"));
			editora.setNome(resultado.getString("nome"));
			editora.setEmai(resultado.getString("Email"));

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return editora;
	}

}
