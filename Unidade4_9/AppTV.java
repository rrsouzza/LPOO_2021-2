package Unidade4_9;
import java.util.Scanner;
public class AppTV {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        TV001 tvSimples = new TV001(110, 21);
        TV_SDX tvBoazuda = new TV_SDX(110, 42);    
        System.out.println(tvSimples.toString());
        System.out.println(tvBoazuda.toString());

        System.out.println("=============================================");
        tvSimples.Ligar();
        tvBoazuda.Ligar();
        System.out.println("Escolha um canal: ");
        tvSimples.mudaCanal(Integer.parseInt(sc.next()));
        System.out.println(tvSimples.toString());
        System.out.println(tvBoazuda.toString());

        System.out.println("=============================================");
        for (int i=0; i<5; i++){
            tvBoazuda.aumentaVolume();
        }
        System.out.println(tvSimples.toString());
        System.out.println(tvBoazuda.toString());
        
        System.out.println("=============================================");
        tvSimples.Desligar();
        System.out.println(tvSimples.toString());
        System.out.println(tvBoazuda.toString());

        System.out.println("=============================================");
        if (tvSimples.isLigado()){
            System.out.println("A TV Simples está ligada.");
            tvSimples.Desligar();
        }
        if (tvBoazuda.isLigado()){
            System.out.println("A TV Boazuda está ligada.\n");
            tvBoazuda.Desligar();
        }
        System.out.println(tvSimples.toString());
        System.out.println(tvBoazuda.toString());
    }
}