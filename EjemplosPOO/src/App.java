import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Creo mi primer objeto Persona
        Persona pp = new Persona("Pepe Grande", "7200000C");

        //Pinto los valores
        System.out.println(pp.getDni());
        System.out.println(pp.getNombreCompleto());

        //Modifico edad y lo pinto
        pp.setEdad(3);
        System.out.println(pp.getEdad());

        pp.setEdad(7);
        System.out.println(pp.getEdad());


        Persona pGenerico = new Persona();
        System.out.println("Datos persona Generica");
        System.out.println(pGenerico.getDni());
        System.out.println(pGenerico.getNombreCompleto());

        //Modifico edad y lo pinto
        System.out.println(pGenerico.getEdad());
        pGenerico.setEdad(25);

        Persona p2 = new Persona("Pago Grande", "76000X", 45);

        System.out.println(p2.getDni());

        System.out.println("Por favor digame la edad de "+p2.getNombreCompleto());
        Scanner reader = new Scanner(System.in);
        int edadNueva = reader.nextInt();
        p2.setEdad(edadNueva);

        System.out.println("La edad actual es "+p2.getEdad());

        Persona [] misAlumnos =  new Persona[3];
        misAlumnos[0] = new Persona("Pepe", "12334324X", 45);
        for(Persona p :misAlumnos){
            reader =  new Scanner(System.in);
            if(p != null){
                System.out.println(p.getEdad());
                System.out.println(p.getDni());
            }

            System.out.println("Introduzca el nombre");
            String nombre = reader.nextLine();

            System.out.println("Introduzca el dni");
            String dni = reader.nextLine();

            System.out.println("Introduzca la edad");
            int edad = reader.nextInt();

            p = new Persona(nombre, dni, edad);

        }
        misAlumnos[0] = new Persona("Joel Vazquez", "3456789P");

    }
}

