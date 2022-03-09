package Unidade4_3_5;
import java.util.Scanner;
import java.util.ArrayList;
public class Concessionaria {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {        
        ArrayList <Automovel> catalogo = new ArrayList<Automovel>();
        String modelo, cor;
        int opcao = 0, combustivel;
        boolean registrar = true, retrovisor, limpador, radio, direcao, cambio, vidro;
        do{
            System.out.println("Qual o modelo do veículo?");
            modelo = sc.nextLine();
            System.out.println("Qual a cor do veículo?");
            cor = sc.nextLine();
            do{
                System.out.println("Qual o tipo de combustível do veículo?");
                System.out.println("1- Gasolina\n2- Flex\n3- Diesel\n4- Gás");
                opcao = Integer.parseInt(sc.nextLine());
            }while((opcao != 1) && (opcao != 2) && (opcao !=3 ) && (opcao != 4));
            combustivel = opcao;
            opcao = 0;

            do{
                System.out.println("O veículo possui Retrovisor do Passageiro?");
                System.out.println("1- SIM\n2- NÃO");
                opcao = Integer.parseInt(sc.nextLine());
            }while ((opcao != 1) && (opcao != 2));
            retrovisor = BooleanSorter(opcao);
            opcao = 0;

            do{
                System.out.println("O veículo possui Limpador Traseiro?");
                System.out.println("1- SIM\n2- NÃO");
                opcao = Integer.parseInt(sc.nextLine());
            }while ((opcao != 1) && (opcao != 2));
            limpador = BooleanSorter(opcao);
            opcao = 0;

            do{
                System.out.println("O veículo possui Radio AM/FM?");
                System.out.println("1- SIM\n2- NÃO");
                opcao = Integer.parseInt(sc.nextLine());
            }while ((opcao != 1) && (opcao != 2));
            radio = BooleanSorter(opcao);
            opcao = 0;            
            
            do{
                System.out.println("O veículo possui Direção Hidráulica?");
                System.out.println("1- SIM\n2- NÃO");
                opcao = Integer.parseInt(sc.nextLine());
            }while ((opcao != 1) && (opcao != 2));
            direcao = BooleanSorter(opcao);
            opcao = 0;

            do{
                System.out.println("O veículo possui Câmbio Automático?");
                System.out.println("1- SIM\n2- NÃO");
                opcao = Integer.parseInt(sc.nextLine());
            }while ((opcao != 1) && (opcao != 2));
            cambio = BooleanSorter(opcao);
            opcao = 0;

            do{
                System.out.println("O veículo possui Vidro e Trava Elétricos?");
                System.out.println("1- SIM\n2- NÃO");
                opcao = Integer.parseInt(sc.nextLine());
            }while ((opcao != 1) && (opcao != 2));
            vidro = BooleanSorter(opcao);
            opcao = 0;
            ///////////////////////////////////
            if ((direcao) || (cambio) || (vidro)){
                catalogo.add(new AutomovelDeLuxo(modelo, cor, combustivel, retrovisor, limpador, radio, direcao, cambio, vidro));                
            }else{
                if ((retrovisor) || (limpador) || (radio)){
                    catalogo.add(new AutomovelBasico(modelo, cor, combustivel, retrovisor, limpador, radio));
                }else{
                    catalogo.add(new Automovel(modelo, cor, combustivel));
                }
            }
            System.out.println(catalogo.get(catalogo.size()-1).toString());
            do{
                System.out.println("Gostaria de registrar outro veículo?");
                System.out.println("1- SIM\n2- NÃO");
                opcao = Integer.parseInt(sc.nextLine());
            }while ((opcao != 1) && (opcao != 2));
            registrar = BooleanSorter(opcao);
        }while(registrar == true);
        System.out.println(catalogo.toString());
    }   
    
    public static boolean BooleanSorter(int valor){        
        switch (valor){
            case 1:
                return true;
            case 2:
                return false;
            default:
                System.out.println("Erro.");
                return false;
        }        
    }
}