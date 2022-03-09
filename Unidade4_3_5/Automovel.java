package Unidade4_3_5;
public class Automovel{
    private static final int numeroMaximoPrestacoes = 24;
    //private static final int gasolina = 1, flex = 2, diesel = 3, gas = 4;
    private String modelo, cor;
    private int combustivel;    
    
    public Automovel(String modelo, String cor, int combustivel){
        this.modelo = modelo;
        this.cor = cor;
        this.combustivel = combustivel;
    }

    public int NumeroPrestacoes(){
        return numeroMaximoPrestacoes;
    }

    public float Valor(){
        switch(this.combustivel){
            case 1:
                return 60000;
            case 2:
                return 58000;
            case 3:
                return 55000;
            case 4:
                return 52000;
            default:
                return 0;
        }
    }

    public String CombustivelConverter(){
        switch(this.combustivel){
            case 1:
                return "Gasolina";
            case 2:
                return "Flex";
            case 3:
                return "Diesel";
            case 4:
                return "Gás";
            default:
                return "Ar";
        }
    }

    @Override
    public String toString() {
        return getModelo() + ", " +
        getCor() + ", movido a " +
        CombustivelConverter() + ", custa " +
        Valor() + ".\n\n";
    }    
    public String getModelo() {
        return this.modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getCor() {
        return this.cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }   
    public int getCombustivel() {
        return this.combustivel;
    }
    public void setCombustivel(int combustivel) {
        this.combustivel = combustivel;
    }
}