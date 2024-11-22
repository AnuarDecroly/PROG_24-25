public class App {
    public static void main(String[] args) throws Exception {
        //MiUtils.leerDoublePantalla("Introduce tu altura");
        final String patronDNI = "[0-9]{7,8}[A-Za-z]";
        final String pantronIBAN = "[A-Z]{2}[0-9]{22}";
        final String patronNombre = "[A-Z]{1}[a-z]{2,48}";

        String titular = MiUtils.comprobarPatronRepetidamente(patronNombre, "Introduce tu nombre");

        String dni = MiUtils.comprobarPatronRepetidamente(patronDNI, "Introduce tu DNI");
        
        String iban = MiUtils.comprobarPatronRepetidamente(pantronIBAN, "Introduce tu IBAN");

    }
}
