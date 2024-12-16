public class App {
    public static void main(String[] args) throws Exception {
 
        //Persona

        //Alumno --> Persona

        //Profesor --> Persona

        Persona [] individuos = new Persona[10];

        individuos[0] = new Alumno("Juan David","12-12-1984","su casa","67868676767","12345678X","EXP-0003",1,"DAW");

        individuos[1] = new Profesor("Pepe", "12345678X", "01-12-1956", "Su casa", "666333777", "DAW-P01", "Informatica");

        individuos[2] = new Persona("paco", "87654321J", "25-12-0000");

        for (int i = 0; i < individuos.length; i++) {
            if(individuos[i] != null){
                if (individuos[i] instanceof Alumno){
                    Alumno a1 = (Alumno)individuos[i];
                    System.out.println(a1);
                    System.out.println(a1.getClass().getName());
        
                }else if(individuos[i] instanceof Profesor){
                    Profesor p1 = (Profesor)individuos[i];
                    System.out.println(p1);
                    System.out.println(p1.getClass().getName());
                }
                else{
                    System.out.println(individuos[i]);
                }
            }

        }

        
    }
}
