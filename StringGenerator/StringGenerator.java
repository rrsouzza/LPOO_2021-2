package StringGenerator;
import java.util.Random;
public class StringGenerator {
    static Random rand = new Random();     
    public StringGenerator(){};
    
    public static String Gerador(){
        String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; //26
        String palavra = new String();
        int numero;
        for (int i=0; i<26; i++){
            numero = rand.nextInt(25);
            char letraSorteada = alfabeto.charAt(numero);
            palavra += letraSorteada;
        }
        return palavra;
    }
}