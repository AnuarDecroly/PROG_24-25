import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        
        //Escritura ficheros binarios

        Producto p1 = new Producto("pro-01", 33, 45.0, 1);
        Producto p2 = new Producto("pro-02", 25, 5.0, 1);
        Producto p3 = new Producto("pro-03", 13, 23.0, 2);

        List<Producto> productos = new LinkedList<>();

        productos.add(p1);
        productos.add(p2);
        productos.add(p3);

        try (FileOutputStream fichero = new FileOutputStream("./resources/productos.dat", false); DataOutputStream escritor = new DataOutputStream(fichero)) {

            for (Producto p : productos) {
                escritor.writeUTF(p.getCod());
                escritor.writeInt(p.getCantidad());
                escritor.writeDouble(p.getPrecio());
                escritor.writeInt(p.getCategoria());
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        
        //Lectura de ficheros binarios
        List<Producto> productosLeidos = new LinkedList<>();
        boolean eof = false;
        try (FileInputStream fichero = new FileInputStream("./resources/productos.dat"); DataInputStream lector = new DataInputStream(fichero)) {
            

            while(!eof){
                String cod = lector.readUTF();
                int cantidad = lector.readInt();
                double precio = lector.readDouble();
                int categoria = lector.readInt();
                Producto p = new Producto(cod, cantidad, precio, categoria);
                productosLeidos.add(p);
            }
            
        } catch (EOFException e) {
            eof = true;
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

        for (Producto p : productosLeidos) {
            System.out.println(p);
        }
    
    }
}
