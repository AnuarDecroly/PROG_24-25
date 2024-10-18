public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //Definicion
        // Double, int, boolean, String, long, Objects

        double [] miArray = new double[10];
        int v1 [] = new int[miArray.length];

        double suma = 0.0;
        //Recorrer un array
        for(int i = 0; i < miArray.length; i++){
            miArray [i] = Math.random() * 10;
            suma = suma + miArray[i];
            v1[i] = (int)(Math.random()* 10 + 1);
        }

        System.out.println("La suma de los decimales es: "+suma);
        System.out.println("La media de los decimales es: "+(suma/miArray.length));


        //Ejemplos con Strings
        // #codigo, descripcion, precio
        String texto = "Hola Caracola pepsicola";
        String [] palabras = texto.split(" ");
        String mitexto = texto.substring(1, texto.length());

        int aes = 0;

        //Remplazar carecter espacio
        String texAux = texto.replaceAll(" ", "");
        //pasar a minusculas
        texAux = texto.toLowerCase();
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            char z = texto.charAt(texto.length() - 1);

            //rango de letras de a-z
            if(c > 97 && c <=122){
                aes++;
            }
            
        }

        //ForEach de palabras
        for(String palabra : texto.split(" "))
        {
            System.out.println(palabra);
        }



        




    }
}
