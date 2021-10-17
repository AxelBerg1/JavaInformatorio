package Practico1;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        int num1;
        int num2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        num1 = scanner.nextInt();

        System.out.println("Introduce otro número entero: ");
        num2 = scanner.nextInt();
        numIngresado(num1,num2);
        scanner.close();
    }
    public static void numIngresado(int num1, int num2){
        int sum = num1 + num2;
        int res = num1 - num2;
        int mult = num1 * num2;
        int divi = num1 / num2;
        int porc = num1 % num2;
        System.out.println(num1 + " + " + num2 + " " +"="+ " " +sum);
        System.out.println(num1 + " - " + num2 + " " +"="+ " " +res);
        System.out.println(num1 + " * " + num2 + " " +"="+ " " +mult);
        System.out.println(num1 + " / " + num2 + " " +"="+ " " +divi);
        System.out.println(num1 + " % " + num2 + " " +"="+ " " +porc);
        

        
    }
    
}
