public class Libro {

    //Atributos o campos de la clase bien encapsulados
    private String titulo;
    private String autor;
    private int nPaginas;
    private String isbn;
    private int edicion;
    private String editorial;
    private String fechaPublicacion;



    //Constructores
    public Libro(String titulo, String autor, String isbn, String fechaPublicacion){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.fechaPublicacion = fechaPublicacion;
        this.nPaginas = 1;
        this.edicion = 1;
        this.editorial = "Auto publicacion";
    }

    public Libro(String titulo, String autor, String isbn, String fechaPublicacion, String editorial, int nPaginas, int edicion){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.fechaPublicacion = fechaPublicacion;
        this.editorial = editorial;
        this.setNPaginas(nPaginas);
        this.edicion = edicion;
    }

    //Getters y Setters
    public String getTitulo(){
        return this.titulo;
    }

    public String getAutor(){
        return this.autor;
    }

    public int getNPaginas(){
        return this.nPaginas;
    }

    public void setNPaginas(int nPaginas){
        if(nPaginas > 0){
            this.nPaginas = nPaginas;
        }else{

            System.out.println("El numero de paginas no puede ser negativo");
            if(this.nPaginas == 0){
                this.nPaginas = 1;
            }
        }
        
    }


    // Metodos

}
