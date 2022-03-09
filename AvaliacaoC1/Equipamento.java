package AvaliacaoC1;
public class Equipamento {
	private int codigo;
	private String tipo;
	private boolean locado;
	//quantidade de carros que estao locados
	private static int numLocados=0;
	/**
	 * @param codigo
	 * @param modelo
	 */

     public Equipamento(int codigo, String tipo) {
		super();
		this.codigo = codigo;
		this.tipo = tipo;
		this.locado=false;
	}

    public static void TentarLocar(Equipamento[] listaEquipamentos, int codigoLocacao){
        int indexEncontrado = 0;
        boolean codigoEncontrado = false;
        for (int i=1; i==listaEquipamentos.length; i++){
            if (listaEquipamentos[i].getCodigo() == codigoLocacao){
                codigoEncontrado = true;
                indexEncontrado = i;
                break;
            }
        }
        if (codigoEncontrado == true){
            if (listaEquipamentos[indexEncontrado].locar() == true){
                System.out.println("EQUIPAMENTO LOCADO COM SUCESSO!");
            }else if (listaEquipamentos[indexEncontrado].locar() == false){
                System.out.println("EQUIPAMENTO NÃO ESTÁ DISPONÍVEL.");
            }
        }
    }

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getTipo() {
		return tipo;
	}
	public boolean isLocado() {
		return locado;
	}
	public static int getNumLocados() {
		return numLocados;
	}
	public boolean locar() {
		if (this.locado) {
			return false;
		}else {
			this.locado = true;
			numLocados++;
			return true;
		}
	}
	
	public boolean devolver() {
		if (this.locado) {
			this.locado = false;
			numLocados--;
			return true;
		}else {
			return false;
		}
	}
}
