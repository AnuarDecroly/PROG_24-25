package com.decroly.model;

import java.io.Serializable;

public class Persona implements Serializable {

    private static final long serialVersionUID = 2596243663561602159L;

    private String dni;
    private String nombre;
    private String apellido;
    private int edad;
    private String email;
    private String telefono;

    public Persona(String dni,String nombre, String apellido, int edad, String email, String telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.email = email;
        this.telefono = telefono;
    }

    public Persona(PersonaBuilder personaBuilder) {
        this.dni = personaBuilder.getDni();
        this.nombre = personaBuilder.getNombre();
        this.apellido = personaBuilder.getApellido();
        this.edad = personaBuilder.getEdad();
        this.email = personaBuilder.getEmail();
        this.telefono = personaBuilder.getTelefono();
    }

    public Persona() {}

    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Nombre = '" + nombre + '\'' +
                ", Apellido = '" + apellido + '\'' +
                ", DNI = " + dni +
                ", Edad = " + edad +
                ", Email =' " + email + '\'' +
                ", Telefono = '" + telefono;
    }

    public static PersonaBuilder builder() {
        return new PersonaBuilder();
    }
}

