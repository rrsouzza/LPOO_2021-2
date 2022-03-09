package AvaliacaoC1;
public class Principal {
    public static void main(String[] args) {        
        Equipamento eqp1 = new Equipamento(001, "carro");
        Equipamento eqp2 = new Equipamento(002, "carro");
        Equipamento eqp3 = new Equipamento(003, "carro");
        Equipamento eqp4 = new Equipamento(004, "carro");
        Equipamento eqp5 = new Equipamento(005, "carro");
        Equipamento[] vetorEqp = {eqp1, eqp2, eqp3, eqp4, eqp5};
        Equipamento.TentarLocar(vetorEqp, 002);
    }
}
