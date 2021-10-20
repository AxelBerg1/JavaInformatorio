package Practico1;
import java.util.*;

public class Ejercicio1 {
    public static void main(String[] args){

        var scanner = new Scanner(System.in);
        System.out.println("Hola, por favor introduce tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("¡Hola " + nombre+ " !");
        scanner.close();

    }
}



