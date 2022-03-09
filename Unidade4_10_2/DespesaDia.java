package Unidade4_10_2;
public class DespesaDia {
    private int dia, mes;
    private double valor;

    public DespesaDia(){}
    public DespesaDia(int dia, int mes, double valor) {
        this.dia = dia;
        this.mes = mes;
        this.valor = valor;
    }

    public boolean Equals(DespesaDia objeto){
        if (this.equals(objeto)){
            return true;
        }else{
            return false;
        }
    }
    
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

    @Override
    public String toString() {
        return "{" +
            " dia='" + getDia() + "'" +
            ", mes='" + getMes() + "'" +
            ", valor='" + getValor() + "'" +
            "}";
    }
}