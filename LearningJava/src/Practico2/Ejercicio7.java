package Practico2;

import java.util.*;

public class Ejercicio7 {
    public static void main(String args[]) {
        int num1;
        int num2;
        ArrayList<String> sumaTotal = new ArrayList<String>();
        Scanner numeros = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        num1 = numeros.nextInt();
        numeros.nextLine();
        System.out.println("Ingrese un número menor al primero: ");
        num2 = numeros.nextInt();
        numeros.nextLine();
        numeros.close();

        for (int i = num2; i < num1; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                sumaTotal.add("FizzBuzz");
            } else if (i % 3 == 0) {
                sumaTotal.add("Buzz");
            } else if (i % 2 == 0) {
                sumaTotal.add("Fizz");
            } else {
                sumaTotal.add(String.valueOf(i));
            }

        }System.out.println("El resultado es: " + sumaTotal);

        }
    }
    

