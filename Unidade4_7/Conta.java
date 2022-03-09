package Unidade4_7;
public class Conta {
    private String nome;
    private long cpf, numConta, numAgencia;

    public Conta(String nome, long cpf, long numConta, long numAgencia){
        this.nome = nome;
        this.cpf = cpf;
        this.numConta = numConta;
        this.numAgencia = numAgencia;
    }

    public String toStringArquivo() {
		return this.nome+";"+this.cpf+";"+this.numAgencia+";"+
				this.numConta;
	}

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public long getCpf() {
        return this.cpf;
    }
    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
    public long getNumConta() {
        return this.numConta;
    }
    public void setNumConta(long numConta) {
        this.numConta = numConta;
    }
    public long getNumAgencia() {
        return this.numAgencia;
    }
    public void setNumAgencia(long numAgencia) {
        this.numAgencia = numAgencia;
    }
}