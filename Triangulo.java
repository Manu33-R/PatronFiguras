public class Triangulo implements Figuras{

    private double a;
    private double b;
    private double c;

    public Triangulo(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double Area() {
        return Math.sqrt((Perimetro()/2)*(Perimetro()/2-a)*(Perimetro()/2-b)*(Perimetro()/2-c));
    }

    @Override
    public double Perimetro() {
        return a+b+c;
    }
}
