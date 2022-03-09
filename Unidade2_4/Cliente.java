package Unidade2_4;
public class Cliente {
    public static int senhaGeral = 0;
    public static int contador = 1;
    private int senha;
    private String nome;

    public Cliente(){}

    public Cliente (String nome){
        this.nome = nome;
        this.senha = contador;
        contador++;      
    }

    public int GerarSenhaNova(){
        int senha = contador;
        contador++;
        return senha;
    }
    
    public int Proximo(){
        if (senhaGeral < 999){
            senhaGeral++;
            return senhaGeral;
        }else{
            senhaGeral = 1;
            return senhaGeral;
        }
    }

    public int getSenhaGeral(){
        return Cliente.senhaGeral;
    }    
    public int getSenha() {
        return this.senha;
    }
    public void setSenha(int senha) {
        this.senha = senha;
    }
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "{" +
            " senha='" + getSenha() + "'" +
            ", nome='" + getNome() + "'" +
            "}";
    }
}