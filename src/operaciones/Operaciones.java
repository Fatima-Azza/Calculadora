package operaciones;
/**
 * Una clase para las Operaciones
 * @author Fatima
 *
 */
public class Operaciones{
	/**
     * sumar los dos numeros que recibe como parametro
     * @param valor1
     * @param valor2
     * @return Devuelve el resultado de la suma
     */
    public int sumar (int valor1, int valor2){
        int numero;
        numero = valor1 + valor2;
        return numero;
    }
    /**
     * restar los dos numeros que recibe como parametro
     * @param valor1
     * @param valor2
     * @return Devuelve el resultado de la resta
     */
    public int restar (int valor1, int valor2){
        int numero;
        numero = valor1 - valor2;
        return numero;
    }
    /**
     * multiplicar los dos numeros que recibe como parametro
     * @param valor1
     * @param valor2
     * @return Devuelve el resultado de la multiplicar
     */
    public int multiplicar (int valor1, int valor2){
        int numero;
        numero = valor1 * valor2;
        return numero;
    }
    /**
     * Divide los dos numeros que recibe como parametro
     * @param valor1 : dividiendo
     * @param valor2 : divisiros
     * @return Devuelve el resultado de la devision
     * @throws ArithmeticException  contemplamos la division entre cero
     */

    public int dividir (int valor1, int valor2){
        int numero;
        numero = valor1 / valor2;
        return numero;
    }
    /**
     * resto de la division de los dos numeros que recibe como parametro
     * @param valor1
     * @param valor2
     * @return Devuelve el resultado de la resta de la division 
     * @throws ArithmeticException  contemplamos la division entre cero
     */
    public int resto (int valor1, int valor2){
        int numero;
        numero = valor1 % valor2;
        return numero;
    }
} 