package model;

public class GuiaTuristico extends Persona {

    private String especialidad;

    public GuiaTuristico(String nombre,
                         Rut rut,
                         Direccion direccion,
                         String especialidad) {

        super(nombre, rut, direccion);
        this.especialidad = especialidad;
    }
    //Metodo Getters / Setters

    //Obtienes especialidad

    public String getEspecialidad() {
        return especialidad;
    }
    //Modifica especialidad

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
//Devuelve informacion completa del Guia Turistico
    @Override
    public String toString() {

        return super.toString() +
                "\nEspecialidad: " + especialidad;
    }
}