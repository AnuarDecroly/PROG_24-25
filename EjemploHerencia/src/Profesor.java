public class Profesor extends Persona{
    String cod;
    String departamento;
    String[] asignaturas;

    public Profesor(String nombre, String dni, String fechaNacimiento, String direccion, String telefono, String cod, String departamento){

        super(nombre,dni,fechaNacimiento,direccion,telefono);

        this.cod = cod;
        this.departamento = departamento;
    }

    public String getCod() {
        return cod;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String[] getAsignaturas() {
        return asignaturas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Profesor{");
        sb.append("nombre=").append(super.getNombre());
        sb.append(", dni=").append(super.getDni());
        sb.append(", fechaNacimiento=").append(super.getFechaNacimiento());
        sb.append(", direccion=").append(super.getDireccion());
        sb.append(", telefono=").append(super.getTelefono());
        sb.append("cod=").append(cod);
        sb.append(", departamento=").append(departamento);
        sb.append(", asignaturas=").append(asignaturas);
        sb.append('}');
        return sb.toString();
    }

    
}
