package Practico2;

import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String[]args){
        ArrayList<Integer> numEntero = new ArrayList<Integer>(7);
        numEntero.add(7);
        numEntero.add(5);
        numEntero.add(9);
        numEntero.add(6);
        numEntero.add(8);
        for (int i = 0; i < numEntero.size(); i++) {
            System.out.println("Numero: "+numEntero.get(i));
            
        }System.out.println("Cantidad de numeros en la lista antes de agregar dos: "+numEntero.size());
        
        numEntero.add(0,4);
        numEntero.add(6,2);
        for (int i = 0; i < numEntero.size(); i++) {
            System.out.println("Numero: "+numEntero.get(i));
            
        }
        System.out.println("Cantidad de numeros en la lista despues de agregar dos: "+numEntero.size());
        
    }
}
