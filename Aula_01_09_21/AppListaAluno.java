package Aula_01_09_21;
import java.util.ArrayList;
import java.util.Scanner;
public class AppListaAluno {
    
    public static ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();
    public static void main(String[] args) {
        
        Aluno operar = new Aluno();
        int opcao = 0;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("----------------------------");
            System.out.println("1- Insere Aluno");
            System.out.println("2- Remove Aluno");
            System.out.println("3- Altera Nota");
            System.out.println("4- Mostra Aluno");
            System.out.println("5- Imprime Todos");
            System.out.println("6- Sair");
            opcao = Integer.parseInt(sc.nextLine());
            switch(opcao){
                case 1:
                    System.out.println("----------------------------\n");
                    System.out.println("Insira o nome do aluno:");
                    String nomeAluno = sc.nextLine();
                    System.out.println("Insira a matrícula do aluno:");
                    int matriculaAluno = Integer.parseInt(sc.nextLine());
                    System.out.println("Insira a primeira nota do aluno:");
                    double nota1Aluno = Double.parseDouble(sc.nextLine());
                    System.out.println("Insira a segunda nota do aluno:");
                    double nota2Aluno = Double.parseDouble(sc.nextLine());
                    listaAlunos.add(new Aluno(nomeAluno, matriculaAluno, nota1Aluno, nota2Aluno));
                case 2:
                    System.out.println("----------------------------\n");
                    System.out.println("Insira o nome do aluno que gostaria de remover:");
                    int resultado = ProcuraAluno(sc.nextLine());
                    if (resultado == 0) {
                        System.out.println("O aluno informado não foi encontrado.\n");
                    }else if (resultado == -1){
                        System.out.println("Ocorreu um problema no método ProcuraAluno().\n");
                    }else{
                        listaAlunos.remove(resultado);
                        System.out.println("O aluno informado foi removido.\n");
                    }
                case 3:
                    System.out.println("----------------------------\n");
                    System.out.println("Insira o nome do aluno de quem gostaria de alterar as notas:");
                    resultado = ProcuraAluno(sc.nextLine());
                    if (resultado == 0){
                        System.out.println("O aluno informado não foi encontrado.\n");
                    }else if (resultado == -1){
                        System.out.println("Ocorreu um problema no método ProcuraAluno().\n");
                    }else{
                        String nomeLocal = listaAlunos.get(resultado).getNome();
                        int matriculaLocal = listaAlunos.get(resultado).getMatricula();
                        System.out.println("Insira a nova Nota 1 do aluno:");
                        double novaNota1 = Double.parseDouble(sc.nextLine());
                        System.out.println("Insira a nova Nota 2 do aluno:");
                        double novaNota2 = Double.parseDouble(sc.nextLine());
                        listaAlunos.set(resultado, new Aluno(nomeLocal, matriculaLocal, novaNota1, novaNota2));
                        System.out.println("As notas foram alteradas.\n");
                    }
                case 4:
                    System.out.println("----------------------------\n");
                    System.out.println("Insira o nome do aluno para visualizar seus dados:");
                    resultado = ProcuraAluno(sc.nextLine());
                    if (resultado == 0){
                        System.out.println("O aluno informado não foi encontrado.\n");
                    }else if (resultado == -1){
                        System.out.println("Ocorreu um problema no método ProcuraAluno().\n");
                    }else{                        
                        operar.setNome(listaAlunos.get(resultado).getNome());
                        operar.setMatricula(listaAlunos.get(resultado).getMatricula());
                        operar.setNota1(listaAlunos.get(resultado).getNota1());
                        operar.setNota2(listaAlunos.get(resultado).getNota2());
                        operar.toString();
                    }
                case 5:
                    System.out.println("----------------------------\n");
                    for (int i=0; i<listaAlunos.size(); i++){                        
                        System.out.println(listaAlunos.get(i).getNome());
                    }
                case 6:
                sc.close();
                    System.out.println("Obrigado por utilizar o programa.");
            }
        }while (opcao != 6);
    }

    public static int ProcuraAluno(String nomeInformado){
        Aluno operar = new Aluno();        
        operar.setNome(nomeInformado);
        for (int i=0; i<listaAlunos.size();){
            if (operar.compareTo(listaAlunos.get(i)) == 0){                
                return i;
            }else{
                return 0;
            }
        }
        return -1;
    }
}