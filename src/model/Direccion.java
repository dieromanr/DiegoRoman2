package model;

    //Representa la relacion entre Dirección

public class Direccion {

    //Datos de la Direccion
        private String Calle;
        private String Ciudad;
        private String Region;

        /** Constructor de la clase y sus parametros de direccion.
         Nombre de la calle, nombre de la ciudad y nombre de la region */

        public Direccion(String Calle, String Ciudad, String Region) {
            this.Calle = Calle;
            this.Ciudad = Ciudad;
            this.Region = Region;
        }

    //Metodo Getters / Setters

//Obtiene la calle
        public String getCalle() {
            return Calle;
        }
//Modifica la calle
        public void setCalle(String calle) {
            this.Calle = calle;
        }
//Obtiene la Ciudad
        public String getCiudad() {
            return Ciudad;
        }
//Modifica la Ciudad
        public void setCiudad(String ciudad) {
            this.Ciudad = ciudad;
        }
//Obtiene Region
        public String getRegion(){
            return Region;
        }
//Modifica Region
    public void setRegion(String region) {
        Region = region;
    }

//Devuelve la direccion en formato texto.
    @Override
        public String toString() {
            return "\nCalle: " + Calle + "\nCiudad: " + Ciudad + "\nRegion"+ Region;
        }
    }

