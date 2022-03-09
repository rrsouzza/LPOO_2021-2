package Unidade4_8_1;
import java.util.Scanner;
public class App {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        TV televisao = new TV(110, 29);
        Radio radio = new Radio(110);
        Maquina_de_lavar lavadeira = new Maquina_de_lavar(110);

        System.out.println(televisao.toString()); 
        System.out.println(radio.toString());
        System.out.println(lavadeira.toString());

        System.out.println("=========================================================");
        
        televisao.Ligar();
        radio.Ligar();
        lavadeira.Ligar();
        System.out.println("LIGAR TUDO");

        System.out.println("=========================================================");

        System.out.println(televisao.toString()); 
        System.out.println(radio.toString());
        System.out.println(lavadeira.toString());

        System.out.println("=========================================================");

        radio.setVolume(15);
        radio.setSintonia(101.5);
        radio.setVoltagem(220);
        System.out.println(radio.toString());
        
        System.out.println("=========================================================");

        televisao.setCanal(12);
        System.out.println(televisao.toString());

        System.out.println("=========================================================");

        System.out.println(televisao.toString()); 
        System.out.println(radio.toString());
        System.out.println(lavadeira.toString());

        System.out.println("=========================================================");

        lavadeira.Desligar();
        System.out.println(lavadeira.toString());

        System.out.println("=========================================================");
    }
}