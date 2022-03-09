package AvaliacaoC2;
public class Caminhao extends Veiculo{
    private float carga, altura, comprimento;

    public Caminhao(Motor motor, double preco, float carga, float altura, float comprimeto){
        super(motor, preco);
        this.carga = carga;
        this.altura = altura;
        this.comprimento = comprimeto;
    }

    public float getCarga() {
        return this.carga;
    }
    public void setCarga(float carga) {
        this.carga = carga;
    }
    public float getAltura() {
        return this.altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getComprimento() {
        return this.comprimento;
    }
    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    @Override
    public String toString() {
        return "======================\n" +
            "MOTOR: " +getMotor()+ "\n" +
            "PREÇO: R$" +getPreco()+ "\n" +
            "CARGA: " +getCarga()+ " TONELADAS\n" +
            "ALTURA: " +getAltura()+ "M\n" +
            "COMPRIMENTO: " +getComprimento()+ "M\n";
    }
}