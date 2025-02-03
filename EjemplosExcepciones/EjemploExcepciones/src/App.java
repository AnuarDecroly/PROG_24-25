import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
     /*  //Primer ejemplo  
        int a = 23;
        int b = 0;

        int result = -1;

        try {
            result = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Se ha producido un error: "+e.getMessage());
            result = 0;
        }
        finally{
            System.out.println("El resultado es: "+result);
        }
        

        System.out.println("Continuar programa");
        */

        //Segundo ejemplo
        Scanner lector = new Scanner(System.in);


        int radio = -1;
        int radio2 = -1; 

        try {
            System.out.println("Introduce radio de la circunferencia: ");
            String num = lector.nextLine();
            radio = Integer.parseInt(num);
            System.out.println("Introduce radio de la circunferencia 2: ");
            radio2 = lector.nextInt();

        } catch (NumberFormatException e) {
            System.out.println("Ha ocurrido una excepción: "+e.getMessage());
            radio = 1;
            System.out.println("Se toma el valor del radio como 1");
        }
        catch(InputMismatchException e){
            System.out.println("Ha ocurrido una excepción con el radio 2: "+e.getMessage());
            System.out.println("Introduce radio de la circunferencia 2: ");
            lector =  new Scanner(System.in);
            radio2 = lector.nextInt();
        }
        finally{
            lector.close();
        }

        System.out.println("Longitud: " + (2*Math.PI*radio));
        System.out.println("Area: " + (Math.PI*radio*radio));

        System.out.println("Longitud2: " + (2*Math.PI*radio2));
        System.out.println("Area2: " + (Math.PI*radio*radio2));

        
        try {
            FileReader fichero = new FileReader("c:/datos.txt");
        } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado el fichero: "+e.getMessage());
        } finally {
            System.out.println("El fichero ha sido abierto");
        }
        
        
        System.out.println("Fin del programa"); 
    }
}
