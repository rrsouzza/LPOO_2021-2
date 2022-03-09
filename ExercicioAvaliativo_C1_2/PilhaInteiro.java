package ExercicioAvaliativo_C1_2;
import java.util.LinkedList;
public class PilhaInteiro {
    private LinkedList<Integer> pilhaInteiros = new LinkedList<Integer>();

    public PilhaInteiro(){}
    
    public PilhaInteiro(LinkedList<Integer> pilha){
        this.pilhaInteiros = pilha;
    }

    public boolean EmptyCheck(){
        boolean isVazio = this.pilhaInteiros.isEmpty();
        return isVazio;
    }

    public void Push (int valor){
        this.pilhaInteiros.addLast(valor);
    }

    public void Pop(){
        this.pilhaInteiros.removeLast();
    }

    public int FilaSize(){
        return this.pilhaInteiros.size();
    }

    public int UltimoPilha(){
        return this.pilhaInteiros.getLast();
    }
}