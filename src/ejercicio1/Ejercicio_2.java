
package ejercicio1;

import java.util.Scanner;

/*Declara un String que contenga tu nombre, después muestra un
mensaje de bienvenida por consola. Por ejemplo: si
introduzco “Fernando”, me aparezca “Bienvenido Fernando”.*/
public class Ejercicio_2 { 
   public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    System.out.println("introduce tu nombre");
    String nombre = s.nextLine();
     System.out.println("Hola, Bienvenido "+ nombre);
   
    }
}