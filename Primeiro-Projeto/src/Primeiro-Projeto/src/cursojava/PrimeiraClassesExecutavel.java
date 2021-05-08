package cursojava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import crusojava.constantes.StatusAluno;
import cursojava.java.Aluno;
import cursojava.java.Disciplina;

public class PrimeiraClassesExecutavel {

	public static void main(String[] args) {
		
		try {
		
		String login = JOptionPane.showInputDialog("Informe o Login");
		String senha = JOptionPane.showInputDialog("Informe a senha");

		if(login.equalsIgnoreCase("admin") &&
				senha.equalsIgnoreCase("admin")) {
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
		
	
		
		for (int qtd =1; qtd <=2; qtd++) {
		
		String nome =JOptionPane.showInputDialog("Qual o nome "+qtd+" ?");
		/*String idade =JOptionPane.showInputDialog("Qual a idade "+qtd+" ?");
		String nascimento =JOptionPane.showInputDialog("Qual data de Nascimento ?");
		String rg =JOptionPane.showInputDialog("Qual o RG ?");
		String cpf =JOptionPane.showInputDialog("qula o CPF ?");
		String mae =JOptionPane.showInputDialog("Nome Mãe ?");
		String pai =JOptionPane.showInputDialog("Nome Pai ?");
		String matricula =JOptionPane.showInputDialog("Data da Matricula ?");
		String serie =JOptionPane.showInputDialog("Qual a Seríe ?");
		String escola =JOptionPane.showInputDialog("Nome da Escola ?");*/
		
			Aluno aluno = new Aluno();
			
			aluno.setNome(nome);
			/*aluno.setIdade(Integer.valueOf(idade));
			aluno.setDataNascimento(nascimento);
			aluno.setRegistroGeral(rg);
			aluno.setNumeroCpf(cpf);
			aluno.setNomeMae(mae);
			aluno.setNomePai(pai);
			aluno.setDataMatricula(matricula);
			aluno.setSerieMatriculado(serie);
			aluno.setNomeEscola(escola);*/
		
		for (int pos = 1; pos <= 4; pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Qual a Disciplina "+pos+" ?");
			String notaDisciplina = JOptionPane.showInputDialog("nota da Disciplina "+pos+" ?");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			//disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno.getDisciplinas().add(disciplina);
		}
		
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover Alguma Disciplina ?");
		
		if (escolha ==0) {
			
			int continuarRemover =0;
			
			int posicao =1;
			
			while (continuarRemover ==0) {
			
			String disciplinaRemover = JOptionPane.showInputDialog("Qual disciplina 1 ,2 , 3 ou 4 ?");
			aluno.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue()-posicao);
			posicao++;
			continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a Remover ?");
			}
		}
		alunos.add(aluno);
	    }
		
		maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
		maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
		
	for (Aluno aluno : alunos) {/*lista classificação de alunos*/
		
		if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
			maps.get(StatusAluno.APROVADO).add(aluno);
		}else
			if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				maps.get(StatusAluno.RECUPERACAO).add(aluno);
				}else {
				maps.get(StatusAluno.REPROVADO).add(aluno);
			}
		
	}
	
	System.out.println("----------------------------Aprovados--------------------------");
	for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
		System.out.println("Resultado = " + 
	aluno.getNome()+ " " +aluno.getAlunoAprovado2() + " Media = " + aluno.getMediaNota());
	}
	System.out.println("----------------------------Recuperação--------------------------");
	for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
		System.out.println("Resultado = " +
	aluno.getNome()+ " " +aluno.getAlunoAprovado2() + " Media = " + aluno.getMediaNota());
	}
	System.out.println("----------------------------Reprovados--------------------------");
	for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
		System.out.println("Resultado = " +
	aluno.getNome()+ " " + aluno.getAlunoAprovado2() + " Media = " + aluno.getMediaNota());
	}
	}
	
		}catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "ERRO ao processar");
		}
		
	}
	
	}



