package Unidade4_6_2;
public class Cachorro extends Animal{
    public Cachorro(String nome, String raca){
        super(nome, raca);
    }
    
    public String Caminha(){        
        return  getNome() + " está correndo.";
    }

    public String Late(){
        return "Au Au";
    }
}