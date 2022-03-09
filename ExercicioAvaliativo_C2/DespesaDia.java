package ExercicioAvaliativo_C2;
public class DespesaDia {
    private int dia, mes;
    private double valor;

    public DespesaDia(){}   //Construtor vazio padrão
    public DespesaDia(int dia, int mes){    //Construtor com apenas dia e mês como parâmetros. Assim podemos usá-lo na hora de invocar o Equals()
        this.dia = dia;
        this.mes = mes;
    }
    public DespesaDia(int dia, int mes, double valor) {     //Construtor completo.
        this.dia = dia;
        this.mes = mes;
        this.valor = valor;
    }

    public boolean Equals(DespesaDia objeto){       //Compara se a classe atual é igual ao objeto passado como parâmetro.
        if ((this.getDia() == objeto.getDia()) && (this.getMes() == objeto.getMes())){      //Compara se o dia e mês da classe atual são iguais ao dia e mês do objeto passado como parâmetro.
            return true;
        }else{
            return false;
        }
    }
    
    //Getters e Setters
    public int getDia() {
        return this.dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getMes() {
        return this.mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public double getValor() {
        return this.valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    //toString
    @Override
    public String toString() {
        return "==========================\n" +
            "DIA: " +getDia()+ "  |  " +
            "MÊS: " +getMes()+ "  |  " +
            "VALOR: R$" +getValor()+ "  |  \n";
    }
}