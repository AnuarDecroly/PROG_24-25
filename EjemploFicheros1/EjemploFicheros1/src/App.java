import java.io.File;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        File file = new File("./resources/pelis.txt");
        if (file.exists()) {
            System.out.println("Existe el fichero");
            System.out.println("Nº de bytes que ocupa: " + file.length());
            System.out.println("Nombre de archivo: " + file.getName());
            System.out.println("Ruta: " + file.getPath());
            System.out.println("¿Es un fichero oculto? " + file.isHidden());
            System.out.println("¿Está permitida la escritura? " + file.canWrite());
            System.out.println("¿Está permitida la lectura? " + file.canRead());
        }
        else {
            System.out.println("El fichero no existe"); 
        }

        //Segundo ejemplo
        File folder = new File("./resources/");
        File newFile = new File(folder, "Pelis2.txt");
        try {
            if(!newFile.exists()){ // newFile.exists() == false
                boolean isOk = newFile.createNewFile();
                if(isOk){
                    System.out.println("Se ha creado el fichero correctamente");
                }else{
                    System.out.println("No se ha creado el fichero correctamente");
                }
            }
            else{
                System.out.println("No se ha creado el fichero porque ya existia uno en el sistema");
                boolean isOk = newFile.delete();
                System.out.println("Se ha borrado corectamente: "+isOk);
            }

        } catch (IOException e) {
            System.out.println("Error en : "+e.getMessage());
        }

        

    } 
}

