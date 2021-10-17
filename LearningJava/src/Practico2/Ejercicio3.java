package Practico2;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio3 {
    public static void main(String [] args){
        ArrayList<String> cartasF = new ArrayList<String>();
        cartasF.add("2");
        cartasF.add("3");
        cartasF.add("4");
        cartasF.add("5");
        cartasF.add("6");
        cartasF.add("7");
        cartasF.add("8");
        cartasF.add("9");
        cartasF.add("10");
        cartasF.add("J");
        cartasF.add("Q");
        cartasF.add("K");
        cartasF.add("A");
        System.out.println("Cartas Ordenadas");
        for (int i = 0; i <cartasF.size() ; i++) {
            System.out.println(cartasF.get(i));
        }
        System.out.println("Fin ordenado");
        System.out.println("Cartas reverso");
        Collections.reverse(cartasF);
        for (int i = 0; i <cartasF.size() ; i++) {
            System.out.println(cartasF.get(i));
        }
        System.out.println("Fin reverso");
        System.out.println("Cartas mezcladas");
        Collections.shuffle(cartasF);

        for (int j = 0; j <cartasF.size() ; j++) {
            System.out.println(cartasF.get(j));
        }
        System.out.println("Fin mezclado");

    }
}
