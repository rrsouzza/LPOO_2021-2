package Unidade4_10_1;
public class Retangulo extends ElementoGeometrico{
    private double lado1, lado2;

    public Retangulo(double[] pontoA, double[] pontoB, double tamLado1, double tamLado2){
        super(pontoA, pontoB);
        //pontoA : ponto inferior esquerdo do retângulo
        //pontoB : ponto superior direito do retângulo
        
        //lado1 : altura
        //lado2 : largura
        this.lado1 = tamLado1;
        this.lado2 = tamLado2;
    }
    
    @Override
    public String Desenhar(){
        return "O objeto está sendo desenhado.";
    }

    @Override
    public int Redimensionar(double numero, int operacao, int eixo){
        //eixo == 1 -> eixo y
        //eixo == 2 -> eixo x
        if (eixo == 1){
            if (operacao == 1){
                if ((this.lado1 += numero) == this.lado2){                    
                    return 2;
                }else{
                    this.lado1 += numero;
                    return 1;
                }
            }else if (operacao == 2){
                if ((this.lado1 -= numero) == this.lado2){
                    return 2;
                }else{
                    this.lado1 -= numero;
                    return 1;
                }
            }
        }else if (eixo == 2){
            if (operacao == 1){
                if ((this.lado2 += numero) == this.lado1){
                    return 2;
                }else{
                    this.lado2 += numero;
                    return 1;
                }
            }else if (operacao == 2){
                if ((this.lado2 -= numero) == this.lado1){
                    return 2;
                }else{
                    this.lado2 -= numero;
                    return 1;
                }
            }
        }else{
            return 0;
        }
        return 0;
    }    

    @Override
    public double Area(){
        double area = this.lado1 * this.lado2;
        return area;
    }

    @Override
    public double Perimetro(){
        double perimetro = (this.lado1 * 2) + (this.lado2 * 2);
        return perimetro;
    }

    @Override
    public String toString() {
        return "====================================================\n" +
                "RETÂNGULO:\n" +
                "PontoA: (" +getPontoA()[0]+ " , " +getPontoA()[1]+ ")\n" +
                "PontoB: (" +getPontoB()[0]+ " , " +getPontoB()[1]+ ")\n" +
                "Área: " +String.format("%.2f", Area())+ " u²\n" +
                "Perímetro: " +String.format("%.2f", Perimetro())+ " u²\n";            
    }

    public double getLado1() {
        return this.lado1;
    }
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }
    public double getLado2() {
        return this.lado2;
    }
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
}