package Unidade4_6_1;
public class Pessoa {
    private String nome;
    private char sexo;
    private int idade;

    public Pessoa(){}    
    public Pessoa(String nome, char sexo, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public char getSexo() {
        return this.sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public int getIdade() {
        return this.idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }   

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", sexo='" + getSexo() + "'" +
            ", idade='" + getIdade() + "'" +
            "}";
    }
}