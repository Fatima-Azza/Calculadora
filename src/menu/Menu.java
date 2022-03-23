package menu;
import java.util.Scanner;
/**
 * Una clase para los opciones del menu 
 * @author Fatima
 *
 */
public class Menu {
    private static Scanner teclado = new Scanner(System.in);
    /**
     * Pedir dos numeros (Operando 1 , Operando 2)
     * @return Dos valores
     */
    public int[] pedirNumeros(){
        int[] ret = new int[2];
        System.out.print ("Operando 1: ");
        ret [0] = teclado.nextInt();
        System.out.print ("Operando 2: ");
        ret [1] = teclado.nextInt();
        return ret;
    }
    /**
     * Pedir el tipo de la operacion (+,-,*,/,%)
     * @return Opcion de la operacion
     */

    public String menuOpciones() {
        String ret = "";
        do {
            System.out.print ("Operaciones [+, -, *, /, %]: ");
            ret = teclado.next();
        } while (!((ret.equalsIgnoreCase("+")) || (ret.equalsIgnoreCase("-")) ||
                (ret.equalsIgnoreCase("*")) || (ret.equalsIgnoreCase("/")) ||
                (ret.equalsIgnoreCase("%"))
                ));
                return ret;
    }
    /**
     * Pedir si quieres continuar en el programa
     * @return true / false (s/n)
     */
    public boolean repetir(){
        boolean ret = false;
        String respuesta;
        do {
            System.out.print ("¿Desea continuar trabajando con la calculadora? [s / n]");
            respuesta = teclado.next();
        } while (!((respuesta.equalsIgnoreCase("s")) || (respuesta.equalsIgnoreCase("n"))
                    ));

        if (respuesta.equalsIgnoreCase("s")){
            ret = true;
        }
        return ret;
    }
} 