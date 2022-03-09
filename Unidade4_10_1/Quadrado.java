package Unidade4_10_1;
public class Quadrado extends Retangulo{    

    public Quadrado(double[] pontoA, double[] pontoB, double tamLado, double inutilizado){
        super(pontoA, pontoB, tamLado, inutilizado);
        //pontoA : ponto inferior esquerdo do quadrado
        //pontoB : ponto superior direito do quadrado
    }

    @Override
    public String toString() {
        return "====================================================\n" +
                "QUADRADO:\n" +
                "PontoA: (" +getPontoA()[0]+ " , " +getPontoA()[1]+ ")\n" +
                "PontoB: (" +getPontoB()[0]+ " , " +getPontoB()[1]+ ")\n" +
                "Área: " +String.format("%.2f", Area())+ " u²\n" +
                "Perímetro: " +String.format("%.2f", Perimetro())+ " u²\n";            
    }
}