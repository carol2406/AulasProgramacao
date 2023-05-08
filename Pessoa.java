package pessoa;

import javax.swing.JOptionPane;

public class Pessoa {
	
	public String nome;
	public String sobrenome;
	public int AnoDeNascimento;
	
	public String juntaNome() {
		return this.nome + "" + this.sobrenome;
	}
	
	public void idadePessoa() {
		int idade = 2023 - this.AnoDeNascimento;
		JOptionPane.showMessageDialog(null, "idade de " + juntaNome() + "" + idade);
		
	}
}
