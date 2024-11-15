
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Objeto Scanner
        Scanner reader = new Scanner(System.in);

        System.out.println("Introduzca el valor de la coleccion");
        int n = reader.nextInt();
        //Posible validacion del numero

        double[] coleccion = new double[n];
        int nActuales = 0;

        String opcion = "";
        do { 
            reader = new Scanner(System.in);
            System.out.println("Por favor seleccione una opcion \n" + "1 Modificar coleccion: \n"+
            "2) Estadisticas de la coleccion:\n" +
            "3)Ampliar la coleccion \n"+
            "4)Salir: \n");
            
            opcion = reader.nextLine();

            switch(opcion){
                case "1":
                    reader = new Scanner(System.in);
                    String submenu1 = "";
                    
                    do { 
                        System.out.println("Por favor seleccione una opcion \n" + "a) Insertar numero: \n"+
                        "b) Borrar numero:\n" +
                        "c) Modificar numero en posicion especifica \n"+
                        "d) Salir: \n");
                        submenu1 = reader.nextLine().toLowerCase();

                        switch (submenu1) {
                            case "a":
                                reader = new Scanner(System.in);
                                if(nActuales == coleccion.length-1){
                                    System.out.println("El array esta lleno y no se puede insertar");
                                }else{
                                    System.out.println("Inserte el nuevo valor");
                                    coleccion[nActuales] = reader.nextDouble();
                                    if (nActuales < coleccion.length - 1) {
                                        nActuales++;
                                    }
                                }
                                break;
                            
                            case "b":
                                reader = new Scanner(System.in);
                                System.out.println("Introduzca la posicion que quiere borrar");
                                int pos = reader.nextInt();
                                if (pos >= 0 && pos < coleccion.length) {
                                    coleccion[pos] = 0.0;
                                    
                                    for(int i = pos+1; i < coleccion.length; i++){
                                        coleccion[i-1] = coleccion[i];
                                    }
                                    coleccion[coleccion.length-1] = 0.0;
                                    nActuales--;
                                    
                                }
                                break;
                                case "c":
                                    reader = new Scanner(System.in);
                                    System.out.println("Introduzca la posicion que quiere modificar");
                                    int posM = reader.nextInt();
                                    if (posM >= 0 && posM < coleccion.length) {
                                        System.out.println("Introduzca el valor nuevo");
                                        coleccion[posM] = reader.nextDouble();
                                    }
                                    else{
                                        System.out.println("La posicion es incorrecta");
                                    }
                                    break;
                                    case "d":
                                        System.out.println("Volviendo al menu principal");
                                        break;
                                    default:
                                    System.out.println("Opcion incorrecta");
                        }
                    } while (!submenu1.equals("d"));
                    break;

                case "2":
                    reader = new Scanner(System.in);
                    String subMenu2 = "";
                    do {
                        System.out.println("Por favor seleccione una opcion \n" + "a) Media de todos los valores no nulos \n"+
                        "b) Suma de todos los valores:\n" +
                        "c) Maximo de la coleccion \n"+
                        "d) Minimo de la coleccion: \n" +
                        "e) Salir: \n");
                        subMenu2 = reader.nextLine().toLowerCase();
                        switch (subMenu2) {
                            case "a":
                                double media = suma(coleccion) / nActuales;
                                System.out.println("La media de los valores no nulos "+media);
                                break;

                            case "b":
                                System.out.println("La suma de los valores "+suma(coleccion));
                                break;

                            case "c":
                                double max = Double.MIN_VALUE;
                                for (int i = 0; i < coleccion.length; i++) {
                                    max = Math.max(max, coleccion[i]); 
                                }
                                System.out.println("El maximo de la coleccion es "+max);
                                break;

                            case "d":
                                double min = Double.MAX_VALUE;
                                for (int i = 0; i < nActuales; i++) {
                                    min = Math.min(min, coleccion[i]);
                                }
                                System.out.println("El minimo de la coleccion es "+min);
                                break;

                            case "e":
                                System.out.println("Saliendo del submenu");
                                break;
                                
                            default:
                                System.out.println("Opcion incorrecta");
                        }
                        
                    } while (!subMenu2.equals("e"));
                    break;

                case "3":
                    reader = new Scanner(System.in);
                    System.out.println("Introduzca el valor nuevo de la coleccion");
                    int n1 = reader.nextInt();
                    double [] aux = new double[n1];
                    for(int i =0; i <coleccion.length; i++){
                        aux[i] = coleccion [i];
                    }
                    coleccion = aux;
                    break;

                case "4":
                    System.out.println("Vamos a cerrar el programa, Hasta luego.");
                    break;

                default:
                    System.out.println("Opción incorrecta, escoga otra opcion");
            }
        } while (!opcion.equals("4"));

        reader.close();
    }//main

    public static double suma(double[] coleccion){
        double suma = 0.0;
        for (int i = 0; i < coleccion.length; i++) {
            suma += coleccion[i];
        }
        return suma;
    }


}//class
