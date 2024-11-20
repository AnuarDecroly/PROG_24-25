import java.time.LocalDate;

public class Persona {

    private String nombre;
    private String apellidos;
    private String dni;

    private int edad;
    private LocalDate fNacimiento;
    private String direccion;
    private String genero;

    public Persona(String apellidos, String direccion, String dni, LocalDate fNacimiento, String genero, String nombre) {
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.dni = dni;
        this.fNacimiento = fNacimiento;
        this.genero = genero;
        this.nombre = nombre;
    }

    
    public String getNombre() {
        return nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public String getDni() {
        return dni;
    }
    public int getEdad() {
        return edad;
    }
    public LocalDate getfNacimiento() {
        return fNacimiento;
    }
    public String getDireccion() {
        return direccion;
    }
    public String getGenero() {
        return genero;
    }
    

}
