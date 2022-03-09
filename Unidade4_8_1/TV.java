package Unidade4_8_1;
public class TV extends Eletrodomestico{
    private int canal, volume, tamanho;
    
    public TV(int voltagem, int tamanho){
        super(voltagem);
        this.tamanho = tamanho;        
    }

    public int getCanal() {
        return this.canal;
    }
    public void setCanal(int canal) {
        this.canal = canal;
    }
    public int getVolume() {
        return this.volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public int getTamanho() {
        return this.tamanho;
    }
    /*
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    */
    //Não faz sentido ter um setTamanho pois pensando numa TV real, ela não teria seu tamanho alterado depoois de já existir/ser instanciada.

    @Override
    public void Ligar(){
        super.setLigado(true);
        this.canal = 1;
        this.volume = 10;
    }
    @Override
    public void Desligar(){
        super.setLigado(false);
        this.canal = 0;
        this.volume = 0;
    }

    @Override
    public String toString() {
        String aux = "TELEVISÃO: "
                    + "\nVoltagem: " + super.getVoltagem()
                    + "\nTamanho: " +this.tamanho
                    + "\nVolume: " +this.volume
                    + "\nCanal: " +this.getCanal();
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