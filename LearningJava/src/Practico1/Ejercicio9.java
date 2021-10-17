package Practico1;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[]arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una palabra: ");
        String texto = scanner.nextLine();
        System.out.println("¿Qué caracter desea contar en el texto previamente ingresado?: ");
        String caracter = scanner.nextLine();
        System.out.println("La cantidad de "+ " '" + caracter + "'"+ " presente en el texto es: ");
        System.out.println(texto.split(caracter, -1).length-1);
        scanner.close();
    }

}
