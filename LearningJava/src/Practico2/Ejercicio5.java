package Practico2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio5{
    public static void main(String args[]){
        List<Integer> horasTrabajadas = new ArrayList<>();
        List<Integer> valorPorHora = new ArrayList<>();
        List<Integer> totales = new ArrayList<>();

        horasTrabajadas.add(6);
        horasTrabajadas.add(7);
        horasTrabajadas.add(8);
        horasTrabajadas.add(4);
        horasTrabajadas.add(5);
        valorPorHora.add(350);
        valorPorHora.add(345);
        valorPorHora.add(550);
        valorPorHora.add(600);
        valorPorHora.add(320);

        for (int i = 0; i < horasTrabajadas.size(); i++) {
            int ganancia = horasTrabajadas.get(i) * valorPorHora.get(i);
            totales.add(ganancia);
        }
        int totalesHs = 0;
        for (Integer ganancia : totales) {
            totalesHs += ganancia;

        }
        System.out.println(totales);
        System.out.println("Total Final: $" + totalesHs);
    }
}
