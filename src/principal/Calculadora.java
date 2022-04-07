package principal;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

import logs.FiltroSoloMultiplicaciones;
import logs.FormatoHTML;
import menu.Menu;
import operaciones.Operaciones;
/**
 * Una clase para la calculadora
 * @author Fatima
 *
 */
public class Calculadora{
private static final Logger LOGGER = Logger.getLogger(Calculadora.class.getName());
    public static void main(String[] args) {  
    configurarLog();
        int resultado = 0;
        String operacion = "";
        int[] operandos = new int [2];
       
        Menu menu = new Menu();
        Operaciones operaciones = new Operaciones();
       
     
       
        do{
            operandos = menu.pedirNumeros();
            operacion = menu.menuOpciones();
            try {
            if (operacion.equalsIgnoreCase("+")){
                resultado = operaciones.sumar(operandos[0], operandos[1]);
                System.out.println ("Resultado: " + resultado);
            } else if (operacion.equalsIgnoreCase("-")){
                resultado = operaciones.restar(operandos[0], operandos[1]);
                System.out.println ("Resultado: " + resultado);
            } else if (operacion.equalsIgnoreCase("*")){
                resultado = operaciones.multiplicar(operandos[0], operandos[1]);
                System.out.println ("Resultado: " + resultado);
            } else if (operacion.equalsIgnoreCase("/")){
                resultado = operaciones.dividir(operandos[0], operandos[1]);
                System.out.println ("Resultado: " + resultado);
            } else if (operacion.equalsIgnoreCase("%")){
                resultado = operaciones.resto(operandos[0], operandos[1]);
                System.out.println ("Resultado: " + resultado);
            } else {
                System.out.println ("Operación no válida");
            }
            LOGGER.log(Level.FINE,  operacion +" "+ operandos[0] +" "+  operandos[1] +" "+resultado );
        }catch(ArithmeticException e){
        System.out.println("Operacion aritmetica no valida: " + e.getMessage());
        LOGGER.log(Level.WARNING, "Division entre cero.", e);
        }
        } while (menu.repetir());
        }
    //return "<HTML> \n <head> \n <link rel=\"stylesheet\"  href=\"style.css\"></head> <BODY> \n <table> \n <tr> \n <th>Operacion:</th> \n <th> Operando 1 :</th> \n <th>Operando 2 : </th> \n <th>+  el resultado: </th> \n </tr> \n </table>  \n";

    public static  void configurarLog() {
    LOGGER.setUseParentHandlers(false);
   
     Handler consoleHandler = new ConsoleHandler();
          Handler fileHandler  =  null;
         
          LOGGER.addHandler(consoleHandler);
          LOGGER.setFilter(new FiltroSoloMultiplicaciones());
         
          try{
              fileHandler= new FileHandler("./LOGS/logOperaciones.html");
             //fileHandler= new FileHandler("./LOGS/operaciones.log");
          }
          catch(IOException exception){
          LOGGER.log(Level.SEVERE, "Ocurrió un error en FileHandler.",  exception);
          }
         // LogManager.getLogManager().reset();
         
          fileHandler.setFormatter(new FormatoHTML());
         
          LOGGER.addHandler(fileHandler);
         
         
         
          consoleHandler.setLevel(Level.WARNING);
          fileHandler.setLevel(Level.FINE);
         
          LOGGER.setLevel(Level.FINE);
    }
}

