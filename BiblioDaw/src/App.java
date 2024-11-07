public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //String titulo, String autor, String isbn, String fechaPublicacion
        Libro hobbit = new Libro("El Hobbit", "JRR Tolkien", "97800482318", "11/12/1937");

        hobbit.getAutor();
        

        System.out.println(hobbit.getTitulo());


        
    }
}
