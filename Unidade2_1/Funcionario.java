package Unidade2_1;
public class Funcionario {
    private String nome;
    private double salario;
    private double salarioMinimo;
    private Funcionario[] VetFunc = new Funcionario[3];

    public Funcionario() {
    }

    public Funcionario(String nome, double salario, double salarioMinimo) {
        this.nome = nome;
        this.salario = salario;
        this.salarioMinimo = salarioMinimo;
    }  

    public int InsereVetor(Funcionario novoFuncionario){
        for (int i=0; i<3; i++){
            if (this.VetFunc[i] == null){
                this.VetFunc[i] = novoFuncionario;
                return 1;
            }
        }
        return -1;
    }

    public Funcionario[] RetornaVetor(){
        return VetFunc;
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalario() {
        return this.salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double getSalarioMinimo() {
        return this.salarioMinimo;
    }
    public void setSalarioMinimo(double salarioMinimo) {
        this.salarioMinimo = salarioMinimo;
    }    

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", salario='" + getSalario() + "'" +
            ", salarioMinimo='" + getSalarioMinimo() + "'" +
            "}";
    }
}