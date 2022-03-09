package Aula_01_09_21;
import java.util.ArrayList;
public class ArrayLista {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        for (int i=0; i<5; i++){
            numeros.add(i+1);
        }
        System.out.println("\n " +numeros.toString()+ "\n");

        for (int i=0; i<numeros.size(); i++){
            if (numeros.get(i) % 2 == 0){
                numeros.remove(i);
            }
        }
        System.out.println("\n " +numeros.toString()+ "\n");
    }
}