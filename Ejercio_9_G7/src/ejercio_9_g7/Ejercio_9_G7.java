/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercio_9_g7;

/**
 *
 * @author
 */
public class Ejercio_9_G7 {

  private static int comparaciones = 0;
    private static int intercambios = 0;

    public static void shellSort(int[] arr) {
        int n = arr.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j;

                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    comparaciones++;
                    arr[j] = arr[j - gap];
                    intercambios++;
                }
                arr[j] = temp;
                if (i != j) {
                    intercambios++;
                }
            }
        }
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            comparaciones++;
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
                intercambios++;
            }
        }
        swap(arr, i + 1, high);
        intercambios++;
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arrOriginal = { 1,2,3,8,45,89,0,5 };
        
        int[] arrShell = arrOriginal.clone();  // Clonar arreglo para Shell Sort
        shellSort(arrShell);
        System.out.println("Shell Sort - Comparaciones: " + comparaciones);
        System.out.println("Shell Sort - Intercambios: " + intercambios);
        
        // Reiniciar contadores
        comparaciones = 0;
        intercambios = 0;

        int[] arrQuick = arrOriginal.clone(); 
        quickSort(arrQuick, 0, arrQuick.length - 1);
        System.out.println("Quick Sort - Comparaciones: " + comparaciones);
        System.out.println("Quick Sort - Intercambios: " + intercambios);
    }

}
