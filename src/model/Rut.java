package model;

import Util.RutInvalidoException;

//clase que representa rut y permite almacenar y validar su formato

public class Rut {

    //Numero de Rut
    private String numero;

    //Constructor de la clase Rut
    //Utilizacion de RutException si el formato es invalido

    public Rut(String numero) throws RutInvalidoException {

        //Verificar que el rut no este vacio

        if (numero == null || numero.trim().isEmpty()) {
            throw new RutInvalidoException("Debe ingresar un RUT.");
        }

        //Verificar el formato se cumpla
        if (!numero.matches("[0-9]+-[0-9kK]")) {
            throw new RutInvalidoException(
                    "El formato de rut XXXXXXXX-Y ");
        }

        this.numero = numero;
    }

    @Override
    public String toString() {
        return numero;
    }
}