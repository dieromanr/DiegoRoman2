package model;

public class Persona {

    //Datos personales

    private String nombre;
    private Rut rut;
    private Direccion direccion;

    //Constructor de la Clase persona.

    public Persona(String nombre,
                   Rut rut,
                   Direccion direccion) {

        this.nombre = nombre;
        this.rut = rut;
        this.direccion = direccion;
    }
    //Metodo Getters / Setters

//Obtiene el nombre
    public String getNombre() {
        return nombre;
    }
//Modifica el Nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
//Obtiene el Rut
    public Rut getRut() {
        return rut;
    }
//Mofifica el Rut
    public void setRut(Rut rut) {
        this.rut = rut;
    }
//Obtiene la Direccion
    public Direccion getDireccion() {
        return direccion;
    }
//Modifica la Direccion
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
//Devuelve la informacion de la persona

    @Override
    public String toString() {
        return "\nNombre: " + nombre +
                "\nRUT: " + rut +
                "\nDirección: " + direccion;
    }
}

