package Model;

import java.util.List;

import DAO.EditoraDAO0;

public class Principal13062 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Editora ed = new Editora();
		EditoraDAO0 edDAO = new EditoraDAO0();
//		
//		ed.setNome ("tec");
//		ed.setEmai ("tec@gmail.com");
//		
		edDAO.salvarEditora(ed);
//		
//		List<Editora> editoras = edDAO.listarEditora();
//		
//		for (Editora editora : editoras) {
//			System.out.println(editora);
//			System.out.println("------------------------");
		
		Editora editora = edDAO.buscareditora(3L);
		
		System.out.println(editora);
	}
}