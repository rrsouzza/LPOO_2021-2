package Unidade4_6_1;
import java.util.Date;
public class Amigo extends Pessoa{
    private Date diaDoAniversario;

    public Amigo() {    }

    public Amigo(String nome, char sexo, int idade, Date diaDoAniversario) {
        super(nome, sexo, idade);
        this.diaDoAniversario = diaDoAniversario;
    }

    public Date getDiaDoAniversario() {
        return this.diaDoAniversario;
    }
    public void setDiaDoAniversario(Date diaDoAniversario) {
        this.diaDoAniversario = diaDoAniversario;
    }    

    @Override
    public String toString() {
        return 
            "{" +
            " diaDoAniversario='" + getDiaDoAniversario() + "'" +
            "}";
    }
}