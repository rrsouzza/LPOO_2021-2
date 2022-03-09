package Unidade4_6_2;
public class Gato extends Animal{
    public Gato(String nome, String raca){
        super(nome, raca);
    }
    
    public String Caminha(){
        return getNome() + " está saltando.";
    }

    public String Mia(){
        return "Miau";
    }
}