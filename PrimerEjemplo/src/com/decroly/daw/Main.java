package com.decroly.daw;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * System.out.print("Hola Mundo!!!!"); System.out.println("Hola Decroly DAW");
		 */
		
		/*
		 * int num = 0;; //vale 0 int a = 23;
		 * 
		 * int suma = a + num;
		 * 
		 * double sumaReales = 0.0;
		 * 
		 * double numR = 33.33;
		 * 
		 * boolean isEnable = false;
		 * 
		 * char c = 'S';
		 * 
		 * String text1 = "¿Como te llamas?"; String text2 = "Paco";
		 * 
		 * System.out.println(text1+text2);
		 * 
		 * System.out.println("test linea"); String respuesta = "Anuar";
		 * 
		 * System.out.println(text1 + ": " + respuesta); System.out.println("Edad: "+a);
		 * 
		 * 
		 * Scanner reader = new Scanner(System.in); System.out.println((a != num));
		 * 
		 * System.out.println("Introduce tu dni: "); String dni = reader.next();
		 * 
		 * System.out.println("Introduce tu edad"); int edad = reader.nextInt();
		 * 
		 * System.out.println("Tu DNI es: "+dni);
		 * System.out.println("Tu edad es: "+(edad-13));
		 */
		
		//Suma de 1/n2
//		double suma = 0.0;
//		
//		for(int i = 1; i <= 1000; i++)
//		{
//			suma = suma + (1/Math.pow(i, 2));
//		}
//		
//		System.out.println("La suma es: "+suma);
//		
//		
//		
//		double suma2 = 0.0;
//		int i = 1001;
//		while(i <= 1000)
//		{
//			suma2 = suma2 + (1/Math.pow(i, 2));
//			i ++; // iterator = iterator + 1
//		}
//		System.out.println("La suma es: "+suma2);
//		
//		
//		double suma3 = 0.0;
//		int iter = 1001;
//		
//		do {
//			suma3 = suma3 + (1/Math.pow(iter, 2));
//			iter ++;
//		}while(iter <= 1000);
//		System.out.println("La suma es: "+suma3);
		
		//Clase 2-10-2024
		double [][] matriz = new double[3][3];
		matriz[0][0] = 1.0;
		matriz[0][1] = 2.0;
		matriz[0][2] = 3.0;
		
		matriz[1][0] = 4.0;
		matriz[1][1] = 5.0;
		matriz[1][2] = 6.0;

		matriz[2][0] = 7.0;
		matriz[2][1] = 8.0;
		matriz[2][2] = 9.0;
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.println("Posicion ("+i+","+j+"): "+matriz[i][j]);
				
			}
		}
		
		double[] vector1 = new double[3];
		//Arrays.fill(vector1, 3.0);
		
		double [] vector2 = new double[3];
		//Arrays.fill(vector2, 3.0);
		
		System.out.println("Son iguales: "+(Arrays.equals(vector1,vector2)));
		
		String h1 = "Hola";
		String h2 = "HOLA";
		
		if(h1 == h2) {
			System.out.println("Son iguales");
		}else {
			System.out.println("Son distintos");
		}
		
		if(h1.equalsIgnoreCase(h2)) {
			System.out.println("Son iguales");
		}else {
			System.out.println("Son distintos");
		}
		
		
	}

}
