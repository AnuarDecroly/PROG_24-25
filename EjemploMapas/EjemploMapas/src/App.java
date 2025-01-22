import java.util.Map;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) throws Exception {
        
        Map<String, Persona> alumnos = new TreeMap<>();

        Persona p1 = new Persona("Pepe","7200000Y",33);
        Persona p2 = new Persona("Paco","7200000Z", 25);
        Persona p3 = new Persona("Maria","7200000M",30);
        Persona p4 = new Persona("Paula","7200000P",40);

        alumnos.put(p1.getDni(), p1);
        alumnos.put(p2.getDni(), p2);
        alumnos.put(p3.getDni(), p3);
        alumnos.put(p4.getDni(), p4);

        p1.setDireccion("Mi casa");
        p1.setTelefono("942000001");

        //System.out.println(alumnos.get(p1.getDni()));

        for(String dni : alumnos.keySet()){
            if(dni.equalsIgnoreCase("7200000Z")){
                System.out.println(alumnos.get(dni));
            }
        }

        for(Persona p : alumnos.values()){
            if(p.getDni().equalsIgnoreCase("7200000Z")){
                System.out.println(p);
            }
        }

        System.out.println("PINTAR TODOS LOS ELEMENTOS DEL MAPA \n");
        for(String dni : alumnos.keySet()){
            System.out.println(alumnos.get(dni));
        }


    }
}
