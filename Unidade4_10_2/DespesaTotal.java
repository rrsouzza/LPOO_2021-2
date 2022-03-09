package Unidade4_10_2;
import java.util.ArrayList;
public class DespesaTotal implements Despesa{
    ArrayList<DespesaDia> registro = new ArrayList<>();

    public DespesaTotal(){}
    public DespesaTotal(ArrayList<DespesaDia> lista){
        this.registro = lista;
    }

    public DespesaTotal Get(int dia, int mes){        
        ArrayList<DespesaDia> lista = new ArrayList<>();
        for (int i=0; i<this.registro.size(); i++){            
            if ((this.registro.get(i).getDia() == dia) && (this.registro.get(i).getMes() == mes)){                                
                lista.add(new DespesaDia(dia, mes, this.registro.get(i).getValor()));
            }
        }
        DespesaTotal objeto = new DespesaTotal(lista);
        return objeto;
    }    
    
    //Totaliza os valores de todas as datas no ArrayList
    public double Totaliza(){
        double valorTotal = 0;
        for (int i=0; i<this.registro.size(); i++){
            valorTotal += this.registro.get(i).getValor();
        }
        return valorTotal;
    }

    public void Extorna(DespesaDia objeto){
        for (int i=0; i<this.registro.size(); i++){
            if (this.registro.get(i).equals(objeto)){
                this.registro.remove(i);
            }
        }
    }

    public void Acrescenta(DespesaDia objeto){
        this.registro.add(objeto);
    }

    public String toString(){
        double valorTotal = 0;
        String resultado = "=============================\n";
        for (int i=0; i<this.registro.size(); i++){
            resultado += "DIA: ";
            resultado += this.registro.get(i).getDia() + "\n";
            resultado += "MÊS: ";
            resultado += this.registro.get(i).getMes() + "\n";
            resultado += "VALOR: R$" +this.registro.get(i).getValor()+ "\n";
            resultado += "-----------------------------\n";
            valorTotal += this.registro.get(i).getValor();
        }
        resultado += "VALOR TOTAL: R$" +valorTotal+ "\n";
        resultado += "=============================\n";
        return resultado;
    }
}