package pessoa;

import javax.swing.JOptionPane;

public class Pessoa {
	
	private String nome;
	private String sobrenome;
	private int AnoDeNascimento;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getAnoDeNascimento() {
		return AnoDeNascimento;
	}

	public void setAnoDeNascimento(int anoDeNascimento) {
		AnoDeNascimento = anoDeNascimento;
	}

	public String juntaNome() {
		return this.nome + "" + this.sobrenome;
	}
	
	public void idadePessoa() {
		int idade = 2023 - this.AnoDeNascimento;
		JOptionPane.showMessageDialog(null, "idade de " + juntaNome() + "" + idade);
		
	}
}
