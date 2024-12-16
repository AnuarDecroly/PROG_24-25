public class  Coche extends Vehiculo{

    private String tipoMotor;
    private int cvs;
    private int nMarchas;
    private int cilindrada;

    public Coche(int cilindrada, int cvs, int nMarchas, String tipoMotor) {
        this.cilindrada = cilindrada;
        this.cvs = cvs;
        this.nMarchas = nMarchas;
        this.tipoMotor = tipoMotor;
    }

    @Override
    public boolean arrancar() {
        return true;
    }

    @Override
    public boolean detener() {
        return true;
    }

    @Override
    public String toString() {
        return "Coche [bastidor=" + bastidor + ", tipoMotor=" + tipoMotor + ", cvs=" + cvs + ", matricula=" + matricula
                + ", nMarchas=" + nMarchas + ", nPlazas=" + nPlazas + ", cilindrada=" + cilindrada + "]";
    }

    


}
