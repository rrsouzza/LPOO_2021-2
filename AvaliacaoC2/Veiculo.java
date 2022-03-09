package AvaliacaoC2;
public class Veiculo {
	private Motor motor;
	private double preco;
	public Veiculo(Motor motor, double preco) {
		super();
		this.motor = motor;
		this.preco = preco;
	}
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	@Override
	public String toString() {
		return getMotor()+ "\n" +
			"PREÇO : " +getPreco()+ "\n";
	}			
}