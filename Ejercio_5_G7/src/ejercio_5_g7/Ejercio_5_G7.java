/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercio_5_g7;

/**
 *
 * @author 
 */
public class Ejercio_5_G7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr = {3, 13, 8, 25, 45, 23, 98, 58};

        // Aplicamos tres pasadas del algoritmo de inserción
        for (int i = 2; i < 5; i++) {
            int key = arr[i];
            int j = i - 1;

            // Mover elementos de arr[0..i-1] que son mayores que key, una posición adelante
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        // Imprimir el array después de tres pasadas adicionales
        System.out.println("Array después de tres pasadas adicionales:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    
}
