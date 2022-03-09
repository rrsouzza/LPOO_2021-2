package Unidade4_10_3;
public class ContaEspecial extends Conta{
    private double limite;
    private static double taxa;

    public ContaEspecial(){}
    public ContaEspecial(int numeroConta, String nomeCliente){
        super(numeroConta, nomeCliente);
        this.limite = 10000;
        ContaEspecial.taxa = 5;
    }
    
    public int Atualiza(int numDias){
        double juros = 0, novoSaldo = 0;
        if (this.getSaldo() < 0){
            juros = (numDias * ContaEspecial.taxa / 30);
            novoSaldo = this.getSaldo() + ((juros * this.getSaldo()) / 100);
            this.setSaldo(novoSaldo);
            return 1;
        }else{
            return 0;
        }
    }

    public double getLimite() {
        return this.limite;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }
}