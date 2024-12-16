public abstract class Vehiculo {

    protected String bastidor;
    protected  String matricula;
    protected int nPlazas;

    public abstract boolean arrancar();

    public abstract boolean detener();

    public String getBastidor() {
        return bastidor;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getnPlazas() {
        return nPlazas;
    }

    @Override
    public String toString() {
        return "Vehiculo [bastidor=" + bastidor + ", matricula=" + matricula + ", nPlazas=" + nPlazas + "]";
    }

    

    

}
