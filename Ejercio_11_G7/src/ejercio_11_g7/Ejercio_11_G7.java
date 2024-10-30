/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercio_11_g7;

/**
 *
 * @author jrios
 */
public class Ejercio_11_G7 {

    /**
     * @param args the command line arguments
     */
    // Ordenación por Selección
    public static void selectionSort(int[] arr, int numPasadas) {
        int n = arr.length;
        for (int i = 0; i < n - 1 && i < numPasadas; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            // Intercambiar el elemento mínimo con el primer elemento no ordenado
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;

            // Imprimir el arreglo después de cada pasada
            System.out.println("Selección - Después de la pasada " + (i + 1) + ": " + java.util.Arrays.toString(arr));
        }
    }

    // Ordenación Burbuja
    public static void bubbleSort(int[] arr, int numPasadas) {
        int n = arr.length;
        for (int i = 0; i < n - 1 && i < numPasadas; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Intercambiar elementos adyacentes
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            // Imprimir el arreglo después de cada pasada
            System.out.println("Burbuja - Después de la pasada " + (i + 1) + ": " + java.util.Arrays.toString(arr));
        }
    }

    // Ordenación por Inserción
    public static void insertionSort(int[] arr, int numPasadas) {
        for (int i = 1; i < arr.length && i <= numPasadas; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;

            // Imprimir el arreglo después de cada pasada
            System.out.println("Inserción - Después de la pasada " + i + ": " + java.util.Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int[] arrOriginal = {47, 3, 21, 32, 56, 92};

        System.out.println("Ordenación por Selección:");
        int[] arrSeleccion = arrOriginal.clone();
        selectionSort(arrSeleccion, 2);

        System.out.println("\nOrdenación Burbuja:");
        int[] arrBurbuja = arrOriginal.clone();
        bubbleSort(arrBurbuja, 2);

        System.out.println("\nOrdenación por Inserción:");
        int[] arrInsercion = arrOriginal.clone();
        insertionSort(arrInsercion, 2);

        System.out.println("El algoritmo utilizado es la ordenación por selección. "
                + "Después de cada pasada, selecciona el elemento mínimo y lo coloca en su posición final. "
                + "Este comportamiento coincide con el estado intermedio dado: 3 21 47 32 56 92.");
    }

}
