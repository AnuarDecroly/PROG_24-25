
public class Persona {

    //Atributos o campos de una clase    
    private String nombreCompleto;
    private String dni;
    private int edad;

    //Constructor con nombre y dni
    public Persona(String nombreCompleto, String dni){
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.edad = 0;
    }

    //Constructor generico
    public Persona(){
        this.dni="No tengo";
        this.nombreCompleto = "Soy generico";
        this.edad = -1;
    }

    //Constructor con nombre, dni y edad
    Persona(String nombreCompleto, String dni, int edad){
        this.dni = dni;
        this.edad = edad;
        this.nombreCompleto =  nombreCompleto;
    }


    //Propiedades
    public int getEdad(){
        return this.edad;
    }

    public void setEdad(int edad){
        if(edad < 0){
            System.out.println("Rango de edad incorrecto");
        }
        else{
            this.edad = edad;
        }
        
    }

    public String getDni()
    {
        return this.dni;
    }

    public String getNombreCompleto(){
        return this.nombreCompleto;
    }

    

    //Ejemplo de metodos que devuelven o no

    // public void saludar(){
    //     System.out.println("Buenas, mi nombre es "+this.nombreCompleto);
    // }

    // public double sumar(double a, double b){
    //     return (a+b);
    // }


    // public double calculadora(double a, double b, String operacion){
    //     double resultado;
    //     switch(operacion){
    //         case "+":
    //                 resultado = a + b;
    //                 break;
    //         case "-":
    //                 resultado = a - b;
    //                 break;
    //         case "*":
    //                 resultado = a*b;
    //                 break;
    //         case "/":
    //                 if( b!=0){
    //                     resultado = a/b;
    //                 }
    //                 else{
    //                     resultado = 0;
    //                 }
    //                 break;
    //         default:
    //                 resultado = 0;

    //     }
    //     return resultado;
    // }

}
