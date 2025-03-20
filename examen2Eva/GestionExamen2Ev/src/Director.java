import java.time.LocalDate;

public class Director extends Trabajador{

    private String numeroTelefono;
    private boolean isOficina;
    private boolean isReunido;


    public Director(String nombre, LocalDate fechaNacimiento, String dni, String nuss, Departamento departamento,
            double salario, String telefono) throws FormatDNIException, FormatNUSSException {
        super(nombre, fechaNacimiento, dni, nuss, departamento, salario);
        this.numeroTelefono = telefono;
        this.isOficina = true;
        this.isReunido = false;
    }


    public String getNumeroTelefono() {
        return numeroTelefono;
    }


    public boolean isOficina() {
        return isOficina;
    }


    public boolean isReunido() {
        return isReunido;
    }


    public void setOficina(boolean isOficina) {
        this.isOficina = isOficina;
    }


    public void setReunido(boolean isReunido) {
        this.isReunido = isReunido;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Director{");
        sb.append("numeroTelefono=").append(numeroTelefono);
        sb.append(", isOficina=").append(isOficina);
        sb.append(", isReunido=").append(isReunido);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

    

}
