package cursojava.java;

import java.util.ArrayList;
import java.util.List;

import crusojava.constantes.StatusAluno;
import cursojava.java.Disciplina;

public class Aluno {
	
	private String nome;
	private int idade;
	private String registroGeral;
	private String numeroCpf;
	private String dataNascimento;
	private String dataMatricula;
	private String nomeMae;
	private String nomePai;
	private String serieMatriculado;
	private String nomeEscola;
	
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	
	
	
	public Aluno() {
	
	}
	
	
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


	public String getRegistroGeral() {
		return registroGeral;
	}


	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}


	public String getNumeroCpf() {
		return numeroCpf;
	}


	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}


	public String getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	public String getDataMatricula() {
		return dataMatricula;
	}


	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}


	public String getNomeMae() {
		return nomeMae;
	}


	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}


	public String getNomePai() {
		return nomePai;
	}


	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}


	public String getSerieMatriculado() {
		return serieMatriculado;
	}


	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}


	public String getNomeEscola() {
		return nomeEscola;
	}


	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}


	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}


	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataMatricula == null) ? 0 : dataMatricula.hashCode());
		result = prime * result + ((dataNascimento == null) ? 0 : dataNascimento.hashCode());
		result = prime * result + idade;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((nomeEscola == null) ? 0 : nomeEscola.hashCode());
		result = prime * result + ((nomeMae == null) ? 0 : nomeMae.hashCode());
		result = prime * result + ((nomePai == null) ? 0 : nomePai.hashCode());
		result = prime * result + ((numeroCpf == null) ? 0 : numeroCpf.hashCode());
		result = prime * result + ((registroGeral == null) ? 0 : registroGeral.hashCode());
		result = prime * result + ((serieMatriculado == null) ? 0 : serieMatriculado.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (dataMatricula == null) {
			if (other.dataMatricula != null)
				return false;
		} else if (!dataMatricula.equals(other.dataMatricula))
			return false;
		if (dataNascimento == null) {
			if (other.dataNascimento != null)
				return false;
		} else if (!dataNascimento.equals(other.dataNascimento))
			return false;
		if (idade != other.idade)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (nomeEscola == null) {
			if (other.nomeEscola != null)
				return false;
		} else if (!nomeEscola.equals(other.nomeEscola))
			return false;
		if (nomeMae == null) {
			if (other.nomeMae != null)
				return false;
		} else if (!nomeMae.equals(other.nomeMae))
			return false;
		if (nomePai == null) {
			if (other.nomePai != null)
				return false;
		} else if (!nomePai.equals(other.nomePai))
			return false;
		if (numeroCpf == null) {
			if (other.numeroCpf != null)
				return false;
		} else if (!numeroCpf.equals(other.numeroCpf))
			return false;
		if (registroGeral == null) {
			if (other.registroGeral != null)
				return false;
		} else if (!registroGeral.equals(other.registroGeral))
			return false;
		if (serieMatriculado == null) {
			if (other.serieMatriculado != null)
				return false;
		} else if (!serieMatriculado.equals(other.serieMatriculado))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", registroGeral=" + registroGeral + ", numeroCpf="
				+ numeroCpf + ", dataNascimento=" + dataNascimento + ", dataMatricula=" + dataMatricula + ", nomeMae="
				+ nomeMae + ", nomePai=" + nomePai + ", serieMatriculado=" + serieMatriculado + ", nomeEscola="
				+ nomeEscola + ", disciplinas=" + disciplinas + "]";
	}
	
	
	
	public double getMediaNota() {
		
		double somaNotas =0.0;
		
		for (Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getMediaNotas();
		}
		
		return somaNotas /disciplinas.size();
	}
	
	public boolean getAlunoAprovado() {
		double media = this.getMediaNota();
		if (media >= 70) {
			return true;
		}else {
			return false;
		}
	}
	public String getAlunoAprovado2() {
		double media = this.getMediaNota();
		if (media >= 50) {
			if(media>= 70) {
				return StatusAluno.APROVADO;
				
			}else {
				return StatusAluno.RECUPERACAO;
			}
		}else {
			return StatusAluno.REPROVADO;
		}
	}
	

}
