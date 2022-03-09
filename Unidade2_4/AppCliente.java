package Unidade2_4;
import java.util.Scanner;
public class AppCliente {
    public static int opcao;    
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {        
        Cliente operar = new Cliente();
        LCCliente operarLC = new LCCliente();
        LCCliente.IniciarLista(10);
        do{
            System.out.println("1- Gerar senha\n" +
                               "2- Atendimento\n" +
                               "3- Sair");
            opcao = Integer.parseInt(sc.nextLine());
            switch (opcao){
                case 1:
                    System.out.println("Insira seu nome:");
                    String nome = sc.nextLine();                    
                    operarLC.EntrarNaFila(new Cliente(nome));
                    break;
                case 2:
                    int proximaSenha = operar.Proximo();
                    if (operarLC.ProximoAtendimento(proximaSenha) == 1){
                        System.out.println("O próximo cliente a ser atendido é o(a) " +
                                            LCCliente.listaClientes[proximaSenha].getNome() +
                                            ", de senha " +
                                            LCCliente.listaClientes[proximaSenha].getSenha() +
                                            ".");
                        operarLC.SairDaFila(proximaSenha);
                        break;
                    }else if (operarLC.ProximoAtendimento(proximaSenha) == 0){
                        System.out.println("A senha informada não foi encontrada na fila.");
                        break;
                    }else{
                        System.out.println("Ocorreu um erro não previsto.");
                        break;
                    }
                case 3:
                    System.out.println("Obrigado por utilizar o programa!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }while (opcao != 3);        
    }    
}