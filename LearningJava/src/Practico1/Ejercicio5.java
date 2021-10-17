package Practico1;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, num1, num2, producto;
        producto = 0;
        System.out.print("Ingresa el valor del primer numero: ");
        num1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingresa el valor del segundo numero: ");
        num2 = scanner.nextInt();
        scanner.nextLine();
        for (i=1; i<=num2; i++) {
            producto=producto+num1;
            System.out.println();
            scanner.close();
        }
        System.out.println("El resultado de: " + num1 + " * "+ num2 +" = " + producto);
    }

    }

