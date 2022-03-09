package AvaliacaoC1;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class ListaInteiros {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Random rand = new Random();
        
        ArrayList<Integer> numerosInteiros = new ArrayList<Integer>();
        for (int i=0; i<10; i++){
            numerosInteiros.add(rand.nextInt(10) + 1);
        }
        ListaInteiros.ImprimirList(numerosInteiros);

        System.out.println("Insira um número inteiro:");
        int num = Integer.parseInt(sc.nextLine());
        ListaInteiros.SortList(numerosInteiros, num);
    }
    
    public static void ImprimirList(ArrayList<Integer> listaInteiros){
        System.out.println(listaInteiros);
    }

    public static void SortList(ArrayList<Integer> listaInteiros, int numParam){
        for (int y=0; y<listaInteiros.size(); y++){
            for (int i=0; i<listaInteiros.size(); i++){
                if (listaInteiros.get(i) >= numParam){
                    listaInteiros.remove(i);
                }
            }
        }
        System.out.println(listaInteiros);
    }
}