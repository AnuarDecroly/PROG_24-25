import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public class GerenteDep extends Trabajador{

    private int ntrabajadores;
    private String numeroTelefono;
    private List<Trabajador> trabajadoresDep;

    public GerenteDep(String nombre, LocalDate fechaNacimiento, String dni, String nuss, Departamento departamento,
            double salario, String telefono) throws FormatDNIException, FormatNUSSException {
        super(nombre, fechaNacimiento, dni, nuss, departamento, salario);
        this.numeroTelefono = telefono;
        this.trabajadoresDep = new LinkedList<>();
        this.ntrabajadores = this.trabajadoresDep.size();
    }

    public int getNtrabajadores() {
        return this.trabajadoresDep.size();
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public List<Trabajador> getTrabajadoresDep() {
        return trabajadoresDep;
    }

    public boolean registrarTrabajadorDepartamento(Trabajador trabajador){
        boolean response = false;
        boolean existeTrabajador = false;
        if(this.trabajadoresDep.size() > 0){
            for(Trabajador t : this.trabajadoresDep ){
                if(trabajador.getDni().equalsIgnoreCase(t.getDni())){
                    existeTrabajador = true;
                }
            }
        } 

        if(!existeTrabajador){
            this.trabajadoresDep.add(trabajador);
            response = true;
            this.ntrabajadores = this.trabajadoresDep.size();
        }

        return response;
    }

    public String mostrarInfoDepartamento(){
        String info = "";
        double costeSalarial = this.salario;
        info = this.departamento.name() + "\n"
            + "Gerente: " + this.nombre +" ,Numero de trabajadores: "+this.getNtrabajadores() + "\n";
            if(this.getNtrabajadores() > 0){
                info = info + "\n" + "LISTA DE TRABAJORES: \n";
                for(Trabajador t : this.trabajadoresDep){
                    info = info + t.toString() + "\n";
                    costeSalarial += t.getSalario();
                }
            }else{
                info = info + "\n" + "No hay TRABAJORES. \n";
            }

        return (info + "\n Coste salarial: "+costeSalarial);
    }

    public String convocarReunionDepartamento(LocalDateTime fReunion){
        String info = "";
        info = "La reunion del departamento: "+this.departamento.name() +" se convoca a las " + fReunion.toString() + "\n";
        if(this.isOficina){
            info =  info + "Gerente" + this.nombre +"\n";
            if(this.trabajadoresDep.size() > 0){
                for(Trabajador t: this.trabajadoresDep){
                    if(t.isOficina){
                        info = info + "Trabajador: "+ t.getNombre() + ", DNI: "+ t.getDni() +"\n";
                    }
                }
            }
        }

        return info;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GerenteDep{");
        sb.append("ntrabajadores=").append(ntrabajadores);
        sb.append(", numeroTelefono=").append(numeroTelefono);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }



    
}
