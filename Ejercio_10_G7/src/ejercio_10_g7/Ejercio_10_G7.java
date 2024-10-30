/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercio_10_g7;

/**
 *
 * @author 
 */
public class Ejercio_10_G7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          int[] array = {8, 13, 17, 26, 44, 56, 88, 97};
        
        System.out.println("Buscando el número 88:");
        binarySearch(array, 88);

        System.out.println("\nBuscando el número 20:");
        binarySearch(array, 20);
    }
     public static void binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        boolean found = false;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Calcular el índice medio
            System.out.println("Izquierda: " + left + ", Derecha: " + right + ", Medio: " + mid + " (valor: " + array[mid] + ")");

            if (array[mid] == target) {
                found = true;
                System.out.println("¡Número " + target + " encontrado en el índice " + mid + "!");
                break;
            } else if (array[mid] < target) {
                left = mid + 1; // El objetivo está a la derecha
            } else {
                right = mid - 1; // El objetivo está a la izquierda
            }
        }

        if (!found) {
            System.out.println("Número " + target + " no encontrado en el array.");
        }
    }
}
