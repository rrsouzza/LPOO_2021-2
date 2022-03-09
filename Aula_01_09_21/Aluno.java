package Aula_01_09_21;

public class Aluno {	
	private String nome;
	private int matricula;
	private double nota1, nota2, media;
	
    public Aluno(){}

	public Aluno(String nome, int matricula, double nota1, double nota2) {
		this.nome = nome;
		this.matricula = matricula;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.setMedia();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	    this.setMedia();
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
		this.setMedia();
	}
	public double getMedia() {
		return media;
	}	
	private void setMedia () {
		this.media = (this.nota1+this.nota2)/2;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", matricula=" + 
				matricula + ", nota1=" + nota1 + ", nota2=" + 
				nota2 + ", media=" + media + "]";
	}

	public int compareTo (Aluno aluno) {
		return (this.nome.compareToIgnoreCase(aluno.getNome()));
	}	
}