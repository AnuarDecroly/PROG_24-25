
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Persona> misPersonas = new ArrayList<Persona>();

        Persona pp = new Persona("72000000Y", LocalDate.now(), "Pepito Grillo");

        misPersonas.add(pp);
        int index = misPersonas.indexOf(pp);
        misPersonas.remove(index);
        //misPersonas.remove(misPersonas.indexOf(pp));

        misPersonas.add(new Persona("72000001Y", LocalDate.now(), "Sancho Panza"));

        misPersonas.add(new Persona("72000002Y", LocalDate.now(), "Obi Wan"));


        // Crear un ArrayList de tipo String
        ArrayList<String> nombres = new ArrayList<String>();

        // Agregar 10 nombres al ArrayList
        nombres.add("Ana");
        nombres.add("Carlos");
        nombres.add("Maria");
        nombres.add("Jorge");
        nombres.add("Laura");
        nombres.add("Pedro");
        nombres.add("Marta");
        nombres.add("Luis");
        nombres.add("Sofia");
        nombres.add("Andres");

        String nombreToRemove = "Pedro";

        Iterator<String> itera = nombres.iterator();
        String name;

        while (itera.hasNext()) {
            name = itera.next();
            if(name.equalsIgnoreCase(nombreToRemove)){
                itera.remove();
            }
        } 


        // Recorrer el ArrayList utilizando un bucle foreach
        int pos = -1;
        for (String nombre : nombres) {
            if(nombre.equalsIgnoreCase(nombreToRemove)){
                System.out.println("Registro encontrado: ");
                System.out.println(nombre+"\n");
                pos = nombres.indexOf(nombre);
                return;
            }
        }


        nombres.remove(pos);

        for (String nombre : nombres) {
            System.out.println(nombre);
        }


    }
}
