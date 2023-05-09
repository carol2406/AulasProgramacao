import java.util.ArrayList;
import java.util.List;

public class Aluno {
	
	private String nome;
	private int idade;
	private String faculdade;
	
	List<disciplina> disciplinas = new ArrayList<disciplina>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getFaculdade() {
		return faculdade;
	}

	public void setFaculdade(String faculdade) {
		this.faculdade = faculdade;
	}

	public List<disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<disciplina> disciplinas) {
		this.disciplinas = disciplinas;
		
	}
	
	public double calcluarMedia() {
		double somaNotas = 0.0;
		for (disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getNotas();
		}
		return somaNotas / disciplinas.size();
	}
	public String situacaoAluno() {
	String situaçao;
	String situacao;
	if (calcluarMedia() >= 70) {
		situacao = "aprovado";
				
	}else { 
		situacao = "reprovado";
		
	}
	return situacao;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", faculdade=" + faculdade + ", disciplinas=" + disciplinas
				+ "]";
	}
	
	
	
}
