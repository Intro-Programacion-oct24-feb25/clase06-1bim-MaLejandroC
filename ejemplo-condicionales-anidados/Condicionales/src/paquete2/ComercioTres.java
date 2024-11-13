/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 existe una modificacion en el proceso de la problematica el porcentaje de 
    descuento de lseguro sera ingresado por teclado. Considerar los valores 
    posibles a ingresar son entre 1 y 15, si la persona ingresa un valor fuera de este 
    rango el valor del porcentaje va a ser 10
*/
package paquete2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class ComercioTres {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); // 10,2 / 10.2
        
        String nombre;
        String apellido;
        int edad;
        double sueldoBasico;
        int numeroProductos;
        
        double productividad;
        double coeficiente = 0.6;
        double bono  = 0;
        
        double porcentajeSeguro;
        double adicionalSeguro;
        
        double sueldoFinal; 
        
        System.out.println("Ingrese el nombre por favor");
        nombre = entrada.nextLine();
        
        System.out.println("Ingrese el apellido por favor");
        apellido = entrada.nextLine();
        
        System.out.println("Ingrese la edad por favor");
        edad = entrada.nextInt();

        System.out.println("Ingrese el sueldo básico por favor");
        sueldoBasico = entrada.nextDouble();        
        
        System.out.println("Ingrese el número de productos vendidos "
                + "por favor");
        numeroProductos = entrada.nextInt();
        
        System.out.println("Ingrese el porcentaje de descuento del seguro");
        porcentajeSeguro = entrada.nextDouble();  
        
        // calcular la productividad
        productividad = numeroProductos * coeficiente;
        

        //opción 1
        if (porcentajeSeguro >= 1 && porcentajeSeguro <= 15) {
            porcentajeSeguro = porcentajeSeguro + 0;
        } else {
            porcentajeSeguro = 10;
        }
        /*estas solucion funciona correctamente, ya que designamos un rango 
        determinado a la condicion para que asi pueda ser cierta de mejor 
        manera/
        // opción 2
        if (porcentajeSeguro > 15) {
            porcentajeSeguro = 10;
        }
        //esta solucion es invalida ya que no abarca loa numeros negativos

         // opción 3
        if (porcentajeSeguro < 1 || porcentajeSeguro > 15) {
            porcentajeSeguro = 10;
        }
        //esta opcion tambien es valida ya que hacemos el contrario 
        de la regla que tenemos de enunciado abarcando el rando para un 
        descuento determinado en este caso 10
        // opción 4
        if (porcentajeSeguro < 1 && porcentajeSeguro > 15) {
            porcentajeSeguro = 10;
        }
        esta opcion es invalida ya que no hay numeros negativos mayores 
        que 15. no se cumpliria nunca la condicion 
        */
        
        if (productividad<=30){
            bono = 25; // $25
        }else{
            if (productividad>=31 && productividad<80){
                bono = 50;
            }else{
                if (productividad>=80 && productividad < 200) {
                    bono = 100;
                }else{
                    if(productividad >= 200){
                        bono = 200;
                    }
                }
            }
        }
        
       
        adicionalSeguro = (sueldoBasico * porcentajeSeguro)/100;
        sueldoFinal = adicionalSeguro + bono + sueldoBasico;
        
        System.out.printf("Reporte de Empleado EL GRAN COMERCIO\n\n"
                + "Nombres: %s\n"
                + "Apellidos: %s\n"
                + "Edad: %d\n"
                + "Sueldo: $%.2f\n"
                + "Número de productos vendidos: %d\n"
                + "\tProductidad: %.2f\n"
                + "\tBono: $%.2f\n"
                + "Adicional del seguro: $%.2f\n\n"
                + "Sueldo final: $%.2f\n", 
                nombre, 
                apellido,
                edad,
                sueldoBasico,
                numeroProductos,
                productividad,
                bono,
                adicionalSeguro,
                sueldoFinal);
        
        
    }
    
}
