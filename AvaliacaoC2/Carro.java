package AvaliacaoC2;
public class Carro extends Veiculo{
    private String modelo, marca;
    
    public Carro(Motor motor, double preco, String modelo, String marca){
        super(motor, preco);
        this.modelo = modelo;
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getMarca() {
        return this.marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "======================\n" +
            "MOTOR: " +getMotor()+ "\n" +
            "PREÇO: R$" +getPreco()+ "\n" +
            "MODELO: " +getModelo()+ "\n" +
            "MARCA: " +getMarca()+ "\n";            
    }
}