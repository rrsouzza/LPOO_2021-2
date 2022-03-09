package Unidade4_10_3;
import java.util.ArrayList;
import java.util.Scanner;
public class AppBanco {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Conta> banco = new ArrayList<Conta>();
    public static void main(String[] args) {        
        int opcao = 0, numConta = 0;
        int[] retorno = new int[2];
        String nomeCliente = null;
        boolean validar = false;
        do{
            validar = false;
            System.out.println("1 - Cadastrar Conta");
            System.out.println("2 - Saldo");
            System.out.println("3 - Saque");
            System.out.println("4 - Depósito");
            System.out.println("5 - Transferência");
            System.out.println("6 - Sair");

            opcao = Integer.parseInt(sc.nextLine());
            switch(opcao){
                case 1: //Cadastro
                    validar = false;
                    do{
                        System.out.println("Qual o número da conta a ser cadastrada?");
                        numConta = Integer.parseInt(sc.nextLine());
                        retorno = VerificarExistenciaConta(numConta);

                        if (retorno[0] == 1){
                            System.out.println("Essa conta já existe. Insira um número diferente.");
                            validar = false;
                        }else if (retorno[0] == 0){
                            System.out.println("Qual o nome do cliente?");
                            nomeCliente = sc.nextLine();

                            boolean validar2 = false;
                            do{
                                System.out.println("Essa é uma Conta Especial? \n1- SIM \n2- NÃO");
                                int escolha = Integer.parseInt(sc.nextLine());
                                if (escolha == 1){
                                    banco.add(new ContaEspecial(numConta, nomeCliente));
                                    System.out.println("Conta Especial aberta com sucesso.");
                                    validar2 = true;
                                }else if (escolha == 2){
                                    banco.add(new Conta(numConta, nomeCliente));
                                    System.out.println("Conta comum aberta com sucesso.");
                                    validar2 = true;
                                }else{
                                    System.out.println("Opção inválida. Tente novamente.");
                                    validar2 = false;
                                }
                            }while (validar2 == false);
                            validar = true;
                        }else{
                            System.out.println("Ocorreu algum erro inesperado.");
                        }
                    }while (validar == false);
                    break;
                case 2: //Saldo
                    validar = false;
                    do{
                        System.out.println("Insira o número da conta para verificar seu saldo:");
                        numConta = Integer.parseInt(sc.nextLine());
                        retorno = VerificarExistenciaConta(numConta);
                        if (retorno[0] == 0){
                            System.out.println("Essa conta não existe. Tente novamente.");
                            validar = false;
                        }else if (retorno[0] == 1){
                            System.out.println("A conta de número " +numConta+ " foi encontrada.");
                            System.out.println("Seu saldo é de R$" +banco.get(retorno[1]).getSaldo());
                            validar = true;
                        }else{
                            System.out.println("Houve algum erro inesperado.");
                        }
                    }while (validar == false);
                    break;
                case 3: //Saque
                   validar = false;
                   do{
                        System.out.println("Insira o número da conta para realizar um saque:");
                        numConta = Integer.parseInt(sc.nextLine());
                        retorno = VerificarExistenciaConta(numConta);
                        if (retorno[0] == 0){
                            System.out.println("Essa conta não existe. Tente novamente.");
                            validar = false;
                        }else if (retorno[0] == 1){
                            System.out.println("A conta de número " +numConta+ " foi encontrada.");
                            System.out.println("Qual valor gostaria de sacar?");
                            double valorSaque = Double.parseDouble(sc.nextLine());
                            if (banco.get(retorno[1]).Saque(valorSaque) == 1){
                                System.out.println("Saque realizado com sucesso. Retire seu dinheiro no compartimento abaixo.");
                                validar = true;
                            }else if (banco.get(retorno[1]).Saque(valorSaque) == 2){
                                System.out.println("Houve algum erro inesperado no sistema. [Conta.Saque()]");
                                validar = true;
                            }else if (banco.get(retorno[1]).Saque(valorSaque) == 0){
                                System.out.println("Saldo insuficiente.");
                                System.out.println("Você tentou sacar R$" +valorSaque+ ", mas seu saldo é de R$" +banco.get(retorno[1]).getSaldo()+ ".");
                                validar = true;
                            }else{
                                System.out.println("Houve algum erro inesperado no sistema. [AppBanco]");
                                validar = true;
                            }                            
                        }else{
                            System.out.println("Houve algum erro inesperado.");
                        }
                   }while (validar == false);
                   break;
                case 4: //Depósito
                   validar = false;
                   do{
                        System.out.println("Insira o número da conta para realizar um depósito.\n('010' PARA VOLTAR AO MENU PRINCIPAL)");
                        numConta = Integer.parseInt(sc.nextLine());
                        if (numConta == 010){
                            validar = true;
                        }else{
                            retorno = VerificarExistenciaConta(numConta);
                            if (retorno[0] == 0){
                                System.out.println("Essa conta não existe. Tente novamente.");                            
                                validar = false;
                            }else if (retorno[0] == 1){
                                System.out.println("A conta de número " +numConta+ " foi encontrada.");
                                System.out.println("Qual valor gostaria de depositar?");
                                double valorDeposito = Double.parseDouble(sc.nextLine());
                                if (banco.get(retorno[1]).Deposito(valorDeposito) == 1){
                                    System.out.println("Depósito realizado com sucesso.");
                                    System.out.println("Seu saldo atual é R$" +banco.get(retorno[1]).getSaldo());
                                    validar = true;
                                }else if (banco.get(retorno[1]).Deposito(valorDeposito) == 2){
                                    System.out.println("Houve algum erro inesperado no sistema. [Conta.Deposito()]");
                                    validar = true;
                                }else{
                                    System.out.println("Houve algum erro inesperado no sistema. [AppBanco]");
                                    validar = true;
                                }
                            }else{
                                System.out.println("Houve algum erro inesperado.");
                                validar = false;
                            }
                        }
                   }while (validar == false);
                   break;
                case 5: //Transferência
                   validar = false;
                   boolean validar2 = false;
                   int[] retorno2 = new int[2];
                   int numContaOrigem, numContaDestino;
                   do{
                       System.out.println("Insira o número da conta de onde irá sair o dinheiro:\n('010' PARA VOLTAR AO MENU PRINCIPAL)");
                       numContaOrigem = Integer.parseInt(sc.nextLine());
                       if (numContaOrigem == 010){
                           validar = true;
                       }else{
                           retorno = VerificarExistenciaConta(numContaOrigem);
                           if (retorno[0] == 0){
                               System.out.println("Essa conta não existe. Tente novamente.");
                               validar = false;
                           }else if (retorno[0] == 1){                                                              
                                do{                                        
                                    System.out.println("Insira o número da conta de destino:");
                                    numContaDestino = Integer.parseInt(sc.nextLine());
                                    retorno2 = VerificarExistenciaConta(numContaDestino);
                                    if (retorno2[0] == 0){
                                        System.out.println("Essa conta não existe. Tente novamente.");
                                        validar2 = false;
                                    }else if (retorno2[0] == 1){                                            
                                        Conta contaDestino = banco.get(retorno2[1]);
                                        System.out.println("Qual o valor que gostaria de transferir?");
                                        double valorTransferencia = Double.parseDouble(sc.nextLine());
                                        if (banco.get(retorno[1]).Transferencia(valorTransferencia, contaDestino) == 1){
                                            System.out.println("Transferência realizada com sucesso.");
                                            System.out.println("O saldo da conta de origem agora é: R$" +banco.get(retorno[1]).getSaldo());
                                            System.out.println("O saldo da conta de destino agora é: R$" +banco.get(retorno2[1]).getSaldo());
                                            validar2 = true;
                                        }else if (banco.get(retorno[1]).Transferencia(valorTransferencia, contaDestino) == 2){
                                            System.out.println("Ocorreu um erro inesperado. [Conta.Transferencia()]");
                                            validar2 = true;
                                        }else if (banco.get(retorno[1]).Transferencia(valorTransferencia, contaDestino) == 0){
                                            System.out.println("O saldo da conta de origem não é suficiente.");
                                            System.out.println("Você tentou transferir R$" +valorTransferencia+ ", mas o saldo da conta é de apenas R$" +banco.get(retorno[1]).getSaldo());
                                            validar2 = true;
                                        }else{
                                            System.out.println("Ocorreu um erro inesperado. [AppBanco]");
                                            validar2 = true;
                                        }
                                    }
                                }while(validar2 == false);
                                validar = true;                               
                           }
                       }
                   }while (validar == false);
                   break;
                case 6: //Encerrar Programa
                   System.out.println("Obrigado por utilizar nosso banco!");
                   break;
            }
        }while(opcao != 6);        
    }

    public static int[] VerificarExistenciaConta(int numConta){
        int[] resultado = new int[2];
        for (int i=0; i<banco.size(); i++){
            if (banco.get(i).getNumeroConta() == numConta){
                resultado[0] = 1;
                resultado[1] = i;
                return resultado;
            }
        }
        resultado[0] = 0;        
        return resultado;
    }
}