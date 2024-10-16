
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) throws Exception {
        String opcion;
        double num1, num2;
        Scanner reader = new Scanner(System.in);
        do {
            reader = new Scanner(System.in);
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");

            opcion = reader.nextLine();

            switch(opcion){

                case "1":
                    reader = new Scanner(System.in);
                    System.out.println("Introduzca el numero 1");
                    num1 = reader.nextDouble();
                    System.out.println("Introduzca el numero 2");
                    num2 = reader.nextDouble();
                    System.out.println("La suma es: "+ (num1 + num2));
                    break;

                case "2":
                    System.out.println("Introduzca el numero 1");
                    num1 = reader.nextDouble();
                    System.out.println("Introduzca el numero 2");
                    num2 = reader.nextDouble();
                    System.out.println("La resta es: "+ (num1 - num2));
                    break;

                case "3":
                    System.out.println("Introduzca el numero 1");
                    num1 = reader.nextDouble();
                    System.out.println("Introduzca el numero 2");
                    num2 = reader.nextDouble();
                    System.out.println("La multiplicacion es: "+ (num1 * num2));
                    break;
                case "4":
                    System.out.println("Introduzca el numero 1");
                    num1 = reader.nextDouble();
                    System.out.println("Introduzca el numero 2");
                    num2 = reader.nextDouble();
                    if(num2 != 0.0){
                        System.out.println("La division es: "+ (num1 / num2));
                    }
                    else{
                        System.out.println("No se puede divir por cero");
                    }
                    break;

                case "5":
                System.out.println("Saliendo del programa");
                    break;

                default:
                    System.out.println("Opcion incorrecta");
            }

            
        } while (!opcion.equals("5"));



    }
}
