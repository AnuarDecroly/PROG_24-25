import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Producto> inventario = new LinkedList<>();

        try (FileReader file = new FileReader("Resources\\productos.csv"); BufferedReader buffer = new BufferedReader(file)) {

            String linea = buffer.readLine();
            while(linea != null){
                String [] elementos = linea.split("/");
                Producto p = new Producto(elementos[0], elementos[1], elementos[2], elementos[3]);
                inventario.add(p);
                linea = buffer.readLine();
            }
            
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

//Lectura de ficheros binarios
        boolean eof = false;
        try (FileInputStream fichero = new FileInputStream("Resources\\almacen.dat"); DataInputStream lector = new DataInputStream(fichero)) {
            int pos = 0;
            while(!eof){
                if(pos < inventario.size()){
                    inventario.get(pos).setCantidad(lector.readInt());
                    inventario.get(pos).setPrecio(lector.readDouble());
                    inventario.get(pos).setDescuento(lector.readInt());
                    inventario.get(pos).setIva(lector.readInt());
                    inventario.get(pos).setAplicarDto(lector.readBoolean());
                    pos++;
                }
                else{
                    eof = true;
                }
            }
            
        } catch (EOFException e) {
            eof = true;
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

        //OPCION 1
        for(Producto p : inventario){
            System.out.println(p);
        }

        //OPCION 2
        String ref= "ref-005";
        Producto proliminar = null;
        for(Producto p : inventario){
            if(p.getReferencia().equalsIgnoreCase(ref)){
                p.setCantidad(0);
                proliminar = p;
            }
        }

        inventario.remove(proliminar);


        //OPCION 3
        try (FileOutputStream fichero = new FileOutputStream("Resources\\almacen.dat", false); DataOutputStream escritor = new DataOutputStream(fichero)) {

            for (Producto p : inventario) {
                escritor.writeInt(p.getCantidad());
                escritor.writeDouble(p.getPrecio());
                escritor.writeInt(p.getDescuento());
                escritor.writeInt(p.getIva());
                escritor.writeBoolean(p.isAplicarDto());
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //OPCION 4
        Producto nuevo = new Producto("ref-006", "Zanahorias", "Bolsa de 5kg", "Alimentacion");

        try (FileWriter file = new FileWriter("Resources\\productos.csv", true); BufferedWriter escritor = new BufferedWriter(file)) {
            escritor.write(nuevo.escribirFicheroUnicode());
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
