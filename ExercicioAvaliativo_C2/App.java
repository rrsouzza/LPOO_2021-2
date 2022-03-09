package ExercicioAvaliativo_C2;
import java.util.Scanner;
public class App {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int opcao = 0;
        DespesaTotal desTot = new DespesaTotal();   //Instancia a DespesaTotal
        do{     //É um loop que irá executar até o usuário inserir 5 para Sair do programa.
            System.out.println("=============================");
            System.out.println("1 - Cadastrar Despesa");            //M
            System.out.println("2 - Extornar Despesa");             //E
            System.out.println("3 - Total Parcial");                //N
            System.out.println("4 - Total");                        //U
            System.out.println("5 - Sair");
            opcao = Integer.parseInt(sc.nextLine());    //Pega a opção escolhida pelo usuário

            switch(opcao){  //Irá filtrar a opção escolhida pelo usuário
                case 1:     //Caso a opção seja igual a 1
                    desTot.Acrescenta(Texto());     //Utiliza do objeto desTot para chamar o método Acrescenta, passando como parâmetro o retorno do método local (classe) Texto().
                    break;  //Encerra o switch, retornando para o menu principal
                case 2:     //Caso a opção seja igual a 2
                    desTot.Extorna(Texto());        //Utiliza do objeto desTot para chamar o método Extorna, passando como parâmetro o retorno do método local (classe) Texto().
                    break;  //Encerra o switch, retornando para o menu principal
                case 3:     //Caso a opção seja igual a 3
                    int[] inteiros = DiaMes();  //Insere o retorno do método DiaMes() em um vetor de inteiros.
                                                /*Como o usuário precisa passar apenas o dia e mês para saber as despesas totais daquele dia, não é necessário 
                                                    chamar o Texto() para que o usuário insira um valor. */
                    DespesaTotal dTot = desTot.Get(inteiros[0], inteiros[1]);   //Chama o método Get da classe DespesaTotal a partir do objeto local desTot. 
                                                                                //Passa como parâmetro o vetor de inteiros, e armazena o resultado em um novo objeto local dTot.
                    System.out.println(dTot.toString());    //Imprime na tela os detalhes de todos os registros daquele dia, incluindo no final o valor total.
                    break;  //Encerra o switch, retornando para o menu principal
                case 4:     //Caso a opção seja igual a 4
                    int escolha = 0;
                    Loop:   //Define uma "etiqueta" para todo o código que o sucede
                    do{
                        System.out.println("Gostaria de ver todos os registros ou apenas o valor total?");
                        System.out.println("1 - Todos os registros");
                        System.out.println("2 - Apenas o valor total");
                        System.out.println("3 - Retornar ao Menu Principal");
                        escolha = Integer.parseInt(sc.nextLine());      //Armazena a opção escolhida pelo usuário
                        switch(escolha){        //Irá filtrar a opção escolhida pelo usuário
                            case 1:     //Caso a opção seja igual a 1
                                System.out.println(desTot.toString());  //Irá imprimir na tela todos os registros por completo: Dia, Mês e Valor de cada registro. No final imprime o valor total.
                                break Loop;     //Ordena para encerrar todo o código descendente de Loop.
                            case 2:     //Caso a opção seja igual a 2
                                System.out.println("=============================");
                                System.out.println("O valor total de todos os registros é: R$" +desTot.Totaliza()); //Imprime na tela apenas o valor total de todos os registros.
                                break Loop;     //Ordena para encerrar todo o código descendente de Loop.
                            case 3:     //Caso a opção seja igual a 3
                                break Loop;     //Ordena para encerrar todo o código descendente de Loop.
                            default:    //É o padrão, caso o usuário insira qualquer valor diferente de 1, 2 e 3.
                                System.out.println("Opção inválida.");
                        }                        
                    }while ((escolha != 1) && (escolha != 2) && (escolha != 3));    //Irá executar o loop do enquanto a escolha do usuário for diferente de 1, 2 ou 3.
                    break;  //Encerra o switch da linha 17.
                case 5: //Caso a opção seja igual a 5
                    System.out.println("Obrigado por utilizar o programa.");    //Mensagem final
                    break;  //Encerra o switch da linha 17.
                default:    //É o padrão caso o usuário insira um valor diferente de 1, 2, 3, 4 ou 5.
                    System.out.println("Opção inválida.");                    
            }
        }while (opcao != 5);    //Irá executar o Menu Principal enquanto a opção do usuário for diferente de 5.
    }
    
    public static int[] DiaMes(){   //Método que irá perguntar ao usuário qual o Dia e Mês que gostaria de inserir, assim como validar suas entradas.
        int[] inteiros = new int[2];    //Cria um vetor de inteiros de tamanho 2.
        int dia = 0, mes = 0;   //Inicializa o Dia e Mês como 0.
        boolean validar = false;    //Inicializa o validar como false
        do{ //Irá executar repetidamente até que o usuário insira apenas valores válidos.
            Dia:    //"Etiqueta" para o loop do Dia
            do{
                System.out.println("=============================");
                System.out.println("Qual o dia da despesa? (1 a 31)");
                dia = Integer.parseInt(sc.nextLine());  //Armazena o valor que o usuário inserir na variável dia
                if ((dia > 0) && (dia <= 31)){  //Se dia for maior que zero e menor ou igual que 31
                    inteiros[0] = dia;      //Armazena o dia na posição 0 do vetor inteiros
                    do{     //Loop para validar o Mês
                        System.out.println("-----------------------------");
                        System.out.println("Qual o mês da despesa? (1 a 12)");
                        mes = Integer.parseInt(sc.nextLine());      //Armazena o valor que o usuário inserir na variável mês
                        if ((mes > 0) && (mes <= 12)){      //Se mês for maior que zero e menor ou igual a 12
                            if ((dia > 28) && (mes == 2)){  //Aqui valida caso o dia inserido pelo usuário for maior que 28 e o mês for 2 (fevereiro)
                                System.out.println("O mês de Fevereiro tem apenas 28 dias!");
                                validar = false;
                            }else if ((dia == 31) && ((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11))){  //Irá validar caso o usuário tenha inserido dia 31 em um mês que tem apenas 30 dias.
                                System.out.println("O mês que você selecionou tem apenas 30 dias!");
                                validar = false;
                            }else{  //Após ter validado o dia e mês, caso estejam corretos:
                                inteiros[1] = mes;  //Armazena o mês na posição 1 do vetor inteiros
                                validar = true;     //A validação está completa
                            }
                        }else{
                            System.out.println("Você escolheu um mês inválido!");   //Caso o usuário tenha escolhido um mês menor que 1 ou maior que 12
                        }
                    }while((mes < 1) || (mes > 12));    //Irá repetir o loop de inserir o mês enquanto ele for menor que 1 ou maior que 12
                }else{  //Caso o usuário tenha inserido um dia inválido
                    System.out.println("Você escolheu um dia inválido!");
                    break Dia;  //Encerra a etiqueta "Dia" para que o usuário insira um novo dia
                }
            }while ((dia < 1) || (dia > 31));   //Irá repetir o loop de Inserir o dia enquanto o usuário inserir um valor menor que 1 ou maior que 31
        }while (validar == false);  //Irá repetir todo o processo enquanto a variável validar for false
        return inteiros;    //No final, retorna o vetor de inteiros
    }
    
    public static DespesaDia Texto(){   /*Esse método é separado do Dia e Mês porque caso o usuário deseje consultar os valores de uma determinada data,
                                             não faria sentido ele ter de inserir um valor para busca. */
        int[] inteiros = DiaMes();      //Executa o método do Dia e Mês e armazena o retorno em um vetor local (método).
        double valor = 0;
        boolean validar = false;
        do{ //Irá executar enquanto validar for false
            System.out.println("Qual o valor da despesa?"); 
            valor = Double.parseDouble(sc.nextLine());  //Armazena o valor inserido pelo usuário na variável valor
            if (valor < 0){     //Caso o valor seja menor que zero (negativo)
                System.out.println("Valor inválido!");
                validar = false;    //Mantém validar = false
            }else{                  /*Caso contrário (valor positivo),
                                        validar é true */
                validar = true;         
            }
        }while (validar == false);      //Irá executar enquanto validar for false
        return new DespesaDia(inteiros[0], inteiros[1], valor);     //Retorna um novo objeto da classe DespesaDia passando como parâmetro o Dia, Mês e Valor.
    }
}