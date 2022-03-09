package ExercicioAvaliativo_C1;
public class Alvo {
    public static int vida = 3;    //atributo de classe (igual para todos os objetos)
    private int posx, posy;     //atributo de instância (diferente para cada objeto)
    private char cor;       //atributo de instância (diferente para cada objeto)

    public Alvo(){}

    public Alvo(int coordx, int coordy, char color){
        this.posx = coordx;
        this.posy = coordy;
        this.cor = color;
    }

    public char Atira(int coordx, int coordy){
        if ((coordx == this.getPosX()) && (coordy == this.posy)){
            if (this.cor == 'P'){
                Alvo.vida--;
                return 'P';
            }else if (this.cor == 'B'){
                Alvo.vida++;
                return 'B';
            }
        }
        return 'N';
    }

    public int getVida() {
        return Alvo.vida;
    }
    public int getPosX() {
        return this.posx;
    }
    public void setPosX(int coord) {
        this.posx = coord;
    }
    public int getPosY() {
        return this.posy;
    }
    public void setPosY(int coord) {
        this.posy = coord;
    }
    public char getCor() {
        return this.cor;
    }
    public void setCor(char color) {
        this.cor = color;
    }
    
    public String toString() {
        return "{" +
            " posx='" + this.posx + "'" +
            ", posy='" + this.posy + "'" +
            ", cor='" + getCor() + "'" +
            "}";
    }
}