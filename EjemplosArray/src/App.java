public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        String [] alumnos = new String [5];
        int [] notas = new int [alumnos.length];

        String [] alumnos2 = new String [alumnos.length];


{

}
        for(int i = 0; i < alumnos.length; i++){
            alumnos [i] = "Alumno_"+i;
        }

        for(int i =0; i< alumnos.length; i++){
            alumnos2[i] = alumnos[i];
        }

        // int contador = 0;
        // while(contador < alumnos.length){
        //     alumnos[contador] = alumnos[contador] + " Alumno_C"+contador;
        //     contador++;
        // }

        //for each
        // for(String al : alumnos){
        //     System.out.println(al);
        // }

        // for(int nota : notas){
        //     System.out.println(nota);
        // }

        alumnos[0] = "Soy alumno nuevo";

        for(int i = 0; i < alumnos.length; i++)
        {
            System.out.println(alumnos[i]);
            System.out.println(alumnos2[i]);

        }





    }
}
