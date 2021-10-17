package Practico1;

import java.util.Scanner;

public class Ejercicio6 {
        public static void main(String[] args) {
            int base;
            int exponente;
            int resultado = 1;

            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduzca la base: ");
            base = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Introduzca el exponente: ");
            exponente = scanner.nextInt();
            scanner.nextLine();
            for (int i = 1; i <= exponente; i++) {
                resultado *= base;
            }
            scanner.close();
            System.out.println(resultado);
        }

    }

