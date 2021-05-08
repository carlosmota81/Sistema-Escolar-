package cursojava;

import javax.swing.JOptionPane;

import cursojava.java.Aluno;
import cursojava.java.Disciplina;

public class ArrayVetor {

	public static void main(String[] args) {
		
		double [] notas = {8.8 , 9.5 , 7.6 , 6.9};
		double [] notasLogica = {8.5 , 9.7 , 6.9 , 8.6};
		
	Aluno aluno = new Aluno();
	aluno.setNome("carlos");
	aluno.setNomeEscola("cruzeiro so sul");

	Disciplina disciplina = new Disciplina();
	disciplina.setDisciplina("Curso Java");
	disciplina.setNota(notas);
	aluno.getDisciplinas().add(disciplina);
	
	
	
	Disciplina disciplina2 = new Disciplina();
	disciplina2.setDisciplina("Logica");
	disciplina2.setNota(notasLogica);
	aluno.getDisciplinas().add(disciplina2);
	
	
	Aluno [] arrayAlunos = new Aluno[1];
	
	arrayAlunos [0] = aluno;
	
	for(int pos=0; pos < arrayAlunos.length; pos++){
		
		System.out.println("Nome do Aluno = " + arrayAlunos[pos].getNome());
		
		for(Disciplina d : arrayAlunos[pos].getDisciplinas()) {
			System.out.println("Disciplinas = " + d.getDisciplina());
			
			for(int posnota = 0; posnota < d.getNota().length; posnota++) {
				System.out.println("As notas são : " + posnota + d.getNota()[posnota]);
			}
			
		}
		
	}
	
	
	
	
	
	
	}

}
