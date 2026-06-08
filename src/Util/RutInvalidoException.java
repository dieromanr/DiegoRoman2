package Util;
/** Excepcion personalizada que se lanza cuando el formato
 * de un rut es incorrecto */

public class RutInvalidoException extends Exception {

    //Constructor de la excepcion
    public RutInvalidoException(String mensaje) {
        super(mensaje);
    }
}
