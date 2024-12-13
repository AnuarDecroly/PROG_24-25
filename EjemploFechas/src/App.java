import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        LocalDateTime miFecha = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter
        .ofPattern("dd-MM-yyyy HH:mm:ss");
        String text = miFecha.format(formatter);

        LocalDateTime parsedDate = LocalDateTime.parse(text, formatter);

        System.out.println(miFecha.toString());
        System.out.println(text);

        Movimiento m1 = new Movimiento(TipoMovimiento.INGRESO);

        LocalDateTime fechaNacimiento = LocalDateTime.parse("07-05-1983 01:33:00 ", formatter);

        //fechaNacimiento y miFecha
        int n = miFecha.getYear() - fechaNacimiento.getYear();

        if(n > 18){
            System.out.println("Mayor de edad");
        }
        else if(n == 18){
            int m = miFecha.getMonth() - fechaNacimiento.getMonth();
        }
    }
}
