public class Rectangulo implements Figuras{

    private double a;
    private double b;

    public Rectangulo(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double Area() {
        return a*b;
    }

    @Override
    public double Perimetro() {
        return (a*2)+(b*2);
    }
}
