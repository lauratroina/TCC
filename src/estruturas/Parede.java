package estruturas;

public class Parede {

    private double x, y, altura, largura, perda;

    public Parede(double x, double y, double l, double a, double p) {
        this.x = x;
        this.y = y;
        this.altura = a;
        this.largura = l;
        this.perda = p;
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

}
