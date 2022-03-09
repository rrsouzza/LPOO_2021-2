package Unidade4_3_5;
public class AutomovelDeLuxo extends AutomovelBasico {
    private boolean direcaoHidraulica, cambioAutomatico, vidroETravaEletrica;
    private static int numeroMaximoPrestacoes = 36;

    public AutomovelDeLuxo(String modelo, String cor, int combustivel, boolean retrovisor, boolean limpador, boolean radio, boolean direcao, boolean cambio, boolean vidro){
        super(modelo, cor, combustivel, retrovisor, limpador, radio);
        this.direcaoHidraulica = direcao;
        this.cambioAutomatico = cambio;
        this.vidroETravaEletrica = vidro;
    }
    
    public int NumeroPrestacoes(){
        return AutomovelDeLuxo.numeroMaximoPrestacoes;
    }

    @Override    
    public float Valor(){
        float valorTotal = super.Valor();
        if (isDirecaoHidraulica()){
            valorTotal += 2500;
        }
        if (isCambioAutomatico()){
            valorTotal += 3000;
        }
        if (isVidroETravaEletrica()){
            valorTotal += 1700;
        }
        return valorTotal;
    }

    @Override
    public String toString() {
        return "\nModelo: " +
        getModelo()+ "\nCor: " +
        getCor() + "\nCombustível: " +
        CombustivelConverter() + "\nRetrovisor do passageiro: " +
        isRetrovisorDoPassageiro()+ "\nLimpador traseiro: " +
        isLimpadorTraseiro()+ "\nRádio AM/FM: " +
        isRadioAmFm() + "\nDireção hidráulica: " +
        isDirecaoHidraulica() + "\nCâmbio Automático: " +
        isCambioAutomatico() + "\nVidro e Trava Elétricos: " +
        isVidroETravaEletrica() + "\nValor: " +
        Valor() + ".\n\n";
    }

    public boolean isDirecaoHidraulica() {
        return this.direcaoHidraulica;
    }
    public void setDirecaoHidraulica(boolean direcaoHidraulica) {
        this.direcaoHidraulica = direcaoHidraulica;
    }
    public boolean isCambioAutomatico() {
        return this.cambioAutomatico;
    }
    public void setCambioAutomatico(boolean cambioAutomatico) {
        this.cambioAutomatico = cambioAutomatico;
    }
    public boolean isVidroETravaEletrica() {
        return this.vidroETravaEletrica;
    }
    public void setVidroETravaEletrica(boolean vidroETravaEletrica) {
        this.vidroETravaEletrica = vidroETravaEletrica;
    }
}