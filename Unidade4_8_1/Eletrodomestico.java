package Unidade4_8_1;
public abstract class Eletrodomestico {
    //Classes Abstratas podem ter metodos construtores, porém não podem ser usados para instanciar um objeto diretamente.
    private boolean ligado;
    private int voltagem;

    public Eletrodomestico(int voltagem){
        this.ligado = false;
        this.voltagem = voltagem;
    }

    //Métodos abstratos não possuem corpo, são declarados apenas seus "cabeçalhos".
    public abstract void Ligar();
    public abstract void Desligar();
    
    //Uma classe abstrata pode possuir métodos não-abstratos.
    public boolean isLigado() {
        return this.ligado;
    }    
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    public int getVoltagem() {
        return this.voltagem;
    }
    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }
    @Override
    public String toString() {
        String aux = "ELETRODOMÉSTICO: "
                    +"Voltagem: " + this.voltagem;
        if (this.ligado){
            aux += ", Ligado.";
        }
        else{
            aux += ", Desligado.";
        }
        return aux;
    }
}