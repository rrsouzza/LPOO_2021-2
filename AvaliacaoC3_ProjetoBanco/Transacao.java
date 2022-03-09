package Unidade4_10_3;
public interface Transacao {
    //Interface não tem atributos
    //Interface não tem construtor
    //Não tem getters e setters
    //Só tem cabeçalho de métodos
    //E cada método termina com um ponto-e-vírgula (;)

    public int Deposito(double valor);
    public int Saque(double valor);
    public String Saldo();
    public int Transferencia(double valor, Conta conta);
}