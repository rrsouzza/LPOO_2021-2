package ExercicioAvaliativo_C1_2;
import java.util.Scanner;
import java.util.LinkedList;
public class App {
    static Scanner sc = new Scanner(System.in);        ;
    public static void main(String[] args) {        
        LinkedList<Integer> filaLocal = new LinkedList<Integer>();
        LinkedList<Integer> pilhaLocal = new LinkedList<Integer>();        
        FilaInteiro objFila = new FilaInteiro(filaLocal);
        PilhaInteiro objPilha = new PilhaInteiro(pilhaLocal);
        int valor;
        do{
            System.out.println("Para sair, insira 0.\n Insira um valor para armazenar: ");
            valor = sc.nextInt();
            if (valor != 0){
                if (valor % 2 == 0){
                    objPilha.Push(valor);
                }else{
                    objFila.Enqueue(valor);
                }    
            }            
        }while (valor != 0);
        
        if (objPilha.EmptyCheck() != true){
            System.out.println("Último da pilha: " +objPilha.UltimoPilha());
        }else{
            System.out.println("A pilha está vazia!");
        }

        if (objFila.EmptyCheck() != true){
            System.out.println("Primeiro da fila: " +objFila.filaFirst());
        }else{
            System.out.println("A fila está vazia!");
        }        
    }
}