package udem.edu.co.view;

import udem.edu.co.controller.Operaciones;
import udem.edu.co.controller.impl.OperacionesImpl;
import udem.edu.co.model.impl.EnteroSimple;

import java.util.Scanner;

/**
 * Encargado de la captura de datos
 * @author Alexander Hernandez
 * @version 1.0
 * @since 12-02-2024
 */
public class Promp {

    private Operaciones operaciones;

    /**
     * Construcctor de la clase, encargado de inicializar variables globales,
     * no debe llevar logicc de programacion
     */
    public Promp() {
        operaciones= new OperacionesImpl();
    }

    /**
     * Metodo encargado de ejecutar la funcionalidad del aplicativo
     */
    public void ejecutar(){
        //prueba todas las operaciones
        this.probarTodo();
        //solicita datos de la operacion al usuario
        this.solicitaData();
    }

    /**
     * metodo encargado de solicitar datos por consola para realizar la operacion
     */
    private void solicitaData() {
        Scanner lectura = new Scanner (System.in);
        System.out.println("Ingrese el primer numero: ");
        int numeroUno = lectura.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int numeroDos = lectura.nextInt();
        System.out.println("Ingrese operador: ");
        String operador = lectura.next();
        System.out.println("El resultado es :"+this.ejecutaOperacion(numeroUno, operador, numeroDos));
    }

    /**
     * metodo encargado de seleccionar la operaciona ejecurar e invocarla
     * @param numeroUno
     *      parametro que representa el primer dato
     * @param operador
     *      parametro que indica la operacion a realizar
     * @param numeroDos
     *      parametro que representa el segundo dato
     * @return
     */
    private int ejecutaOperacion(int numeroUno, String operador, int numeroDos) {

        switch (operador) {
            case "+":
                return operaciones.suma(numeroUno, numeroDos);
            case "-":
                return operaciones.resta(numeroUno, numeroDos);
            case "*":
                return operaciones.multiplica(numeroUno, numeroDos);
            case "/":
                if( numeroDos<0){
                    return operaciones.divide(numeroUno, numeroDos);
                }else{
                    return 0;
                }
            default:
                return 0;
        }
    }

    /**
     * Metodo encargado de probar todas las operaciones
     */
    private void probarTodo() {
        System.out.println("La suma es "+operaciones.suma(EnteroSimple.getInt(),EnteroSimple.getInt()));
        System.out.println("La resta es "+operaciones.resta(EnteroSimple.getInt(),EnteroSimple.getInt()));
        System.out.println("La multiplicación es "+operaciones.multiplica(EnteroSimple.getInt(),EnteroSimple.getInt()));
        System.out.println("La divición es "+operaciones.divide(EnteroSimple.getInt(),EnteroSimple.getInt()));
    }


    //getters and setters

    public Operaciones getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(Operaciones operaciones) {
        this.operaciones = operaciones;
    }
}
