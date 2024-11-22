public class App {
    public static void main(String[] args) throws Exception {
        //MiUtils.leerDoublePantalla("Introduce tu altura");
        final String patronDNI = "[0-9]{7,8}[A-Za-z]";
        final String pantronIBAN = "[A-Z]{2}[0-9]{22}";

        
        String dni = MiUtils.comprobarPatronRepetidamente(patronDNI, "Introduce tu DNI");
        
        String iban = MiUtils.comprobarPatronRepetidamente(pantronIBAN, "Introduce tu IBAN");

    }
}
