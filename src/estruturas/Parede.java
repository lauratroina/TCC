package estruturas;

public class Parede {

    private double x, y, altura, largura, perda;
    private Reta reta;

    public Parede(double x, double y, double largura, double altura, double perda) {
        this.x = x;
        this.y = y;
        this.altura = altura;
        this.largura = largura;
        this.perda = perda;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getPerda() {
        return perda;
    }

    public void setPerda(double perda) {
        this.perda = perda;
    }
    
    public Reta getReta(){
        return reta;
    }
    
    public void setReta(Reta reta){
        this.reta = reta;
    }

}
