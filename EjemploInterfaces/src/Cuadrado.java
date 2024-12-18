public class Cuadrado implements Figuras{

    private double lado;

    public Cuadrado(double lado){
        this.lado = lado;
    }

    @Override
    public double perimetro() {
        return 4 * this.lado;
    }

    @Override
    public double area() {
        return this.lado * this.lado;
    }

}
