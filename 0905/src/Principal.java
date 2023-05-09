import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		Aluno al = new Aluno();
		System.out.println("Informe o nome do aluno :");
		al.setNome(sc.next());
		
		System.out.println("informe a idade do aluno :");
		al.setIdade(sc.nextInt());
		
		System.out.println("informe a faculdade do aluno :");
		al.setFaculdade(sc.next());
		
		System.out.println("quantas disciplinas ira informar :");
		int qtdDisciplinas = sc.nextInt();
		
		for (int i = 1; i <= qtdDisciplinas; i++) {
			
			System.out.println("informe a disciplina" + i + ":" );
			String disc = sc.next();
			System.out.println("informe a nota" + i + ":" );
			double nota = sc.nextDouble();
			disciplina disciplina = new disciplina();
			disciplina.setDisciplina(disc);
			disciplina.setNota(nota);
			al.getDisciplinas().add(disciplina);
		}
		System.out.println("media do aluno :" + al.calcluarMedia());
		System.out.println("situaçao do aluno :" + al.situacaoAluno());
		
		sc.close();
	}

}
