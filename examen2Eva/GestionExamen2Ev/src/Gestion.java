import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;

public class Gestion {
    public static void main(String[] args) {
        DateTimeFormatter formatterFull = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate fecha =LocalDate.parse("07-05-1983", formatter);

        List<String> opciones1 = new LinkedList<>();

        opciones1.add("A - Opcion 1");
        opciones1.add("B - Opcion 2");
        opciones1.add("C - Opcion 3");
        opciones1.add("D - Opcion 4");
        opciones1.add("S - SALIR");

        String opcion = MiUtils.generarMenu(opciones1);
        System.out.println("Opcion escogida: "+opcion);

        List<String> opciones2 = new LinkedList<>();

        opciones2.add("A - SubOpcion 1");
        opciones2.add("B - SubOpcion 2");
        opciones2.add("C - SubOpcion 3");
        opciones2.add("S - SALIR");

        String opcion2 = MiUtils.generarMenu(opciones2);

        
        
    }

    


}
