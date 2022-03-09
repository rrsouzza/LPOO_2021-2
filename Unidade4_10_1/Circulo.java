package Unidade4_10_1;
public class Circulo extends ElementoGeometrico{    
    //pontoA = centro do círculo
    //pontoB = ponto na circuferência
    private double raio;
    
    public Circulo(double[] pontoA, double[] pontoB){
        super(pontoA, pontoB);
        //Distância entre dois pontos = √(xb - xa)² + (yb - ya)²
        this.raio = Math.sqrt((Math.pow(getPontoA()[1] - getPontoA()[0], 2) + Math.pow(getPontoB()[1] - getPontoB()[0], 2)));
    }

    @Override
    public String Desenhar(){
        return "O objeto está sendo desenhado.";
    }

    @Override
    public int Redimensionar(double numero, int operacao, int eixo){        
        int validar = 0;
        //operacao == 1 -> aumentar
        //operacao == 2 -> diminuir
        if (operacao == 1){
            getPontoB()[0] += numero;
            getPontoB()[1] += numero;
            validar = 1;
        }else if (operacao == 2){
            getPontoB()[0] -= numero;
            getPontoB()[1] -= numero;
            validar = 1;
        }
        if (validar == 0){
            return 0;
        }else{
            //Calcular o novo raio:
            this.raio = Math.sqrt((Math.pow(getPontoA()[1] - getPontoA()[0], 2) + Math.pow(getPontoB()[1] - getPontoB()[0], 2)));
            return 1;
        }
    }

    @Override
    public double Area(){
        double area = 3.14 * Math.pow(this.raio, 2);
        return area;
    }

    @Override
    public double Perimetro(){
        double perimetro = 2 * 3.14 * this.raio;
        return perimetro;
    }

    @Override
    public String toString() {
        return "====================================================\n" +
                "CÍRCULO:\n" +
                "PontoA: (" +getPontoA()[0]+ " , " +getPontoA()[1]+ ")\n" +
                "PontoB: (" +getPontoB()[0]+ " , " +getPontoB()[1]+ ")\n" +
                "Área: " +String.format("%.2f", Area())+ " u²\n" +
                "Perímetro: " +String.format("%.2f", Perimetro())+ " u²\n" +
                "Raio: " +String.format("%.2f", getRaio())+ " u\n";
    }
    
    public double getRaio() {
        return this.raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }
}