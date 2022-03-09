package Unidade4_10_2;
import java.util.Scanner;
public class App {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int opcao = 0;
        DespesaTotal desTot = new DespesaTotal();
        do{
            System.out.println("=============================");
            System.out.println("1 - Cadastrar Despesa");
            System.out.println("2 - Extornar");
            System.out.println("3 - Total Parcial");
            System.out.println("4 - Totalizar");
            System.out.println("5 - Sair");
            opcao = Integer.parseInt(sc.nextLine());

            switch(opcao){
                case 1:                    
                    desTot.Acrescenta(Texto());
                    break;
                case 2:                    
                    desTot.Extorna(Texto());
                    break;
                case 3:
                    int[] inteiros = DiaMes();
                    DespesaTotal dTot = desTot.Get(inteiros[0], inteiros[1]);                    
                    System.out.println(dTot.toString());                    
                    break;
                case 4:
                    int escolha = 0;
                    Loop:
                    do{
                        System.out.println("Gostaria de ver todos os registros ou apenas o valor total?");
                        System.out.println("1 - Todos os registros");
                        System.out.println("2 - Apenas o valor total");
                        System.out.println("3 - Retornar ao Menu Principal");
                        escolha = Integer.parseInt(sc.nextLine());
                        switch(escolha){
                            case 1:
                                System.out.println(desTot.toString());
                                break Loop;
                            case 2:
                                System.out.println("=============================");
                                System.out.println("O valor total de todos os registros é: R$" +desTot.Totaliza());                                
                                break Loop;
                            case 3:
                                break Loop;
                            default:
                                System.out.println("Opção inválida.");
                        }                        
                    }while ((escolha != 1) && (escolha != 2) && (escolha != 3));
                    break;
                case 5:
                    System.out.println("Obrigado por utilizar o programa.");
                    break;
                default:
                    System.out.println("Opção inválida.");                    
            }
        }while (opcao != 5);
    }
    
    public static int[] DiaMes(){
        int[] inteiros = new int[2];
        System.out.println("=============================");
        System.out.println("Qual o dia da despesa?");
        inteiros[0] = Integer.parseInt(sc.nextLine());
        System.out.println("Qual o mês da despesa?");
        inteiros[1] = Integer.parseInt(sc.nextLine());
        return inteiros;
    }
    
    public static DespesaDia Texto(){
        int[] inteiros = DiaMes();
        System.out.println("Qual o valor da despesa?");
        double valor = Double.parseDouble(sc.nextLine());        
        return new DespesaDia(inteiros[0], inteiros[1], valor);
    }
}