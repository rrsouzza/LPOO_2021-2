package Unidade2_3;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Calculadora {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Conversor operar = new Conversor();
        DecimalFormat df = new DecimalFormat();
        for (;;){
            System.out.println("Escolha uma opção de conversão:");
            System.out.println("1- Km para Milhas");
            System.out.println("2- Milhas para Km");
            System.out.println("3- Pés para Cm");
            System.out.println("4- Cm para Pés");
            System.out.println("5- Polegadas para Cm");
            System.out.println("6- Cm para Polegadas");
            System.out.println("7- Encerrar Programa");
            int escolha = Integer.parseInt(sc.nextLine());
            System.out.println("Insira um número para converter:");
            double numero = Double.parseDouble(sc.nextLine());
            if (escolha == 1){
                System.out.println(numero + " km equivale a " +df.format(operar.KmMilha(numero))+ " milhas.");
                System.out.println("------------------------------------------------------------------------------------------");
            }else if (escolha == 2){
                System.out.println(numero + " milhas equivale a " +df.format(operar.MilhaKm(numero))+ " quilômetros.");
                System.out.println("------------------------------------------------------------------------------------------");
            }else if (escolha == 3){
                System.out.println(numero + " pés equivale a " +df.format(operar.PesCm(numero))+ " centímetros.");
                System.out.println("------------------------------------------------------------------------------------------");
            }else if (escolha == 4){
                System.out.println(numero + " cm equivale a " +df.format(operar.CmPes(numero))+ " pés.");
                System.out.println("------------------------------------------------------------------------------------------");
            }else if (escolha == 5){
                System.out.println(numero + " polegadas equivale a " +df.format(operar.PolegadaCm(numero))+ " centímetros.");
                System.out.println("------------------------------------------------------------------------------------------");
            }else if (escolha == 6){
                System.out.println(numero + " cm equivale a " +df.format(operar.CmPolegada(numero))+ " polegadas.");
                System.out.println("------------------------------------------------------------------------------------------");
            }else if (escolha == 7){
                System.out.println("Obrigado por utilizar nossa calculadora!");
                break;
            }else{
                System.out.println("Opção inválida. Tente novamente.");
                System.out.println("------------------------------------------------------------------------------------------");
            }
        }
    }
}