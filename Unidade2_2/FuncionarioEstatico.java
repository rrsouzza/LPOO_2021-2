package Unidade2_2;
public class FuncionarioEstatico {
    private String nome;
    private double salario;
    /*final ?!*/ private double salarioMinimo = 1065.00;
    private FuncionarioEstatico[] VetFuncionario = new FuncionarioEstatico[3];   

    public FuncionarioEstatico(){        
    }
    
    public FuncionarioEstatico(String nome, double salario) {
        if (salario < this.salarioMinimo){
            salario = salarioMinimo;
        }
        this.nome = nome;
        this.salario = salario;
    }

    public void InsereVetor(){
        for (int i=0; i<3; i++){
            if (this.VetFuncionario[i] == null){                
                this.VetFuncionario[i] = new FuncionarioEstatico(this.getNome(), this.getSalario());                
            }
        }        
    }

    public FuncionarioEstatico[] RetornaVetor(){
        return this.VetFuncionario;
    }

    public void LimpaVetor(){
        for (int i=0; i<3; i++){
            this.VetFuncionario[i] = null;
        }        
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
        if (salario < this.salarioMinimo){
            salario = salarioMinimo;
        }else{
            this.salario = salario;
        }        
    }
    public double getSalarioMinimo(){
        return this.salarioMinimo;
    }
    public void setSalarioMinimo(double salarioMinimoParam){
        if (salarioMinimoParam < this.salarioMinimo){
            this.salarioMinimo = 1065.00;
        }else{
            this.salarioMinimo = salarioMinimoParam;
        }        
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