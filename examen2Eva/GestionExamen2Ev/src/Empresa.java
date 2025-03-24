
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;

public class Empresa {

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    private String nombreEmpresa;
    private String cif;
    private LocalDate fFundacion;
    private List<Trabajador> trabajadores;

    private GerenteDep GerenteInformatica;
    private GerenteDep GerenteMarketing;
    private GerenteDep GerenteGestion;
    private Director Director;

    public Empresa(String nombreEmpresa, String cif, LocalDate fFundacion) 
    throws FormatCIFException{
        if(MiUtils.comprobarPatron("[A-Z]{1}[0-9]{10}", cif)){
            this.nombreEmpresa = nombreEmpresa;
            this.cif = cif;
            this.fFundacion = fFundacion;
            this.trabajadores = new LinkedList<>();
            this.GerenteGestion = null;
            this.GerenteInformatica = null;
            this.GerenteMarketing = null;
            this.Director = null;
        }
        else{
            throw new FormatCIFException();
        }
    }


    public String getNombreEmpresa() {
        return nombreEmpresa;
    }


    public String getCif() {
        return cif;
    }


    public LocalDate getfFundacion() {
        return fFundacion;
    }


    public List<Trabajador> getTrabajadores() {
        return trabajadores;
    }

    public boolean registrarTrabajador(Trabajador trabajador)
    {
        boolean response = false;
        boolean existeTrabajador = this.comprobarExisteDNI(trabajador.getDni());

        if(!existeTrabajador){
            this.trabajadores.add(trabajador);
            response = true;
        }
        return response;
    }

    public boolean registrarGerente(Trabajador gerente){
        boolean response = false;
        if(gerente.getDepartamento() == Departamento.GESTION){
            if(this.GerenteGestion == null){
                response = this.registrarTrabajador(gerente);
                if(response){
                    GerenteDep ge = (GerenteDep)gerente;
                    for(Trabajador t : this.trabajadores){
                        if(t.getDepartamento() == Departamento.GESTION){
                            ge.registrarTrabajadorDepartamento(t);
                        }
                    }
                    this.GerenteGestion = ge;

                    
                }
            }
        } else if (gerente.getDepartamento() == Departamento.MARKETING) {
            if(this.GerenteMarketing == null){
                response = this.registrarTrabajador(gerente);
                if(response){
                    GerenteDep ge = (GerenteDep)gerente;
                    for(Trabajador t : this.trabajadores){
                        if(t.getDepartamento() == Departamento.MARKETING){
                            ge.registrarTrabajadorDepartamento(t);
                        }
                    }
                    this.GerenteMarketing = ge;
                }
            }
        } else if(gerente.getDepartamento() == Departamento.INFORMATICA){
            if(this.GerenteInformatica == null){
                response = this.registrarTrabajador(gerente);
                if(response){
                    GerenteDep ge = (GerenteDep)gerente;
                    for(Trabajador t : this.trabajadores){
                        if(t.getDepartamento() == Departamento.INFORMATICA){
                            ge.registrarTrabajadorDepartamento(t);
                        }
                    }
                    this.GerenteInformatica = ge;
                }
            }
        }

        return response;
    }


    public boolean registrarDirector(Trabajador trabajador){
        boolean response = false;
        if(this.Director == null){
            response = this.registrarTrabajador(trabajador);
            this.Director = (Director) trabajador;
        }
        return response;
    }
    

    public boolean eliminarTrabajador(String dni){
        boolean response = false;
        Trabajador trabajadorEliminar = null;
        for(Trabajador t : this.trabajadores){
            if(dni.equalsIgnoreCase(t.getDni())){
                trabajadorEliminar = t;
            }
        }

        if(trabajadorEliminar != null){
            this.trabajadores.remove(trabajadorEliminar);

            if(trabajadorEliminar instanceof Director){
                this.Director = null;
            }

            else if(trabajadorEliminar instanceof GerenteDep){
                if(trabajadorEliminar.getDepartamento() == Departamento.GESTION){
                    this.GerenteGestion = null;
                }
                else if (trabajadorEliminar.getDepartamento() == Departamento.MARKETING) {
                    this.GerenteMarketing = null;
                }
                else if (trabajadorEliminar.getDepartamento() == Departamento.INFORMATICA) {
                    this.GerenteInformatica = null;
                }
                
            }
        }
        return response;
    }


    public String mostrarInformacionTrabjadores(){
        String info = "";
        info = "Director: "+this.Director + "\n" +
        "Gerente Marketing: "+this.GerenteMarketing + "\n" +
        "Gerente gestion: " + this.GerenteGestion + "\n" +
        "Gerente Informatica: " + this.GerenteInformatica + "\n";
        for(Trabajador t : this.trabajadores){
            if(t instanceof Trabajador){
                info = info + t.toString() + "\n";
            }
        }
        return info;
    }

    public String reunirEmpresa(){
        String info = "";
        if(this.Director.isOficina() && !this.Director.isReunido()){
            for(Trabajador t : this.trabajadores){
                if(t.isOficina()){
                    info = info + t.toString() + "\n";
                }
            }
        }
        return info;
    }

    public boolean comprobarExisteDNI(String dni)
    {
        boolean existeTrabajador = false;
        if(!this.trabajadores.isEmpty()){
            for(Trabajador t : this.trabajadores){
                if(dni.equalsIgnoreCase(t.getDni())){
                    existeTrabajador = true;
                }
            }
        }
        return existeTrabajador;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empresa{");
        sb.append("nombreEmpresa=").append(nombreEmpresa);
        sb.append(", cif=").append(cif);
        sb.append(", fFundacion=").append(fFundacion.format(formatter));
        sb.append(", trabajadores=").append(trabajadores);
        sb.append('}');
        return sb.toString();
    }

    

    



}
