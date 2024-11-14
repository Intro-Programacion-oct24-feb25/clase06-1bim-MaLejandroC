/*


 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo021 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int numeroDia;
        int mes;
        int year;
        System.out.println("Ingrese el dia de nacimineto:");
        numeroDia = entrada.nextInt();
        System.out.println("Ingrese el numero del mes de nacimiento:");
        mes = entrada.nextInt();
        System.out.println("Ingrese el año de nacimiento:");
        year = entrada.nextInt();

        String mesP = "";

        switch (mes) {
            case 1:
                mesP = "ENERO";
                break;

            case 2:
                mesP = "FEBRERO";
                break;

            case 3:
                mesP = "MARZO";
                break;

            case 4:
                mesP = "ABRIL";
                break;

            case 5:
                mesP = "MAYO";
                break;

            case 6:
                mesP = "JUNIO";
                break;

            case 7:
                mesP = "JULIO";
                break;

            case 8:
                mesP = "AGOSTO";
                break;
            case 9:
                mesP = "SEPTIEMBRE";
                break;
            case 10:
                mesP = "OCTUBRE";
                break;
            case 11:
                mesP = "NOVIEMBRE";
                break;
            case 12:
                mesP = "DICIEMBRE";
                break;
            default:
                mesP = "Mes no reconocido";

        }

        System.out.printf("Usted ha nacido el %d de %s del %d ",
                numeroDia, mesP, year);

    }
}
