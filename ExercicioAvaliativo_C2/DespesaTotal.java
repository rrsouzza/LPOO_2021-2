package ExercicioAvaliativo_C2;
import java.util.ArrayList;
public class DespesaTotal implements Despesa{
    ArrayList<DespesaDia> registro = new ArrayList<>();

    public DespesaTotal(){}     //Construtor padrão
    public DespesaTotal(ArrayList<DespesaDia> lista){   //Construtor onde necessita um ArrayList de DespesaDia como parâmetro.
        this.registro = lista;      //Ele salva o ArrayList passado como parâmetro dentro do ArrayList local (classe).
    }

    public DespesaTotal Get(int dia, int mes){  //Esse método procura por todas as despesas registradas em um certo dia. Recebe Dia e Mês como parâmetros
        ArrayList<DespesaDia> lista = new ArrayList<>();    //Instancia um ArrayList novo onde será armazenado todas as despesas que atendem aos critérios
        for (int i=0; i<this.registro.size(); i++){     //Um loop que irá percorrer todo o ArrayList Registro local (classe).
            DespesaDia objetoTemp = new DespesaDia(dia, mes);   //Instancia um objeto da classe DespesaDia que será usado para comparar com o objeto do ArraList Registro local (classe).
            if (this.registro.get(i).Equals(objetoTemp)){   //Usa o get(i) no ArrayList Registro e chama o método Equals() da classe DespesaDia. Passa o objetoTemp como parâmetro para que os dois possam ser comparados. Se retornar true, executa o conteúdo dentro do if(){}.
                lista.add(new DespesaDia(dia, mes, this.registro.get(i).getValor()));   //Caso tenha retornado true, adiciona um novo objeto DespesaDia à classe local (método) Lista. Passa como parâmetro o dia, mês e valor recuperado.
            }
        }
        DespesaTotal objeto = new DespesaTotal(lista);  //Instancia um novo objeto da classe atual DespesaTotal para retornar.
        return objeto;  //Retorna o objeto
    }    
    
    //Totaliza os valores de todas as despesas registradas no ArrayList
    public double Totaliza(){
        double valorTotal = 0;  //Inicia nossa variável que irá armazenar o valor total.
        for (int i=0; i<this.registro.size(); i++){ //Loop que irá percorrer todo o ArrayList Registro local (classe).
            valorTotal += this.registro.get(i).getValor();  //Adiciona à variável valorTotal o valor recuperado de cada registro.
        }
        return valorTotal;  //Retorna o conteúdo da variável valorTotal.
    }

    public void Extorna(DespesaDia objeto){     //Irá excluir alguma despesa registrada. Recebe como parâmetro um objeto da classe DespesaDia.
        for (int i=0; i<this.registro.size(); i++){     //Um loop que irá percorrer todo o ArrayList Registro local (classe).
            if (this.registro.get(i).Equals(objeto)){   //Usa o get(i) no ArrayList Registro e chama o método Equals() da classe DespesaDia. Passa o objeto como parâmetro para que os dois possam ser comparados. Se retornar true, executa o conteúdo dentro do if(){}.
                this.registro.remove(i);    //Caso tenha retornado true, remove a despesa encontrada.
            }
        }
    }

    public void Acrescenta(DespesaDia objeto){  //Irá adicionar uma despesa ao registro local (classe).
        this.registro.add(objeto);  
    }

    public String toString(){
        double valorTotal = 0;
        String resultado = "=============================\n";
        for (int i=0; i<this.registro.size(); i++){
            resultado += "DIA: ";
            resultado += this.registro.get(i).getDia() + "  |  ";
            resultado += "MÊS: ";
            resultado += this.registro.get(i).getMes() + "  |  ";
            resultado += "VALOR: R$" +this.registro.get(i).getValor()+ "  |  \n";
            resultado += "-----------------------------\n";
            valorTotal += this.registro.get(i).getValor();
        }
        resultado += "VALOR TOTAL: R$" +valorTotal+ "\n";
        resultado += "=============================\n";
        return resultado;
    }
}