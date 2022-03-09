package ExercicioAvaliativo_C2;
public interface Despesa {
    //Interface não tem atributos
    //Interface não tem construtor
    //Não tem getters e setters
    //Só tem cabeçalho de métodos
    //E cada método termina com um ponto-e-vírgula (;)

    public double Totaliza();
    public void Extorna(DespesaDia objeto);
    public void Acrescenta(DespesaDia objeto);
}