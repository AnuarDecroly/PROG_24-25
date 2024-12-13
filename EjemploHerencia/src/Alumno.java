public class Alumno extends Persona{

    private String expediente;
    private int curso;
    private double[] notas;
    private String ciclo;

    public Alumno(String nombre, String fechaNacimiento, String direccion, String telefono, String dni, String expediente, int curso, String ciclo){
        super(nombre,dni,fechaNacimiento, direccion, telefono);
        this.expediente = expediente;
        this.ciclo = ciclo;
        this.curso = curso;
    }

    

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public String getExpediente() {
        return expediente;
    }

    public int getCurso() {
        return curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public String getCiclo() {
        return ciclo;
    }

    public String monstrarInfoAlumno(){
        String info = super.mostrarInfo();
        info += "Expediente: "+this.expediente+" Ciclo: "+this.ciclo+ " Curso: "+this.curso+ "\n";
        return info;
    }

    @Override
    public String mostrarInfo(){
        String info = super.mostrarInfo();
        info += "Expediente: "+this.expediente+" Ciclo: "+this.ciclo+ " Curso: "+this.curso+ "\n";
        return info;
    }

    public void test(){
        this.mostrarInfo();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        //sb.append(super.toString());
        sb.append("Alumno{");
        sb.append("nombre=").append(super.getNombre());
        sb.append(", dni=").append(super.getDni());
        sb.append(", fechaNacimiento=").append(super.getFechaNacimiento());
        sb.append(", direccion=").append(super.getDireccion());
        sb.append(", telefono=").append(super.getTelefono());
        sb.append("expediente=").append(this.expediente);
        sb.append(", curso=").append(this.curso);
        sb.append(", notas=").append(this.notas);
        sb.append(", ciclo=").append(this.ciclo);
        sb.append('}');
        return sb.toString();
    }


}
