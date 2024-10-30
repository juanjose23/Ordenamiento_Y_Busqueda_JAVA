/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercio_12_g7;

import java.util.Random;

/**
 *
 * @author 
 */
public class Ejercio_12_G7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          int[] A = new int[100];
        Random random = new Random();

        // Llenar el vector A con números aleatorios
        for (int i = 0; i < A.length; i++) {
            A[i] = random.nextInt(1000); // Números aleatorios entre 0 y 999
        }

        // Imprimir el vector
        System.out.print("Vector A: ");
        for (int num : A) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Verificar si el vector está ordenado
        if (isSorted(A)) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }
        // Método para verificar si el vector está ordenado ascendentemente
    public static boolean isSorted(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false; // Retorna falso si encuentra un elemento desordenado
            }
        }
        return true; // Retorna verdadero si el vector está ordenado
    }

}
