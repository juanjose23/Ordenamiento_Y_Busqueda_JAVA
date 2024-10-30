/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercio_7_g7;

import java.util.Scanner;

/**
 *
 * @author 
 */
public class Ejercio_7_G7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int opcion;
        int[] sueldos = null;

        do {
            System.out.println("1.- Leer los datos del array");
            System.out.println("2.- Ordenar de menor a mayor por el Método de la Burbuja");
            System.out.println("3.- Ordenar de mayor a menor por el Método de la Burbuja");
            System.out.println("4.- Ordenar de menor a mayor por el Método de Inserción");
            System.out.println("5.- Ordenar de mayor a menor por el Método de Inserción");
            System.out.println("6.- Ordenar de menor a mayor por el Método de QuickSort");
            System.out.println("7.- Ordenar de mayor a menor por el Método de QuickSort");
            System.out.println("8.- Salir");
            System.out.print("Introduce una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    sueldos = leerSueldos(scanner);
                    break;
                case 2:
                    if (sueldos != null) {
                        burbuja(sueldos, true);
                        imprimirArray(sueldos);
                    } else {
                        System.out.println("Primero debe ingresar los sueldos.");
                    }
                    break;
                case 3:
                    if (sueldos != null) {
                        burbuja(sueldos, false);
                        imprimirArray(sueldos);
                    } else {
                        System.out.println("Primero debe ingresar los sueldos.");
                    }
                    break;
                case 4:
                    if (sueldos != null) {
                        insercion(sueldos, true);
                        imprimirArray(sueldos);
                    } else {
                        System.out.println("Primero debe ingresar los sueldos.");
                    }
                    break;
                case 5:
                    if (sueldos != null) {
                        insercion(sueldos, false);
                        imprimirArray(sueldos);
                    } else {
                        System.out.println("Primero debe ingresar los sueldos.");
                    }
                    break;
                case 6:
                    if (sueldos != null) {
                        quickSort(sueldos, 0, sueldos.length - 1, true);
                        imprimirArray(sueldos);
                    } else {
                        System.out.println("Primero debe ingresar los sueldos.");
                    }
                    break;
                case 7:
                    if (sueldos != null) {
                        quickSort(sueldos, 0, sueldos.length - 1, false);
                        imprimirArray(sueldos);
                    } else {
                        System.out.println("Primero debe ingresar los sueldos.");
                    }
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 8);

        scanner.close();
    }
    // Método para leer los sueldos
    public static int[] leerSueldos(Scanner scanner) {
        System.out.print("Ingrese la cantidad de empleados: ");
        int n = scanner.nextInt();
        int[] sueldos = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el sueldo del empleado " + (i + 1) + ": ");
            sueldos[i] = scanner.nextInt();
        }
        return sueldos;
    }

    // Método de ordenación Burbuja
    public static void burbuja(int[] arr, boolean ascendente) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if ((ascendente && arr[j] > arr[j + 1]) || (!ascendente && arr[j] < arr[j + 1])) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Método de ordenación por Inserción
    public static void insercion(int[] arr, boolean ascendente) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && ((ascendente && arr[j] > key) || (!ascendente && arr[j] < key))) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    // Método de ordenación QuickSort
    public static void quickSort(int[] arr, int inicio, int fin, boolean ascendente) {
        if (inicio < fin) {
            int indiceParticion = particion(arr, inicio, fin, ascendente);
            quickSort(arr, inicio, indiceParticion - 1, ascendente);
            quickSort(arr, indiceParticion + 1, fin, ascendente);
        }
    }

    public static int particion(int[] arr, int inicio, int fin, boolean ascendente) {
        int pivote = arr[fin];
        int i = inicio - 1;
        for (int j = inicio; j < fin; j++) {
            if ((ascendente && arr[j] < pivote) || (!ascendente && arr[j] > pivote)) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[fin];
        arr[fin] = temp;
        return i + 1;
    }

    // Método para imprimir el array
    public static void imprimirArray(int[] arr) {
        System.out.print("Array ordenado: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
}
