public class Persona {
    
    private String Nombre;
    private String dni;
    private int edad;
    private String direccion;
    private String telefono;
    
    public Persona(String nombre, String dni, int edad) {
        Nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }
    
    public Persona(String nombre, String dni, int edad, String direccion, String telefono) {
        Nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public String getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("Nombre=").append(Nombre);
        sb.append(", dni=").append(dni);
        sb.append(", edad=").append(edad);
        sb.append(", direccion=").append(direccion);
        sb.append(", telefono=").append(telefono);
        sb.append('}');
        return sb.toString();
    }



    
    
    
}
