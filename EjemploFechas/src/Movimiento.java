import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Movimiento {

    private DateTimeFormatter formatter = DateTimeFormatter
        .ofPattern("dd-MM-yyyy HH:mm:ss");

    private LocalDateTime fechaMovimiento;
    private TipoMovimiento tipo;

    public Movimiento(TipoMovimiento tipo) {
        this.fechaMovimiento = LocalDateTime.now();
        this.tipo = tipo;

    }


    public void ModificarFecha(String fechaModificada){

        this.fechaMovimiento = LocalDateTime.parse(fechaModificada, formatter);
    }

    public void crearMovimiento(TipoMovimiento tipoMovimiento){
        if(tipoMovimiento == TipoMovimiento.INGRESO){

        }
    }

    public String infoMovimiento(){
        return "Movimiento: "+tipo.getDescripcion() + "Fecha: "+this.fechaMovimiento.format(formatter);
    }

    public LocalDateTime getFechaMovimiento() {
        return this.fechaMovimiento;
    }

    public TipoMovimiento getTipo() {
        return this.tipo;
    }

    

}
