package Unidade4_10_1;
public abstract class ElementoGeometrico{
    private double[] pontoA, pontoB;    
    // pontoA[x, y] ; pontoB[x, y]

    public ElementoGeometrico(double[] pontoA, double[] pontoB){
        this.pontoA = pontoA;
        this.pontoB = pontoB;        
    }

    public abstract String Desenhar();
    public abstract int Redimensionar(double numero, int operacao, int eixo);
    public abstract double Area();
    public abstract double Perimetro();


    @Override
    public String toString() {
        return "====================================================\n" +
                "PontoA: (" +getPontoA()[0]+ "," +getPontoA()[1]+ ")\n" +
                "PontoB: (" +getPontoB()[0]+ "," +getPontoB()[1]+ ")\n" +
                "Área: " +String.format("%.2f", Area())+ " u²\n" +
                "Perímetro: " +String.format("%.2f", Perimetro())+ " u²\n";            
    }

    public double[] getPontoA() {
        return this.pontoA;
    }
    public void setPontoA(double[] pontoA) {
        this.pontoA = pontoA;
    }
    public double[] getPontoB() {
        return this.pontoB;
    }
    public void setPontoB(double[] pontoB) {
        this.pontoB = pontoB;
    }    
}