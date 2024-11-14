/*

ANA DIAZ con edad 19, es estudiante de UTPL

luis vera con edad 19, es estudiante de UNL

 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo031 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        
        String nombre;
        String apellido;
        String universidad;
        int edad;
        

        System.out.println("Ingrese su primer nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su primer apellido: ");
        apellido = entrada.nextLine();
        System.out.println("Ingrese su edad: ");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese la universidad donde estudia: ");
        universidad = entrada.nextLine();

        
        nombre = nombre.toLowerCase();
        apellido = apellido.toLowerCase();
        // nombre = "atacames"
        char valor = nombre.charAt(0); // obtener el primer caracter de una
        // ANA DIAZ con edad 19, es estudiante de UTPL

        // luis vera con edad 19, es estudiante de UNL
           
        switch(valor){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                nombre = nombre.toUpperCase();
                apellido = apellido.toUpperCase();
                break;
                
        }
        
        System.out.printf("%s %s con edad de %d, es estudiante de %s",
                nombre,
                apellido,
                edad,
                universidad.toUpperCase());
        
    }
}
