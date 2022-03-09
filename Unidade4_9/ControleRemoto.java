package Unidade4_9;
public interface ControleRemoto {
    //Interface nao tem atributos
    //Interface nao tem construtor
    //Não tem getters e setters
    //Só tem cabeçalho de métodos
    //E cada método termina com um ponto-e-vírgula (;)
	
//  Mudar de Canal, Aumentar volume, Diminuir volkume, Ligar/Desligar
	public void mudaCanal (int novoCanal);
	public void aumentaVolume ();
	public void diminuiVolume();
	public void ligarDesligar ();
    public void aumentarCanal();
    public void diminuirCanal();
}