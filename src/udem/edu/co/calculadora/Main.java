package udem.edu.co.calculadora;

import udem.edu.co.view.Promp;

/**
 * Clase principal encargada de inicializar el sistema
 * @author Alexander Hernandez
 * @version 1.0
 * @since 12-02-2024
 */
public class Main {

    /**
     * Metodo principal, se ejecuta al iniciar el programa, no debe tener logica de progración
     * @param args parametros que pueden enviarsele al iniciar la aplicacion
     */
    public static void main(String[] args) {
        Promp promp= new Promp();
        promp.ejecutar();
    }
}