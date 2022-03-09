package Unidade4_6_2;
import java.util.Random;
import java.util.ArrayList;
public class AppZoologico {
    public static void main(String[] args) {
        Random rand = new Random();
        String[] nomes = {"Lavina", "Bailey", "Vergil", "Everitt", "Juniper", "Eldon", "Odell", "Robina", "Saffron", "Farley"};
        String[] racas = {"Raca1", "Raca2", "Raca3", "Raca4", "Raca5"};
        ArrayList<Animal> animais = new ArrayList<Animal>();

        for (int i=0; i<5; i++){
            //Nome
            String nomeSorteio = nomes[rand.nextInt(10)];
            //Raça
            String racaSorteio = racas[rand.nextInt(5)];
            //Classe
            int randNum = rand.nextInt(4);
            System.out.println(randNum);
            switch(randNum){
                case 0:
                    animais.add(new Animal(nomeSorteio, racaSorteio));
                    break;
                case 1:
                    animais.add(new Cachorro(nomeSorteio, racaSorteio));
                    break;
                case 2:
                    animais.add(new Gato(nomeSorteio, racaSorteio));
                    break;
                case 3:
                    animais.add(new Ave(nomeSorteio, racaSorteio));
                    break;
                default:
                    System.out.println("Ocorreu um problema.");
            }
        }

        for (int i=0; i<5; i++){
            System.out.println(animais.get(i).Caminha());
            if (animais.get(i) instanceof Cachorro){
                Cachorro dog = (Cachorro) animais.get(i);
                System.out.println(dog.Late());
            }else if (animais.get(i) instanceof Gato){
                Gato cat = (Gato) animais.get(i);
                System.out.println(cat.Mia());
            }/* else if (animais.get(i) instanceof Ave){
                Ave bird = (Ave) animais.get(i);
                System.out.println(bird.Canta());
            }*/
            System.out.println("-------------------------------------");
        }
    }
}