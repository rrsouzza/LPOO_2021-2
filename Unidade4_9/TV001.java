package Unidade4_9;

public class TV001 extends TV implements ControleRemoto{
    public TV001(int voltagem, int tamanho){
        super(voltagem, tamanho);
    }

    @Override
    public void mudaCanal(int novoCanal){
        if (super.isLigado()){
            super.setCanal(novoCanal);
        }
    }
    
    @Override
	public void aumentaVolume(){
        if (super.isLigado() && super.getVolume() != 100){
            super.setVolume(super.getVolume() + 1);
        }
    }

    @Override
	public void diminuiVolume(){
        if (super.isLigado() && super.getVolume() != 0){
            super.setVolume(super.getVolume() - 1);
        }
    }

    @Override
	public void ligarDesligar(){
        if (super.isLigado()){
            super.Desligar();
        }else{
            super.Ligar();
        }
    }

    @Override
    public void aumentarCanal(){
        if (super.isLigado()){
            super.setCanal(super.getCanal() + 1);
        }
    }

    @Override
    public void diminuirCanal(){
        if (super.isLigado()){
            super.setCanal(super.getCanal() - 1);
        }
    }   
}