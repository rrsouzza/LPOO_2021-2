package Unidade4_10_1;
import java.util.Scanner;
public class App {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ElementoGeometrico[] figuras = new ElementoGeometrico[6];
        
        double[] figura0pontoA = {3,4};
        double[] figura0pontoB = {6,6};
        figuras[0] = new Retangulo(figura0pontoA, figura0pontoB, 2, 3);

        double[] figura1pontoA = {9,3};
        double[] figura1pontoB = {14,5};
        figuras[1] = new Retangulo(figura1pontoA, figura1pontoB, 2, 5);
        
        double[] figura2pontoA = {3,2};
        double[] figura2pontoB = {2,2};
        figuras[2] = new Circulo(figura2pontoA, figura2pontoB);
        
        double[] figura3pontoA = {10,8};
        double[] figura3pontoB = {7,8};
        figuras[3] = new Circulo(figura3pontoA, figura3pontoB);
        
        double[] figura4pontoA = {-5,0};
        double[] figura4pontoB = {-2,3};
        figuras[4] = new Quadrado(figura4pontoA, figura4pontoB, 3, 0);
        
        double[] figura5pontoA = {4,-7};
        double[] figura5pontoB = {9,-2};
        figuras[5] = new Quadrado(figura5pontoA, figura5pontoB, 5, 0);

        for(int i=0; i<6; i++){
            System.out.println(figuras[i].toString());
        }




        

    }
}