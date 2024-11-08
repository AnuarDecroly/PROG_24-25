

public class Biblioteca {

    //Campos o Atributos
    private int id;
    private String nombre;
    private String direccion;
    private String email;
    private String nTelefono;
    //Coleccion de libros
    private Libro [] libros;
    private int nElementosActuales;

    //Constructor
    public Biblioteca(String nombre, String direccion, String email, String nTelefono, int nLibros){
        this.id = 0; //Esto en proximos capitulos
        this.nombre = nombre;
        this.direccion = direccion;
        this.email =  email;
        this.nTelefono = nTelefono;
        this.libros = new Libro[nLibros];
        this.nElementosActuales = 0;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getDireccion(){
        return this.direccion;
    }

    public String getEmail(){
        return this.email;
    }

    public String getNTelefono(){
        return this.nTelefono;
    }

    //Metodos para manejar la coleccion de la biblioteca (array de libros)

    //Insertar libro en Biblio
    public boolean insertarLibro(Libro l1){
        boolean isAdd = false;
        if(l1 != null){
            this.libros[nElementosActuales] = l1;
            this.nElementosActuales++;
            isAdd = true;
        }

        return isAdd;
    }


    public String infoBiblioteca(){
        //Metodo para realizar interpolacion en los strings en java
        String info = String.format("Bibilioteca - Nombre: %s, Direccion: %s , Email: %s, Numero telefono: %s"
            , this.nombre, this.direccion, this.email, this.nTelefono);
        
        return info;
    }



}
