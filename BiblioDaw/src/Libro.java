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
        this.setNPaginas(1);
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

    
    /** 
     * @return String
     */
    //Getters y Setters
    public String getTitulo(){
        return this.titulo;
    }

    
    /** 
     * @return String
     */
    public String getAutor(){
        return this.autor;
    }

    
    /** 
     * @return int
     */
    public int getNPaginas(){
        return this.nPaginas;
    }

    
    /** 
     * @param nPaginas
     */
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

    public String getIsbn(){
        return this.isbn;
    }

    public String getFechaPublicacion(){
        return this.fechaPublicacion;
    }

    public int getEdicion(){
        return this.edicion;
    }

    public void setEdicion(int edicion){
        if(edicion > 0){
            this.edicion = edicion;
        }
        else{
            System.out.println("El valor de la edicion debe de ser positivo");
        }
    }

    public String getEditorial(){
        return this.editorial;
    }

    public void setEditorial(String editorial){
        this.editorial = editorial;
    }


    // Metodos
    public String infoLibro(){
        
        //Metodo para realizar interpolacion en los strings en java
        String info = String.format("Libro - Titulo: %s, Autor: %s , Fecha publicacion: %s, Numero de paginas: %s, Edicion: %s, Editorial: %s, ISBN: %s"
        , this.titulo, this.autor, this.fechaPublicacion, this.nPaginas, this.edicion, this.editorial, this.isbn);

        return info;
    }

}
