package udem.edu.co.controller.impl;

import udem.edu.co.controller.Operaciones;

public class OperacionesImpl implements Operaciones {

    /**
     * realiza la suma
     * @param numeroUno
     *      primer numero a sumar
     * @param numeroDos
     *      segundo numero a sumar
     * @return
     *      Resultado de la operacion
     */
    @Override
    public int suma(int numeroUno, int numeroDos){
        return numeroUno + numeroDos;
    }

    /**
     * realiza la resta
     * @param numeroUno
     *      primer numero a restar
     * @param numeroDos
     *      segundo numero a resta
     * @return
     *      Resultado de la operacion
     */
    @Override
    public int resta(int numeroUno, int numeroDos){
        return numeroUno - numeroDos;
    }

    /**
     * realiza la multiplicacion
     * @param numeroUno
     *      primer numero a multiplicar
     * @param numeroDos
     *      segundo numero a multiplicar
     * @return
     *      Resultado de la operacion
     */
    @Override
    public int multiplica(int numeroUno, int numeroDos){
        return numeroUno * numeroDos;
    }

    /**
     * realiza la divicion
     * @param numeroUno
     *      primer numero a dividir
     * @param numeroDos
     *      segundo numero a dividir
     * @return
     *      Resultado de la operacion
     */
    @Override
    public int divide(int numeroUno, int numeroDos){
        return numeroUno / numeroDos;
    }
}
