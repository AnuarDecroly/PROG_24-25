



public class Biblioteca {

    private static int contador = 0;

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
        this.id = this.contador;
        this.contador++;

        this.nombre = nombre;
        this.direccion = direccion;
        this.email =  email;
        this.nTelefono = nTelefono;
        this.libros = new Libro[nLibros];
        this.nElementosActuales = 0;
    }

    
    /** 
     * @return int
     */
    public static int getContador(){
        return contador;
    }

    
    /** 
     * @return int
     */
    public int getId(){
        return this.id;
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

    public boolean eliminarLibro(Libro l1){
        boolean isRemoved = false;
        if(l1 != null){
            int index = -1;
            for(int i = 0; i < this.libros.length; i++){
                if(this.libros[i] != null){
                    if(this.libros[i].getIsbn().equalsIgnoreCase(l1.getIsbn())){
                        index = i;
                    }
                }
            }
            if(index != -1){
                this.libros[index] = null;
                isRemoved = true;
                //recolocar el array
                for(int i = index+1; i < this.libros.length; i++){
                    this.libros[i-1] = this.libros[i];
                }
                this.libros[this.libros.length-1] = null;
                this.nElementosActuales--;
            }
        }
        return isRemoved;
    }


    public String infoBiblioteca(){
        //Metodo para realizar interpolacion en los strings en java
        String info = String.format("Bibilioteca - Nombre: %s, Direccion: %s , Email: %s, Numero telefono: %s"
            , this.nombre, this.direccion, this.email, this.nTelefono);
        return info;
    }

    public String infoColeccion(){
        String result = "";
        if(this.nElementosActuales > 0){
            for(Libro l : this.libros){
                if(l != null){
                    result += l.infoLibro() + "\n";
                }
            }
        }
        else{
            result = "No hay elementos en la biblio";
        }
        return result;
    }




}
