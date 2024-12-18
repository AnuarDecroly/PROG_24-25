public class Triangulo implements Figuras{

    private double lado;
    private double altura;

    public Triangulo(double lado, double altura){
        this.lado =  lado;
        this.altura = altura;
    }

    public double getLado() {
        return lado;
    }

    @Override
    public double perimetro() {
        return 3*this.lado;
    }

    @Override
    public double area() {
        return 0.5 * this.lado * this.altura;

    }

    

}
