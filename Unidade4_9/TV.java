package Unidade4_9;
public class TV{
    private boolean ligado;
    private int voltagem, canal, volume, tamanho;
    
    public TV(int voltagem, int tamanho){        
        this.voltagem = voltagem;
        this.tamanho = tamanho;        
    }        
    
    public boolean isLigado() {
        return this.ligado;
    }    
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    public int getVoltagem(){
        return this.voltagem;
    }
    public void setVoltagem(int voltagem){
        this.voltagem = voltagem;
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
    
    public void Ligar(){
        this.setLigado(true);
        this.canal = 1;
        this.volume = 10;
    }
    
    public void Desligar(){
        this.setLigado(false);
        this.canal = 0;
        this.volume = 0;
    }

    @Override
    public String toString() {
        String aux = "TELEVISÃO: "
                    + "\nVoltagem: " + this.getVoltagem()
                    + "\nTamanho: " +this.tamanho
                    + "\nVolume: " +this.volume
                    + "\nCanal: " +this.getCanal();
        if (this.isLigado()){
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