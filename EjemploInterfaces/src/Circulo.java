public class Circulo implements Figuras{

    private double radio;

    public Circulo (double radio){
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    @Override
    public double perimetro() {
        return 2* this.PI * this.radio;
    }

    @Override
    public double area() {
        return this.PI * Math.pow(this.radio, 2);
    }

    

}
