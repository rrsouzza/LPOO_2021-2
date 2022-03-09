package Unidade2_2;
import java.util.Scanner;
public class App {
    static Scanner sc = new Scanner(System.in);    
    static String nomeLocal;
    static double salarioLocal;
    static FuncionarioEstatico funcionarioLocal;
    static public FuncionarioEstatico[] VetorLocal = new FuncionarioEstatico[3];
    public static void main(String[] args) {
        FuncionarioEstatico operar = new FuncionarioEstatico();
        for (int i=0; i<3; i++){
            System.out.println("Qual o nome do "+(i+1)+"º funcionário?");
            nomeLocal = sc.nextLine();
            System.out.println("Qual o salário do "+(i+1)+"º funcionário?");
            salarioLocal = Double.parseDouble(sc.nextLine());
            operar.setNome(nomeLocal);
            operar.setSalario(salarioLocal);
            operar.InsereVetor();
        }
        VetorLocal = operar.RetornaVetor();
        for (int i=0; i<3; i++){
            nomeLocal = VetorLocal[i].getNome();
            operar.setNome(VetorLocal[i].getNome());            
            operar.setSalario(VetorLocal[i].getSalario());
            System.out.println((i+1)+ "º FUNCIONÁRIO:");
            operar.toString();
        }

        operar.setSalarioMinimo(1100.00);
        System.out.println("O novo salário mínimo é R$" +operar.getSalarioMinimo());

        operar.LimpaVetor();
        for (int i=0; i<3; i++){
            nomeLocal = VetorLocal[i].getNome();
            salarioLocal = VetorLocal[i].getSalario();
            operar.setNome(nomeLocal);
            operar.setSalario(salarioLocal);
            operar.InsereVetor();
        }

        VetorLocal = operar.RetornaVetor();
        operar.LimpaVetor();
        for (int i=0; i<3; i++){                        
            operar.setSalario(VetorLocal[i].getSalario());
            operar.setNome(VetorLocal[i].getNome());
            operar.InsereVetor();
        }

        VetorLocal = operar.RetornaVetor();
        for (int i=0; i<3; i++){            
            operar.setNome(VetorLocal[i].getNome());            
            operar.setSalario(VetorLocal[i].getSalario());
            System.out.println((i+1)+ "º FUNCIONÁRIO:");
            operar.toString();
        }
    }
}