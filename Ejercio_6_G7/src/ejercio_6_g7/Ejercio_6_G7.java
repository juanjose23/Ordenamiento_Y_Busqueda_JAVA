/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercio_6_g7;

import java.util.Arrays;

/**
 *
 * @author jrios
 */
public class Ejercio_6_G7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr = {8, 43, 17, 6, 40, 16, 18, 97, 11, 7};
        quicksort(arr, 0, arr.length - 1);

    }
     public static void quicksort(int[] arr, int inicio, int fin) {
        if (inicio < fin) {
            int indiceParticion = particion(arr, inicio, fin);
            quicksort(arr, inicio, indiceParticion - 1);
            quicksort(arr, indiceParticion + 1, fin);
        }
    }

    public static int particion(int[] arr, int inicio, int fin) {
        int pivote = arr[fin];
        int i = inicio - 1;
        
        System.out.println("Array antes de la partición: " + Arrays.toString(arr));
        System.out.println("Pivote seleccionado: " + pivote);

        for (int j = inicio; j < fin; j++) {
            if (arr[j] < pivote) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                System.out.println("Intercambio: " + arr[i] + " con " + arr[j]);
                System.out.println("Array después del intercambio: " + Arrays.toString(arr));
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[fin];
        arr[fin] = temp;
        
        System.out.println("Colocación del pivote: " + Arrays.toString(arr) + "\n");
        return i + 1;
    }
}
