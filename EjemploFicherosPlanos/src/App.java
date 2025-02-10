import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        
        //Abrir el fichero
        FileWriter file = null;
        try {
            file = new FileWriter("./resources/series.txt", false);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //Abrir el buffer y escribir
        if(file != null){
            BufferedWriter writer =  new BufferedWriter(file);
            try {
                writer.write("TOP Series DAW1");
                writer.newLine();
                writer.write("Breaking Bad");
                writer.newLine();
                writer.write("Juego de Tronos");
                writer.newLine();
                writer.write("Lost");
                writer.newLine();
                writer.write("One Piece");
                writer.newLine();

            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

            //Cerrar buffer y fichero
            try{
                writer.close();
                file.close();
            }catch(IOException e){
                System.out.println(e.getMessage());
            }
        }



        //Opcion 2: mas mejor

        try(FileWriter file2 =  new FileWriter("./resources/series2.txt", true); BufferedWriter writer =  new BufferedWriter(file2);){

            writer.write("TOP Series2 DAW1");
            writer.newLine();
            writer.write("Breaking Bad");
            writer.newLine();
            writer.write("Juego de Tronos");
            writer.newLine();
            writer.write("Lost");
            writer.newLine();
            writer.write("One Piece");
            writer.newLine();
            writer.write(65); //valor del codigo ASCII
            writer.newLine();

        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        
        
        List<Producto> productos = new LinkedList<>();

        //Lectura de fichero
        try (FileReader file2 = new FileReader("./resources/datos.csv"); BufferedReader reader = new BufferedReader(file2);) {
            String linea = reader.readLine();
            while(linea != null){
                
                String[] datos = linea.split(",");
                Producto p =  new Producto(datos[0], Integer.parseInt(datos[1]), Double.parseDouble(datos[2]), Integer.parseInt(datos[3]));

                productos.add(p);

                linea = reader.readLine();
            }

            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //Pinto por pantalla mis lista de productos
        for (Producto linea : productos) {
            System.out.println(linea);
        }
    }
}
