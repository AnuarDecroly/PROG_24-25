
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        //Ejercicio1
        System.out.println("Buenos dias");

        //Ejercicio2
        double lado = 5.0;
        double area = 0.0;
        area = lado * lado;
        System.out.println(area);

        //Ejercicio3
        Scanner reader = new Scanner(System.in);
        lado = reader.nextDouble();
        area = lado * lado;
        System.out.println(area);

        //Ejercicio4
        reader =  new Scanner(System.in);
        System.out.println("Introduzca el numero 1");
        int num1 = reader.nextInt();
        System.out.println("Introduzca el numero 2");
        int num2 = reader.nextInt();

        System.out.println("La suma es "+(num1 + num2));
        System.out.println("La resta es "+(num1 - num2));
        System.out.println("La multiplicacion es "+(num1 * num2));
        System.out.println("La division es "+(num1 / num2));

        //Ejercicio5
        reader =  new Scanner(System.in);
        double radio = reader.nextDouble();
        double areaCirculo = Math.pow(radio,2) * Math.PI;
        double longitudCirculo = 2 * radio * Math.PI;

        //Ejercicio6
        reader =  new Scanner(System.in);
        double precio = reader.nextDouble();
        double precioVenta = reader.nextDouble();
        double dto = (precioVenta * 100) / precio;

        //Ejercicio7
        reader =  new Scanner(System.in);
        double distanciaMillas = reader.nextDouble();
        double distancia = 1852 * distanciaMillas;

        //Ejercicio 8
        reader =  new Scanner(System.in);
        double n1 = reader.nextDouble();
        double n2 = reader.nextDouble();
        System.out.println(Math.min(n1,n2) + ", " + Math.max(n1,n2));

        //Ejercicio 9
        reader =  new Scanner(System.in);
        n1 = reader.nextDouble();
        n2 = reader.nextDouble();
        System.out.println("El numero mayor es: "+Math.max(n1,n2));
        System.out.println("Los numeros son iguales: "+(n1 == n2));

        //Ejercicio 10
        reader =  new Scanner(System.in);
        n1 = reader.nextDouble();
        n2 = reader.nextDouble();
        double n3 = reader.nextDouble();
        double nMayor = Math.max(n1, Math.max(n2, n3));
        System.out.println("El numero mayor es: "+nMayor);


        //Ejercicio13
        reader =  new Scanner(System.in);
        n1 = reader.nextDouble();
        System.out.println("El numero es positivo "+(n1 >=0));

    }
}
