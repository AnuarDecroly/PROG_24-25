
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Alumno> alumnosLeidos = new LinkedList<>();
        Alumno a = new Alumno("Pepe", "Garcia Blanco", "12345678-X");

        a.calificar("Programacion", 4);
        a.calificar("LLMM", 6);
        a.calificar("BBDD", 5);

        Alumno a2 = new Alumno("Paco", "Grande Escudero", "87654321-Z");

        a2.calificar("Programacion", 7);
        a2.calificar("LLMM", 9);
        a2.calificar("BBDD", 9);

        //Escritura del objeto
        try (FileOutputStream file = new FileOutputStream("src\\Resources\\alumno.dat", false); ObjectOutputStream buffer = new ObjectOutputStream(file)){
            buffer.writeObject(a);
            buffer.writeObject(a2);
            
        } catch (IOException e) {
            System.out.println("Se ha producido un error: "+e.getMessage());
        }

        //Lectura del objeto
        boolean eof = false;
        try (FileInputStream file = new FileInputStream("src\\Resources\\alumno.dat"); ObjectInputStream reader = new ObjectInputStream(file)){
            while(!eof){
                Alumno aLeido = (Alumno) reader.readObject();
                alumnosLeidos.add(aLeido);
            }
        } catch (EOFException e) {
            eof = true;
            System.out.println("Se ha leido el fichero completo");
        } catch (IOException e) {
            System.out.println("Se ha producido un error: "+e.getMessage());
        }
        catch (ClassNotFoundException e) {
            System.out.println("Se ha producido un error: "+e.getMessage());
        }

        for (Alumno al : alumnosLeidos) {
            System.out.println(al);
        }

        //Lectura del objeto con el metodo available
        int bytesRestantes;

        try (FileInputStream file = new FileInputStream("src\\Resources\\alumno.dat"); ObjectInputStream reader = new ObjectInputStream(file)){

            bytesRestantes = file.available();

            while(bytesRestantes > 0){
                Alumno aLeido = (Alumno) reader.readObject();
                alumnosLeidos.add(aLeido);
                bytesRestantes = file.available();
            }
        } catch (IOException e) {
            System.out.println("Se ha producido un error: "+e.getMessage());
        }
        catch (ClassNotFoundException e) {
            System.out.println("Se ha producido un error: "+e.getMessage());
        }
        System.out.println("Datos leidos con el metodo available");
        for (Alumno al : alumnosLeidos) {
            System.out.println(al);
        }
    }
}
