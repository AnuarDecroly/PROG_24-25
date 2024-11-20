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

    }
}
