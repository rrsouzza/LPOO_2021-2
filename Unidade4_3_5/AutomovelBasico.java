package Unidade4_3_5;
public class AutomovelBasico extends Automovel {
    private boolean retrovisorDoPassageiro, limpadorTraseiro, radioAmFm;    
    
    public AutomovelBasico(String modelo, String cor, int combustivel, boolean retrovisor, boolean limpador, boolean radio){
        super(modelo, cor, combustivel);
        this.retrovisorDoPassageiro = retrovisor;
        this.limpadorTraseiro = limpador;
        this.radioAmFm = radio;
    }

    @Override
    public float Valor(){         
        float valorTotal = super.Valor();
        if (isRetrovisorDoPassageiro()){
            valorTotal += 1250;
        }
        if (isLimpadorTraseiro()){
            valorTotal += 500;
        }
        if (isRadioAmFm()){
            valorTotal += 1500;
        }
        return valorTotal;
    }

    @Override
    public String toString(){        
        return "\nModelo: " +
        getModelo()+ "\nCor: " +
        getCor() + "\nCombustível: " +
        CombustivelConverter() + "\nRetrovisor do passageiro: " +
        isRetrovisorDoPassageiro()+ "\nLimpador traseiro: " +
        isLimpadorTraseiro()+ "\nRádio AM/FM: " +
        isRadioAmFm() + "\nValor: " +
        Valor() + ".\n\n";
    }
    public boolean isRetrovisorDoPassageiro(){
        return this.retrovisorDoPassageiro;
    }    
    public void setRetrovisorDoPassageiro(boolean retrovisorDoPassageiro) {
        this.retrovisorDoPassageiro = retrovisorDoPassageiro;
    }
    public boolean isLimpadorTraseiro() {
        return this.limpadorTraseiro;
    }    
    public void setLimpadorTraseiro(boolean limpadorTraseiro) {
        this.limpadorTraseiro = limpadorTraseiro;
    }
    public boolean isRadioAmFm() {
        return this.radioAmFm;
    }
    public void setRadioAmFm(boolean radioAmFm) {
        this.radioAmFm = radioAmFm;
    }
}