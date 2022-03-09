package Unidade4_6_1;
import java.util.ArrayList;
import java.util.Random;
import java.util.Calendar;
import StringGenerator.StringGenerator;
public class App {    
    static Random rand = new Random();
    
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        ArrayList<Pessoa> catalogo = new ArrayList<Pessoa>();    
        for (int i=0; i<5; i++){            
            int ano = rand.nextInt(2021);
            int mes = rand.nextInt(11) + 1;
            int dia = rand.nextInt(30) + 1;
            cal.set(ano, mes, dia);

            char sexo;
            if (rand.nextInt(2) == 0){
                sexo = 'M';
            }else{
                sexo = 'F';
            }

            if (rand.nextInt(2) == 0){
                catalogo.add(new Pessoa(StringGenerator.Gerador(), sexo, rand.nextInt(100)));
            }else{
                catalogo.add(new Amigo(StringGenerator.Gerador(), sexo, rand.nextInt(100), cal.getTime()));
            }
        }

        for (int i=0; i<catalogo.size(); i++){
           if (catalogo.get(i).getClass() == Amigo.class){
                System.out.println(catalogo.get(i).toString());        
           }
        }
    }
}