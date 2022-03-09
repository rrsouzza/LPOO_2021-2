package AvaliacaoC2;
public class Motor {
	private int numCilindros, potencia;
	public Motor(int numCilindros, int potencia) {
		super();
		this.numCilindros = numCilindros;
		this.potencia = potencia;
	}

	public int getNumCilindros() {
		return numCilindros;
	}
	public void setNumCilindros(int numCilindros) {
		this.numCilindros = numCilindros;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return "Nº CILINDROS: " +getNumCilindros()+ "\n" +
			"POTÊNCIA: " +getPotencia()+ " CV\n";
	}
}