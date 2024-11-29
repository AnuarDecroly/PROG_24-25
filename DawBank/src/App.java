import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido a DawBank tu banco de confianza je je je");

        final String patronIban = "[A-Z]{2}[0-9]{22}";

        String iban = MiUtils.comprobarPatronRepetidamente(patronIban, "Introduzca el IBAN");

        String titular = MiUtils.leerTextoPantalla("Introduzca el titular");

        CuentaBancaria miCuenta = new CuentaBancaria(titular, iban);

        String opcion = "";
        Scanner reader;
        do {
            reader = new Scanner(System.in);
            
            imprimirMenuOpciones();

            opcion = reader.nextLine();

            menuBanca(miCuenta, opcion);


        } while (!opcion.equalsIgnoreCase("8"));
    }

    private static void imprimirMenuOpciones() {
        System.out.println("Escoga la opcion que desee");
        System.out.println("1. Datos de la cuenta");
        System.out.println("2. IBAN");
        System.out.println("3. Titular");
        System.out.println("4. Saldo");
        System.out.println("5. Ingreso");
        System.out.println("6. Retirada");
        System.out.println("7. Movimientos");
        System.out.println("8. Salir");
    }

    private static void menuBanca(CuentaBancaria miCuenta, String opcion) {
        switch (opcion) {
            case "1":
                System.out.println(miCuenta.mostrarInfoCuentaBancaria());
                break;

            case "2":
                System.out.println(miCuenta.getIban());
                break;

            case "3":
                System.out.println(miCuenta.getTitular());
                break;
            case "4":
                System.out.println(miCuenta.getSaldo());
                break;

            case "5":
                double cantidad = MiUtils.leerDoublePantalla("Introduzca la cantidad a ingresar");
                miCuenta.ingresar(cantidad);
                if(cantidad > 3000.0){
                    System.out.println("ALta cantidad: se ejecuta aviso a Hacienda");
                }
                break;

            case "6":
                double cantidadR = MiUtils.leerDoublePantalla("Introduzca la cantidad a retirar");
                if((miCuenta.getSaldo()-cantidadR) < -50){
                    System.out.println("“AVISO: Saldo negativo, no se puede realizar la retirada");
                }
                else{
                    miCuenta.retirar(cantidadR);
                }
                break;

            case "7":
                System.out.println(miCuenta.mostrarInfoMovimientos());
                break;
            case "8":
                System.out.println("Se cerrara el programa. Sayonra baby!!!");
                break;

            default:
                System.out.println("Opcion incorrecta, vuelva a escoger");
        }
    }
}
