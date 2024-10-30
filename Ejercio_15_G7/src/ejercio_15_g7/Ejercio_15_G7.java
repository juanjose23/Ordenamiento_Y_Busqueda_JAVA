/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercio_15_g7;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author 
 */


class Empleado {
    int codigo;
    double salario;

    Empleado(int codigo, double salario) {
        this.codigo = codigo;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + ", Salario: " + salario;
    }
}

public class Ejercio_15_G7 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);
        Empleado[] empleados = new Empleado[10];
        Random random = new Random();

        // Generar empleados aleatorios
        for (int i = 0; i < empleados.length; i++) {
            int codigo = random.nextInt(1000); // Código aleatorio entre 0 y 999
            double salario = 1000 + (random.nextDouble() * 9000); // Salario aleatorio entre 1000 y 10000
            empleados[i] = new Empleado(codigo, salario);
        }

        // Mostrar empleados antes de ordenar
        System.out.println("Empleados antes de ordenar:");
        mostrarEmpleados(empleados);

        // Ordenar por Bubble Sort
        bubbleSort(empleados);
        System.out.println("\nEmpleados ordenados por Bubble Sort:");
        mostrarEmpleados(empleados);

        // Generar empleados aleatorios nuevamente
        for (int i = 0; i < empleados.length; i++) {
            int codigo = random.nextInt(1000); // Código aleatorio entre 0 y 999
            double salario = 1000 + (random.nextDouble() * 9000); // Salario aleatorio entre 1000 y 10000
            empleados[i] = new Empleado(codigo, salario);
        }

        // Mostrar empleados antes de ordenar con Quicksort
        System.out.println("\nEmpleados antes de ordenar (nuevos):");
        mostrarEmpleados(empleados);

        // Ordenar por Quicksort
        quickSort(empleados, 0, empleados.length - 1);
        System.out.println("\nEmpleados ordenados por Quicksort:");
        mostrarEmpleados(empleados);

        scanner.close();
        
    }
     // Método para mostrar la lista de empleados
    public static void mostrarEmpleados(Empleado[] empleados) {
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }
    }

    // Método de ordenamiento Bubble Sort
    public static void bubbleSort(Empleado[] empleados) {
        int n = empleados.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (empleados[j].salario > empleados[j + 1].salario) {
                    // Intercambiar empleados si están en el orden incorrecto
                    Empleado temp = empleados[j];
                    empleados[j] = empleados[j + 1];
                    empleados[j + 1] = temp;
                }
            }
        }
    }

    // Método de ordenamiento Quicksort
    public static void quickSort(Empleado[] empleados, int low, int high) {
        if (low < high) {
            int pi = partition(empleados, low, high);
            quickSort(empleados, low, pi - 1);
            quickSort(empleados, pi + 1, high);
        }
    }

    private static int partition(Empleado[] empleados, int low, int high) {
        double pivot = empleados[high].salario;
        int i = (low - 1); // Índice del elemento más pequeño

        for (int j = low; j < high; j++) {
            if (empleados[j].salario <= pivot) {
                i++;
                // Intercambiar empleados[i] y empleados[j]
                Empleado temp = empleados[i];
                empleados[i] = empleados[j];
                empleados[j] = temp;
            }
        }
        // Intercambiar empleados[i + 1] y empleados[high] (o pivote)
        Empleado temp = empleados[i + 1];
        empleados[i + 1] = empleados[high];
        empleados[high] = temp;

        return i + 1;
    }

}
