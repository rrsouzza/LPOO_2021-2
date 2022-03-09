package Unidade4_8_1;
public class Radio extends Eletrodomestico{
    private int banda, volume;
    private double sintonia;
    private final int am = 1, fm = 2;

    public Radio(int voltagem){
        super(voltagem);
    }

    public int getBanda() {
        return this.banda;
    }
    public void setBanda(int banda) {
        this.banda = banda;
    }
    public int getVolume() {
        return this.volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public double getSintonia() {
        return this.sintonia;
    }
    public void setSintonia(double sintonia) {
        this.sintonia = sintonia;
    }
    public int getAm() {
        return this.am;
    }
    public int getFm() {
        return this.fm;
    }

    @Override
    public void Ligar(){
        super.setLigado(true);
        this.volume = 10;
        this.banda = fm;
        this.sintonia = 88.1;        
    }
    @Override
    public void Desligar(){
        super.setLigado(false);
        this.volume = 0;
        this.sintonia = 0;
    }

    @Override
    public String toString() {
        String aux = "RÁDIO: "
                    + "\nVoltagem: " + super.getVoltagem()
                    + "\nVolume: " +this.volume
                    + "\nSintonia: " +this.sintonia;
        if (this.banda == am){
            aux += "\nBanda: AM";
        }else{
            aux += "\nBanda : FM";
        }
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