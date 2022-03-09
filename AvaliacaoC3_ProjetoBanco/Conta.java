package Unidade4_10_3;
public class Conta implements Transacao{
    private int numeroConta;
    private String cliente;
    private double saldo;

    public Conta(){}
    public Conta(int numeroConta, String nomeCliente){
        this.numeroConta = numeroConta;
        this.cliente = nomeCliente;
        this.saldo = 0;
    }
    
    public int Deposito(double valor){        
        try{
            this.saldo += valor;
            return 1;
        }catch (Error e){
            return 0;
        }        
    }

    public int Saque(double valor){
        if (this.saldo >= valor){
            try{
                this.saldo -= valor;
                return 1;
            }
            catch (Exception e){                
                return 2;
            }
        }else{
            return 0;
        }
    }

    public String Saldo(){
        return "========================="+
            "Nº da Conta: " +getNumeroConta()+
            "Saldo da Conta: R$" +getSaldo();
    }

    public int Transferencia(double valor, Conta conta){
        if (this.saldo >= valor){
            try{
                this.saldo -= valor;
                conta.setSaldo(conta.getSaldo() + valor);
                return 1;
            }
            catch (Exception e){
                return 2;
            }
        }else{
            return 0;
        }
    }
    
    public int getNumeroConta() {
        return this.numeroConta;
    }
    public void setNumeroConta(int numero) {
        this.numeroConta = numero;
    }
    public String getCliente() {
        return this.cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    public double getSaldo() {
        return this.saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}