package com.decroly.model;


public class PersonaBuilder {
    private String dni;
    private String nombre;
    private String apellido;
    private int edad;
    private String email;
    private String telefono;

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    public PersonaBuilder dni(String dni) {
        this.dni = dni;
        return this;
    }

    public PersonaBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public PersonaBuilder apellido(String apellido) {
        this.apellido = apellido;
        return this;
    }

    public PersonaBuilder edad(int edad) {
        this.edad = edad;
        return this;
    }

    public PersonaBuilder email(String email) {
        this.email = email;
        return this;
    }

    public PersonaBuilder telefono(String telefono) {
        this.telefono = telefono;
        return this;
    }


    public PersonaBuilder() {}

    public Persona build() {
        Persona persona = new Persona(this);
        return persona;
    }

}
