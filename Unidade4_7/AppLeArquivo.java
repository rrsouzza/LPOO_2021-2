package Unidade4_7;
import java.io.*;
import java.util.*;
public class AppLeArquivo {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        LeArquivoConta arquivo = null;
        ArrayList<Conta> contas = null;

        try{
            arquivo = new LeArquivoConta("Conta.txt");
            contas = arquivo.LerArquivo();
            arquivo.Fecha();
        }
        catch (FileNotFoundException e){
            System.out.println("ERRO: " +e.getMessage());
            System.exit(1);
        }
        catch (NumberFormatException e){
            System.out.println("ERRO: " +e.getMessage());
            arquivo.Fecha();
            System.exit(1);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ERRO: " +e.getMessage());
            arquivo.Fecha();
            System.exit(1);
        }

        if (!contas.isEmpty()){
            System.out.println(contas.toString());
        }else {
			contas = new ArrayList<Conta>();
			for (int i=0; i<3; i++) {				
				System.out.println("Insira o nome: ");
                String nome = sc.nextLine();
                System.out.println("Insira o CPF: ");
				long cpf = Long.parseLong(sc.nextLine());
                System.out.println("Insira o número da conta: ");
				long conta = Long.parseLong(sc.nextLine());
                System.out.println("Insira a agência: ");
				long agencia = Long.parseLong(sc.nextLine());
				contas.add(new Conta(nome, cpf, conta, agencia));
			}
			gravaConta(contas);
		}
		System.exit(0);
	}

	private static void gravaConta(ArrayList<Conta> conta) {
		System.out.println("CONTAS");
		for (Conta c: conta) {
			System.out.println(c.toString());
		}
		try {
			GravaArquivo saida = new GravaArquivo("Conta.txt");
			for (Conta c: conta) {
				saida.EscreveArquivo(c.toStringArquivo()+"\n");
			}
			saida.Fechar();
		} catch (IOException e) {
			System.out.println("ERRO" + e.getMessage());
		}		
	}    
}