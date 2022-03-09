package Unidade4_6_2;
public class Animal{
    private String nome;
    private String raca;

    public Animal(){}
    public Animal(String nome, String raca){
        this.nome = nome;
        this.raca = raca;
    }

    public String Caminha(){
        return nome + " está caminhando.";
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getRaca() {
        return this.raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }    
}