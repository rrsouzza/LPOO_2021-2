package Unidade4_8_1;
public class Maquina_de_lavar extends Eletrodomestico{
    private int opcaoDeLavagem;

    public Maquina_de_lavar(int voltagem){
        super(voltagem);
    }

    public int getOpcaoDeLavagem(){
        return this.opcaoDeLavagem;
    }
    public void setOpcaoDeLavagem(int opcaoDeLavagem){
        this.opcaoDeLavagem = opcaoDeLavagem;
    }

    @Override
    public void Ligar(){
        super.setLigado(true);
        this.opcaoDeLavagem = 1;
    }
    @Override
    public void Desligar(){
        super.setLigado(false);
        this.opcaoDeLavagem = 0;        
    }

    @Override
    public String toString() {
        String aux = "MÁQUINA DE LAVAR: "
                    + "\nVoltagem: " + super.getVoltagem()
                    + "\nOpção de Lavagem: " +this.opcaoDeLavagem;        
        if (super.isLigado()){
            aux += "\nEstá Ligado."
                + "\n------------------------";
        }
        else{
            aux += "\nEstá Desligado."
                + "\n------------------------";
        }
        return aux;
    }
}