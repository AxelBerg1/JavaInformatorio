package Practico1;
import java.util.Scanner;

public class Ejercicio8 {
   public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese su edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();
        System.out.println("¿Cual es su direccion?: ");
        String direccion = scanner.nextLine();
        System.out.println("¿Cual es su ciudad?: ");
        String ciudad = scanner.nextLine();

        System.out.println(ciudad + " - " + direccion + " - " + edad + " - " + nombre);
        scanner.close();
    }
}
