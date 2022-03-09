package AvaliacaoC2;
import java.util.ArrayList;
public class AppVeiculo_corrigido {
    public static void main(String[] args) {
        ArrayList<Veiculo> catalogo = new ArrayList<>();
        
        Motor motor1 = new Motor(8, 600);
        catalogo.add(new Caminhao(motor1, 300000, 12, 4, 15));
        Motor motor2 = new Motor(12, 800);
        catalogo.add(new Caminhao(motor2, 500000, 4, 6, 12));
        Motor motor3 = new Motor(8, 400);
        catalogo.add(new Caminhao(motor3, 200000, 6, 3, 10));
        Motor motor4 = new Motor(10, 1000);
        catalogo.add(new Caminhao(motor4, 760000, 20, 10, 25));
        
        Motor motor5 = new Motor(4, 85);
        catalogo.add(new Carro(motor5, 32500, "Corsa", "Chevrolet"));
        Motor motor6 = new Motor(3, 100);
        catalogo.add(new Carro(motor6, 58700, "Ka", "Ford"));
        Motor motor7 = new Motor(6, 150);
        catalogo.add(new Carro(motor7, 240000, "Azzera", "Hyundai"));
        
        ImprimirCaminhao(catalogo);
        ImprimirCarro(catalogo);
    }

    public static void ImprimirCaminhao(ArrayList<Veiculo> catalogo){        
        for (int i=0; i<catalogo.size(); i++){
            if (catalogo.get(i).getClass() == Caminhao.class){
                Caminhao cam = (Caminhao)catalogo.get(i);
                if (cam.getCarga() <= 6){
                    System.out.println(cam.toString());
                }
            }
        }        
    }

    public static void ImprimirCarro(ArrayList<Veiculo> catalogo){        
        for (int i=0; i<catalogo.size(); i++){
            if (catalogo.get(i).getClass() == Carro.class){
            // para usar o preco, deve usar polimorfismo, ou seja,
            // NAO PRECISA FAZER O CASTING
                Carro car = (Carro)catalogo.get(i);
                if (catalogo.get(i).getPreco() <= 80000){
                    System.out.println(car.toString());
                }
            }
        }        
    }
}
