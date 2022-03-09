package Unidade2_3;
public class Conversor{
    //km para milha
    //milha pra km
    //pes pra cm
    //cm pra pes
    //polegada pra cm
    //cm pra polegada
    private double numero;    

    public Conversor() {
    }

    public double KmMilha(double numero){
        double resultado = numero / 1.609;
        return resultado;
    }

    public double MilhaKm(double numero){
        double resultado = numero * 1.609;
        return resultado;
    }

    public double PesCm(double numero){
        double resultado = numero * 30.48;
        return resultado;
    }

    public double CmPes(double numero){
        double resultado = numero / 30.48;
        return resultado;
    }

    public double PolegadaCm(double numero){
        double resultado = numero * 2.54;
        return resultado;
    }

    public double CmPolegada(double numero){
        double resultado = numero / 2.54;
        return resultado;
    }

    @Override
    public String toString() {
        return "{" +
            " numero='" + getNumero() + "'" +
            "}";
    }

    public double getNumero() {
        return this.numero;
    }
    public void setNumero(double numero) {
        this.numero = numero;
    }    
}