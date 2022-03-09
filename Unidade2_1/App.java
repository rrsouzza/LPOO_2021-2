package Unidade2_1;
import java.util.Scanner;
public class App {
    static String nomeLocal;
    static double salarioLocal;
    static double salarioMinimoLocal;
    static Funcionario funcionarioLocal;
    static Funcionario[] vetFuncLocal;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Funcionario operar = new Funcionario();
        Inserir:
        for (int i=0; i<3; i++){
            System.out.println("Insira o nome do " +(i+1)+ "º funcionário:");
            nomeLocal = sc.nextLine();
            System.out.println("Insira o salário do " +(i+1)+ "º funcionário:");
            salarioLocal = Double.parseDouble(sc.nextLine());
            salarioMinimoLocal = 1100.00;
            funcionarioLocal = new Funcionario(nomeLocal, salarioLocal, salarioMinimoLocal);
            if (operar.InsereVetor(funcionarioLocal) == 1){                
            }else if (operar.InsereVetor(funcionarioLocal) == -1){                
                System.out.println("O vetor está cheio.");
                break Inserir;
            }else{
                System.out.println("Um erro não previsto aconteceu.");
            }
        }

        vetFuncLocal = operar.RetornaVetor();
        for (int i=0; i<3; i++){
            funcionarioLocal = vetFuncLocal[i];
            nomeLocal = funcionarioLocal.getNome();
            salarioLocal = funcionarioLocal.getSalario();
            salarioMinimoLocal = funcionarioLocal.getSalarioMinimo();
            operar.setNome(nomeLocal);
            operar.setSalario(salarioLocal);
            operar.setSalarioMinimo(salarioMinimoLocal);
            System.out.println((i+1)+"º FUNCIONÁRIO: " + operar.toString());
        }
    }
}