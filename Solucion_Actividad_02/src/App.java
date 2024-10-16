import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Ejercicio1
        Scanner reader = new Scanner(System.in);
        int edad = reader.nextInt();
        if(edad >= 18){
            System.out.println("Eres mayor de edad");
        }

        //Ejercicio2
        reader = new Scanner(System.in);
        edad = reader.nextInt();
        if(edad >= 18){
            System.out.println("Eres mayor de edad");
        }
        else{
            System.out.println("Eres menor de edad");
        }

        //Ejercicio 3
        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
        }

        //Ejercicio 4
        for (int i = 0; i <= 200; i = i +2) {
            System.out.println(i);
        }

        //Ejercicio 5
        for (int i = 1; i <= 200; i++) {
            if(i % 2 == 0){
                System.out.println(i);
            }
        }

        //Ejercicio 6
        reader = new Scanner(System.in);
        int n = reader.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
            
        }
        
        //Ejercicio7
        reader = new Scanner(System.in);
        int nota = reader.nextInt();
        
        if(nota <0 || nota > 10){ // nota >= 0 && nota <= 10
            System.out.println("Por favor introduzca una nota entre 0 y 10");
        }
        else{
            if(nota < 3){
                System.out.println("Muy deficiente");
            }
            else if(nota >= 3 && nota < 5){
                System.out.println("Insuficiente");
            }
            else if(nota >= 5 && nota < 6){
                System.out.println("Suficiente");
            }
            else if(nota >= 6 && nota < 7){
                System.out.println("Bien");
            }
            else if(nota >= 7 && nota < 9){
                System.out.println("Notable");
            }
            else if(nota >= 9 && nota <= 10 ){
                System.out.println("Sobresaliente");
            }
        }

        //Ejercicio8
        reader = new Scanner(System.in);
        n = reader.nextInt();
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i; // factorial *= i;
        }
        System.out.println("El factorial es "+factorial);


        //Ejercicio9
        int segundos, minutos, horas;
        segundos = 59; minutos = 59; horas = 12; //leerlo con scanner

        segundos ++;

        if(segundos >= 60){
            minutos++;
            segundos = 0;

            if(minutos >= 60)
            {
                horas++;
                minutos = 0;
            }

            if(horas >= 24)
            {
                horas = 0;
            }
        }
        System.out.println(horas+":"+minutos+":"+segundos);


        //Ejercicio 10
        reader = new Scanner(System.in);
        boolean positivos = false, negativos = false;

        for (int i = 0; i < 10; i++) {
            System.out.println("Introuce un numero no nulo");
            int num = reader.nextInt();

            if(num > 0){
                positivos = true;
            }
            else if(num < 0){
                negativos = true;
            }
        }

        System.out.println("Hay numeros positivos: " + positivos);
        System.out.println("Hay numeros negativos: " + negativos);


        //Ejercicio 11
        reader = new Scanner(System.in);
        int numP = 0, numN = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Introuce un numero no nulo");
            int num = reader.nextInt();

            if(num > 0){
                numP++; // numP = numP + 1;
            }
            else if(num < 0){
                numN++;
            }
        }

        System.out.println("Hay N numeros positivos: " + numP);
        System.out.println("Hay N numeros negativos: " + numN);


        //Ejercicio 12
        int numZero = 0;
        int np = 0, nn = 0;
        reader = new Scanner(System.in);
        do {
            System.out.println("Introduce un numero");
            numZero = reader.nextInt();

            if(numZero > 0){
                np++; // numP = numP + 1;
            }
            else if(numZero < 0){
                nn++;
            }
            
        } while (numZero != 0);

        System.out.println("Hay N numeros positivos: " + np);
        System.out.println("Hay N numeros negativos: " + nn);
        System.out.println("Hay numeros negativos: " + (nn > 0));

        //Ejercicio 13
        int sumaN = 0, productoN = 1;
        for (int i = 1; i <= 10; i++) {
            sumaN += i; // sumaN = sumaN +  i;
            productoN *= i; //productoN = productoN * i;
        }
        System.out.println("La suma de los 10 primeros naturales: " + sumaN);
        System.out.println("La multipliacion de los 10 primeros naturales: \"" + productoN);


        //Ejercicio 14
        double salarioB = 0, salarioN = 0, horasT = 0, tarifa = 0;
        reader = new Scanner(System.in);
        System.out.println("Introduzca el numero de horas trabajas");
        horasT = reader.nextDouble();
        System.out.println("Introduzca la tarifa hora");
        tarifa = reader.nextDouble();

        if(horasT > 0 && horasT <= 35 ){
            salarioB = horasT *  tarifa;
        }
        else if(horasT > 35)
        {
            salarioB = 35 * tarifa + ( horasT -35) * 1.5 * tarifa;
        }
        else{
            System.out.println("Las horas deben de ser positivas");
        }

        if(salarioB > 0 && salarioB <= 500){
            salarioN = salarioB;

        }else if(salarioB > 500 && salarioB <= 900){
            salarioN = 500 +  (salarioB - 500) * 0.75;
        }
        else if(salarioB > 900){
            salarioN = 500 + (400 * 0.75) + (salarioB - 900) * 0.55;
        }

        System.out.println("El salario neto es: "+salarioN);

        reader.close();
    }
}
