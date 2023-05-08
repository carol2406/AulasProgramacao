package pessoa;

import javax.swing.JOptionPane;
import pessoa.Pessoa;

public class attPessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa pessoa = new Pessoa(); 
		
		pessoa.nome = JOptionPane.showInputDialog("digite seu nome");
		pessoa.sobrenome = JOptionPane.showInputDialog("digite seu sobrenome");
		pessoa.AnoDeNascimento = Integer.parseInt(JOptionPane.showInputDialog("digite seu ano de nascimento"));
		
		System.out.println(pessoa.juntaNome());
		
		JOptionPane.showMessageDialog(null, "nome completo : " + pessoa.juntaNome());
		
		pessoa.juntaNome();
	}

}
