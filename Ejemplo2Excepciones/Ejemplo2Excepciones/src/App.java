import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        try (Scanner lector = new Scanner(System.in);){
            String linea = lector.nextLine();
            
        } catch (Exception e) {
        }

        
        
        


        try {
            ejecutarTarea1();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
            public static void ejecutarTarea1() throws FileNotFoundException {
                ejecutarTarea2();
            }
            
            
            public static void ejecutarTarea2() throws FileNotFoundException {
                FileReader fichero = new FileReader("c:/datos.txt");
                System.out.println("El fichero ha sido abierto");
            } 
}

