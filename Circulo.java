public class Circulo implements Figuras{

    private double a;

    public Circulo(double a) {
        this.a = a;
    }

    @Override
    public double Area() {
        return Math.PI*Math.pow(a,2);
    }

    @Override
    public double Perimetro() {
        return (2*Math.PI)*a;
    }
}
