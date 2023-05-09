
public class disciplina {
	
	//Gerar os metodos Get e Set
		// Gerar o ToString

	private double nota;
	private String disciplina;
	
	
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	@Override
	public String toString() {
		return "disciplina [nota=" + nota + ", disciplina=" + disciplina + "]";
	}
	public double getNotas() {
		// TODO Auto-generated method stub
		return 0;
	}
		
	
}
