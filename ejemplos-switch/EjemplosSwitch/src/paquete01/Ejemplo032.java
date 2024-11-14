/*
*   Generar un programa que permita ingresar un nombre de una ciudad;
*   Los nombres de las ciudades permitidas son las que empiezan con vocal.
*   Si la ciudad es permitida presentar un mensaje:
*   Nombre con inicial O de otavalo
*   Si la ciudad no es permitida presentar un mensaje:
*   opción incorrecta; ninguna de las anteriores
 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo032 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        System.out.println("Ingrese el nombre de una ciudad del Ecuador");
        String nombre = entrada.nextLine();
        // nombre = "atacames"
        nombre = nombre.toLowerCase(); 
        char valor = nombre.charAt(0); // obtener el primer caracter de una
                                       // cadena
        //  L   o   j   a
        //  0   1   2   3
        
        String caracter = nombre.substring(0 , 1); // utilizar substring para 
        //rescatar la primera letra de la palabra ingresada creando una nueva variable
        
        caracter = caracter.toUpperCase(); // a la letra rescatada la ponemos en 
        //mayuscula
        switch(valor){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                
                System.out.printf("Nombre con inicial %s de %s\n", 
                        caracter, nombre.toLowerCase());
                break;
            
            default:
                System.out.println("opción incorrecta; ninguna de las "
                        + "anteriores");
                break;
                
        }
        
    }
}
