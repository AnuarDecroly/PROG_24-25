
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        String [] clientes = new String [10];
        int contador = 0;

        String opcion = "";
        Scanner reader = new Scanner(System.in);

        String miText = "Hola aloh";
        boolean isPalindrome = validPalindrome(miText.replace(" ", "").toLowerCase());

        System.out.println("Es palindromo: "+isPalindrome);

        do{
            System.out.println("1 - Insertar cliente");
            System.out.println("2 - Ver clinetes");
            System.out.println("3 - Eliminar cliente");
            System.out.println("4 - Ver facturas");
            System.out.println("5 - Salir");
            opcion = reader.nextLine();

            //Ejemplo con if-else
            if(opcion.equals("1")){

            }
            else if(opcion.equals("2"))
            {

            }else if(opcion.equals("3"))
            {

            }
            else if(opcion.equals("4")){

            }
            else if(opcion.equals("5")){
                //Salir
            }
            else{

            }


            //Ejemplo con switch - case
            switch(opcion)
            {
                case "1":
                    reader = new Scanner(System.in);
                    System.out.println("Introduce el nombre del cliente");
                    String nombre = reader.nextLine();
                    clientes[contador] = nombre;
                    contador ++;
                    break;

                case "2":
                    System.out.println("Ver todos los clientes");
                    for(int i =0; i < clientes.length; i++)
                    {
                        if(clientes[i] != null){
                            System.out.println(clientes[i]);
                        }
                    }
                    break;

                case "3":
                    System.out.println("Eliminar clientes");
                    break;

                case "4":
                    System.out.println("Ver facturas");
                    break;

                case "5":
                        System.out.println("Saliendo del programa. Hasta pronto");
                        break;

                default:
                        System.out.println("Introduzca una opcion correcta del menu");
                        break;
                    
            }


        }while(!opcion.equals("5"));
    }



    public static boolean validPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    } 
}
