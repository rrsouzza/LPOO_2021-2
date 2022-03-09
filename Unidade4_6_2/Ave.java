package Unidade4_6_2;
public class Ave extends Animal{
    public Ave(String nome, String raca){
        super(nome, raca);
    }
    
    public String Caminha(){
        return getNome() + " está voando.";
    }

    public String Canta(){
        return "Canta";
    }
}