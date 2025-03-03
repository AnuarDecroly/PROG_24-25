
import java.io.Serializable;

public class Calificacion implements Serializable{

    private static final long serialVersionUID = 1552506707330548334L;

    private String moduloProfesional;
    private int nota;

    public Calificacion(String moduloProfesional, int nota) {
        this.moduloProfesional = moduloProfesional;
        this.nota = nota;
    }

    public String getModuloProfesional() {
        return moduloProfesional;
    }

    public void setModuloProfesional(String moduloProfesional) {
        this.moduloProfesional = moduloProfesional;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Calificacion [moduloProfesional=" + moduloProfesional + ", nota=" + nota + "]";
    }

    

}
