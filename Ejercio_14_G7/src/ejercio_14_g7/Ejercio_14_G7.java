/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercio_14_g7;

/**
 *
 * @author
 */
public class Ejercio_14_G7 {

    /**
     * @param args the command line arguments
     */
    public static void cocktailShakerSort(int[] arr) {
        boolean swapped = true;
        int start = 0;
        int end = arr.length - 1;

        while (swapped) {
            swapped = false;

            // Recorrido de izquierda a derecha
            for (int i = start; i < end; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                    swapped = true;
                }
            }

            // Si no se hicieron intercambios, el arreglo ya está ordenado
            if (!swapped) {
                break;
            }

            // El último elemento está en su posición correcta
            end--;

            swapped = false;

            // Recorrido de derecha a izquierda
            for (int i = end; i > start; i--) {
                if (arr[i] < arr[i - 1]) {
                    swap(arr, i, i - 1);
                    swapped = true;
                }
            }

            // El primer elemento está en su posición correcta
            start++;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2, 7, 1, 6};
        System.out.println("Arreglo original: " + java.util.Arrays.toString(arr));

        cocktailShakerSort(arr);

        System.out.println("Arreglo ordenado: " + java.util.Arrays.toString(arr));
        // Descripción de cuándo utilizar Cocktail Shaker Sort
        System.out.println("\nEl algoritmo Cocktail Shaker Sort es útil en las siguientes circunstancias:");
        System.out.println("- Cuando la lista está casi ordenada.");
        System.out.println("- Para arreglos pequeños, donde la simplicidad es más importante que la eficiencia.");
        System.out.println("- Para fines educativos, donde se desea visualizar el proceso de ordenación.");

    }

}
