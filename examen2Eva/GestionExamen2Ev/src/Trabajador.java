import java.time.LocalDate;

public class Trabajador extends Persona{

    protected  String nuss;
    protected  String email;
    protected double salario;
    protected boolean isOficina;
    protected Departamento departamento;
    
    protected final String nussPatter = "[0-9]{10}";


    public Trabajador(String nombre, LocalDate fechaNacimiento, String dni,
    String nuss, Departamento departamento, double salario) throws FormatDNIException, FormatNUSSException{
        super(nombre, fechaNacimiento, dni);
        if(MiUtils.comprobarPatron(nuss, this.nussPatter)){
            this.nuss = nuss;
            this.departamento = departamento;
            this.isOficina = true;
            this.salario = salario;
        }
        else{
            throw new FormatNUSSException();
        }
    }


    public String getNuss() {
        return nuss;
    }


    public String getEmail() {
        return email;
    }


    public double getSalario() {
        return salario;
    }


    public boolean isOficina() {
        return isOficina;
    }


    public Departamento getDepartamento() {
        return departamento;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public void setSalario(double salario) {
        this.salario = salario;
    }


    public void setOficina(boolean isOficina) {
        this.isOficina = isOficina;
    }


    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }


    @Override
    public String toString() {
        return "Trabajador [ "+super.toString() +", nuss=" + nuss + ",  email=" + email + ", salario=" + salario + ", isOficina=" + isOficina
                + ", departamento=" + departamento + "]";
    }

    

}
