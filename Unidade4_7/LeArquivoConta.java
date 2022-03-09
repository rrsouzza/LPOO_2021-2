package Unidade4_7;
import java.io.*;
import java.util.*;
public class LeArquivoConta {
    private Scanner entrada;

    //String conta refere-se ao endereço do documento.
    public LeArquivoConta (String conta) throws FileNotFoundException{
        try{            
            this.entrada = new Scanner(new File(conta));
        }
        catch (FileNotFoundException e){
            throw new FileNotFoundException("*Arquivo não encontrado*");
        }
    }

    public ArrayList<Conta> LerArquivo() throws ArrayIndexOutOfBoundsException, NumberFormatException{
        ArrayList<Conta> contas = new ArrayList<>();
        //As informações lidas serão armazenadas nessa ArrayList.
        String linha;
        String[] vetorLinha = null;
        while(this.entrada.hasNext()){
            linha = this.entrada.nextLine();
            try{
                vetorLinha = linha.split(";");  //Divide as informações usando o ; como parâmetro
                contas.add(new Conta(vetorLinha[0], Long.parseLong(vetorLinha[1]), Long.parseLong(vetorLinha[2]), Long.parseLong(vetorLinha[3])));
            }
            catch(ArrayIndexOutOfBoundsException erro){
                throw new ArrayIndexOutOfBoundsException("REGISTRO TEM " +vetorLinha.length+ " INFORMAÇÕES.");                
            }catch(NumberFormatException erro){
                throw new NumberFormatException("ALGUM LONG FOI ZOADO AÍ");
            }
        }
        return contas;
    }

    public void Fecha() throws IllegalStateException{
        try{
            this.entrada.close();
            //Fecha o Scanner
        }
        catch (IllegalStateException e){
            throw new IllegalStateException("ERRO AO FECHAR O ARQUIVO");
        }
    }
}