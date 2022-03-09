package Unidade4_7;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class GravaArquivo {
    private FileWriter filew;
    private PrintWriter printw;

    //String conta refere-se ao endereço do arquivo
    public GravaArquivo (String conta) throws IOException{
        try{
            filew = new FileWriter(new File(conta), true);
            printw = new PrintWriter(filew);
        }
        catch (IOException e){
            throw new IOException("Ocorreu um erro");
        }
    }

    public void EscreveArquivo (String str){
        this.printw.print(str);
    }

    public void Fechar() throws IOException{
        try{
            this.filew.close();
            this.printw.close();
        }
        catch (IOException e){
            throw new IOException("Erro ao fechar o arquivo.");
        }
    }
}
