package Practico2;

import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args){
       
        ArrayList<String> paices = new ArrayList<String>();
        paices.add("Santa Cruz");
        paices.add("Corrientes");
        paices.add("San Luis");

        for (String i : paices) {
            System.out.println(i);
        }
    }
}
