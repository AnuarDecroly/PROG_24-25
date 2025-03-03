import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class Alumno implements Serializable{

    private static final long serialVersionUID = 8640540088958824335L;
    
    private String nombre;
    private String apellidos;
    private String DNI;
    private List<Calificacion> calificaciones;

    public Alumno(String nombre, String apellidos, String DNI){
        this.nombre =  nombre;
        this.apellidos = apellidos;
        this.DNI =  DNI;
        this.calificaciones = new LinkedList<>();

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }


    public String getDNI() {
        return DNI;
    }

    @Override
    public String toString() {
        return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", DNI=" + DNI + "]";
    }

    public void calificar(String modulo, int nota){
        this.calificaciones.add(new Calificacion(modulo, nota));
    }

    public List<Calificacion> getCalificaciones() {
        return calificaciones;
    }

    



    
    


}
