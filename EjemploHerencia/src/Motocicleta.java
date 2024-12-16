public class Motocicleta extends Vehiculo{

    private String tipo;
    private int cilindrada;
    private int nRuedas;
    private int nMarchas;

    public Motocicleta(int cilindrada, int nMarchas, int nRuedas, String tipo) {
        this.cilindrada = cilindrada;
        this.nMarchas = nMarchas;
        this.nRuedas = nRuedas;
        this.tipo = tipo;
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
        return "Motocicleta [bastidor=" + bastidor + ", tipo=" + tipo + ", cilindrada=" + cilindrada + ", matricula="
                + matricula + ", nRuedas=" + nRuedas + ", nPlazas=" + nPlazas + ", nMarchas=" + nMarchas + "]";
    }

    public String getTipo() {
        return tipo;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public int getnRuedas() {
        return nRuedas;
    }

    public int getnMarchas() {
        return nMarchas;
    }


    
}
