package udem.edu.co.controller;

/**
 * inteface que controla todas las operaciones del sistema
 * @author Alexander Hernandez
 * @version 1.0
 * @since 12-02-2024
 */
public interface Operaciones {

    /**
     * realiza la suma
     * @param numeroUno
     *      primer numero a sumar
     * @param numeroDos
     *      segundo numero a sumar
     * @return
     *      Resultado de la operacion
     */
    int suma(int numeroUno, int numeroDos);

    /**
     * realiza la resta
     * @param numeroUno
     *      primer numero a restar
     * @param numeroDos
     *      segundo numero a resta
     * @return
     *      Resultado de la operacion
     */
    int resta(int numeroUno, int numeroDos);

    /**
     * realiza la multiplicacion
     * @param numeroUno
     *      primer numero a multiplicar
     * @param numeroDos
     *      segundo numero a multiplicar
     * @return
     *      Resultado de la operacion
     */
    int multiplica(int numeroUno, int numeroDos);

    /**
     * realiza la divicion
     * @param numeroUno
     *      primer numero a dividir
     * @param numeroDos
     *      segundo numero a dividir
     * @return
     *      Resultado de la operacion
     */
    int divide(int numeroUno, int numeroDos);
}