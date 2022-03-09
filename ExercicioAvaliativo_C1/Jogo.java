package ExercicioAvaliativo_C1;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class Jogo {    
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Alvo> listaAlvos = new ArrayList<Alvo>();  //Lista global, por isso declarada fora do método principal
    public static void main(String[] args) {        
        Alvo operar = new Alvo();
        int[] coordenadas = new int[2];
        for (int i=0; i<15; i++){
            coordenadas = GerarCoordenadaAlvo();
            if (i < 12){
                listaAlvos.add(new Alvo(coordenadas[0], coordenadas[1], 'P'));
            }else if (i >= 12){
                listaAlvos.add(new Alvo(coordenadas[0], coordenadas[1], 'B'));
            }
        }
        System.out.println(listaAlvos);

        System.out.println("Você tem direito a 10 tiros. Vamos começar:");
        int tirosRestantes = 10;
        int tirox, tiroy;
        do{
            System.out.println("Insira a coordenada X do seu tiro:");
            tirox = Integer.parseInt(sc.nextLine());
            System.out.println("Insira a coordenada Y do seu tiro:");
            tiroy = Integer.parseInt(sc.nextLine());
            tirosRestantes--;
            TesteVetor:
            for (int i=0; i<listaAlvos.size();i++){
                if (listaAlvos.get(i).Atira(tirox, tiroy) == 'P'){
                    coordenadas = GerarCoordenadaAlvo();
                    listaAlvos.set(i, new Alvo(coordenadas[0], coordenadas[1], 'P'));
                    System.out.println("Você acertou um alvo PRETO!");
                    if (operar.getVida() > 0){
                        System.out.println("Você precisa acertar mais " +operar.getVida()+ " alvos para ganhar.");
                    }                    
                    break TesteVetor;
                }else if(listaAlvos.get(i).Atira(tirox, tiroy) == 'B'){
                    Alvo.vida--;
                    listaAlvos.remove(i);
                    System.out.println("Você acertou um alvo BRANCO!");
                    if (operar.getVida() > 0){
                        System.out.println("Você precisa acertar mais " +operar.getVida()+ " alvos para ganhar.");
                    }
                    break TesteVetor;
                }else if(i == listaAlvos.size()-1){
                    System.out.println("Você não acertou nenhum alvo.");
                    System.out.println("Você precisa acertar mais " +operar.getVida()+ " alvos para ganhar.");
                }
            }
            if (operar.getVida() > 0){
                System.out.println("Você tem " +tirosRestantes+ " tiros restantes.");
            }
        }while ((tirosRestantes > 0) && (operar.getVida() > 0));
        if (operar.getVida() == 0){
            System.out.println("Você VENCEU! Parabéns, você acertou 3 alvos.");
        }else if ((operar.getVida() > 0) && (tirosRestantes == 0)){
            System.out.println("GAME OVER. Acabaram seus tiros.");
        }
    }

    public static int[] GerarCoordenadaAlvo(){
        Random rand = new Random();
        for (;;){
            boolean coordDisponivel = true;
            int coordx = rand.nextInt(5) + 1;
            int coordy = rand.nextInt(5) + 1;
            if (!listaAlvos.isEmpty()){
                for (int z=0; z<listaAlvos.size(); z++){
                    if ((listaAlvos.get(z).getPosX() == coordx) && (listaAlvos.get(z).getPosY() == coordy)){
                        coordDisponivel = false;
                        break;
                    }
                }
            }else{
                coordDisponivel = true;
            }
            if (coordDisponivel == true){
                int[] coordNovas = {coordx, coordy};
                return coordNovas;
            }
        }
    }
}