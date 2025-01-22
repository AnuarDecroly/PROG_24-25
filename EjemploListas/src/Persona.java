import java.time.LocalDate;

public class Persona {

    private String nombre;
    private String dni;
    private int edad;
    private LocalDate fechaNacimiento;

    public Persona(String dni, LocalDate fechaNacimiento, String nombre) {
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public int getEdad() {
        return (LocalDate.now().getYear() - this.fechaNacimiento.getYear());
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", dni=" + dni + ", edad=" + edad + ", fechaNacimiento=" + fechaNacimiento
                + "]";
    }

    

    



}
