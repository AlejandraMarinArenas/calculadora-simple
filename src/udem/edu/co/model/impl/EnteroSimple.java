package udem.edu.co.model.impl;

import udem.edu.co.model.Enteros;

import java.util.Random;

/**
 * Clase encargada de proveer datos para la prueba
 * @author Alexander Hernandez
 * @version 1.0
 * @since 12-02-2024
 */
public class EnteroSimple implements Enteros {

    public static int getInt(){
        Random random = new Random();
        return random.nextInt(10);
    }
}
