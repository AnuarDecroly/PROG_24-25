import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //String titulo, String autor, String isbn, String fechaPublicacion
        Libro hobbit = new Libro("El Hobbit", "JRR Tolkien", "97800482318", "11/12/1937");

        Scanner reader = new Scanner(System.in);

        System.out.println("Introduzca el titulo");
        String titulo = reader.nextLine();

        System.out.println("Introduzca el autor");
        String autor = reader.nextLine();

        System.out.println("Introduzca el isbn");
        String isbn = reader.nextLine();

        System.out.println("Introduzca el fecha de publicacion");
        String fPublicacion = reader.nextLine();
        
        Libro edesla = new Libro(titulo, autor, isbn, fPublicacion);

        System.out.println(hobbit.infoLibro());
        System.out.println(edesla.infoLibro());


        
    }
}
