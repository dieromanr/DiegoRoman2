
package app;

//Package importados para ejecutar el programa

import model.*;
import Util.RutInvalidoException;

public class Main {

    public static void main(String[] args) {
//indicacion para que intente esta informacion

        try {
//Creacion de direcciones

            Direccion direccion1 = new Direccion(
                    "Av. Los Volcanes 123",
                    "Llanquihue",
                    "Los Lagos");

            Direccion direccion2 = new Direccion(
                    "San Pedro 456",
                    "Puerto Varas",
                    "Los Lagos");

            Direccion direccion3 = new Direccion(
                    "Costanera 789",
                    "Puerto Montt",
                    "Los Lagos");

//Creacion de Cliente

            Persona cliente = new Persona(
                    "Roman Soto",
                    new Rut("12366878-K"),
                    direccion1);

//Creacion de Guias Turisticos a cargo

            GuiaTuristico guia1 = new GuiaTuristico(
                    "María La del barrio",
                    new Rut("8654321-5"),
                    direccion2,
                    "Turismo Cultural");

            GuiaTuristico guia2 = new GuiaTuristico(
                    "Juan Pérez",
                    new Rut("12593234-4"),
                    direccion3,
                    "Turismo Aventura");

 //Informacion que entregara probar modelo

            System.out.println("===== CLIENTE =====");
            System.out.println(cliente);

            System.out.println("\n===== GUÍA TURISTICO 1 =====");
            System.out.println(guia1);

            System.out.println("\n===== GUÍA TURISTICO 2 =====");
            System.out.println(guia2);

//Verificacion  de errores en el Rut

        } catch (RutInvalidoException e) {

            System.out.println(
                    "Error verifique que rut cumpla "
                            + e.getMessage());
        }
    }
}
