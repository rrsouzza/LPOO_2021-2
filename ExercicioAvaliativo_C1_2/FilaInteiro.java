package ExercicioAvaliativo_C1_2;
import java.util.LinkedList;
public class FilaInteiro {
    private LinkedList<Integer> filaInteiros = new LinkedList<Integer>();

    public FilaInteiro(){}
    
    public FilaInteiro(LinkedList<Integer> fila){
        this.filaInteiros = fila;
    }

    public boolean EmptyCheck(){
        boolean resposta = this.filaInteiros.isEmpty();
        return resposta;
    }

    public void Enqueue(int valor){
        this.filaInteiros.addLast(valor);
    }

    public void Dequeue(){
        this.filaInteiros.removeFirst();
    }

    public int filaSize(){
        return this.filaInteiros.size();
    }

    public int filaFirst(){
        return this.filaInteiros.getFirst();
    }
}