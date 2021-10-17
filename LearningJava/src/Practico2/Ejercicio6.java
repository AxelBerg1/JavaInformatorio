package Practico2;

import java.util.*;

public class Ejercicio6 {


    public static void main(String[] args) {

        HashSet<Employee> empleados = new HashSet<>();
        HashMap<Integer, Float> salario = new HashMap<>();

        empleados.add(new Employee("Petter Parker", 54642124, 6, 350));
        empleados.add(new Employee("Huge Jackman", 24687368, 7, 345));
        empleados.add(new Employee("Gamora Okts", 94537816, 8, 550));
        empleados.add(new Employee("Gargantua Galaxia", 87645210, 4, 600));
        empleados.add(new Employee("El Pomberito", 798546310, 5, 320));

        System.out.println("Calculo del salario de los empleados");

        for (Employee lista : empleados) {
            System.out.println(lista.nombre + " - DNI " + lista.dni + " - Horas de trabajo: " + lista.horasTrabajadas + " - Valor por hora: " + lista.valorPorHora);
        }

        for (Employee empleado : empleados) {
            salario.put(empleado.clave(), empleado.valor());
        }
        System.out.println("\nSalario percibido:\n");
        salario.forEach((dni, valor) -> System.out.println("DNI: " + dni + " - Salario: " + valor));
    }
}
class Employee {
    String nombre;
    int dni;
    float horasTrabajadas;
    float valorPorHora;


    public Employee(String nombre, int dni, float horasTrabajadas, float valorPorHora) {
        this.nombre = nombre;
        this.dni = dni;
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;
    }

    public int clave() {
        return this.dni;
    }

    public float valor() {
        return this.horasTrabajadas * this.valorPorHora;
    }
}