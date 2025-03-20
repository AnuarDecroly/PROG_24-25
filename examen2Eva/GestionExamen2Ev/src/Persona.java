import java.time.LocalDate;
import java.util.Objects;

public class Persona {

    protected String nombre;
    protected LocalDate fechaNacimiento;
    protected String dni;
    protected String direccion;

    protected final String dniPatter = "[0-9]{8}[A-Z]{1}";


    public Persona(String nombre, LocalDate fechaNacimiento, String dni, String direccion) throws FormatDNIException {
        if(MiUtils.comprobarPatron(dni,this.dniPatter)){
            this.nombre = nombre;
            this.fechaNacimiento = fechaNacimiento;
            this.direccion = direccion;
            this.dni = dni;
        }
        else{
            throw new FormatDNIException();
        }

        
    }


    public Persona(String nombre, LocalDate fechaNacimiento, String dni) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
    }


    public String getNombre() {
        return nombre;
    }


    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }


    public String getDni() {
        return dni;
    }


    public String getDireccion() {
        return direccion;
    }


    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    @Override
    public String toString() {
        return "nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", dni=" + dni + ", direccion="
                + direccion;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        return Objects.equals(this.dni, other.dni);
    }

    

    



}
