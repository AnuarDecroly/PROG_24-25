
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Movimiento {

    private static int contador = 0;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    private int id;
    private String fecha;
    private Tipo tipo;
    private double cantidad;

    public Movimiento(Tipo tipo, double cantidad) {
        this.fecha = LocalDateTime.now().format(formatter); 
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.id = contador;
        contador++;
    }

    public int getId() {
        return id;
    }

    public String getFecha() {
        return fecha;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public double getCantidad() {
        return cantidad;
    }


    public String mostrarInfoMovimiento(){
        String info = String.format("Movimiento -  id: %s Fecha: %s Tipo: %s Cantidad: %s€", this.id, this.fecha, this.tipo, this.cantidad);
        return info;
    }
    

    

}
