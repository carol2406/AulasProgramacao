package Model;

import DAO.EditoraDAO;

public class Principal1306 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Editora ed = new Editora();
		EditoraDAO edDAO = new EditoraDAO();
		
		ed.setNome("tec");
		ed.setEmai("tec@gmail.com");
		
		edDAO.salvarEditora(ed);
	}

}
