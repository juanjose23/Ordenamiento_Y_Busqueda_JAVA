/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercio_3_g7;


import java.util.Arrays;

/**
 *
 * @author jrios
 */
public class Ejercio_3_G7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            // Listas A y B de 100 y 60 elementos respectivamente (valores de ejemplo)
        int[] A = new int[100];
        int[] B = new int[60];
        
        // Inicializamos las listas A y B con valores aleatorios (por ejemplo)
        for (int i = 0; i < A.length; i++) {
            A[i] = (int)(Math.random() * 100);
        }
        
        for (int i = 0; i < B.length; i++) {
            B[i] = (int)(Math.random() * 100);
        }
        
        // a) Ordenar las listas A y B con quicksort
        quickSort(A, 0, A.length - 1);
        quickSort(B, 0, B.length - 1);
        
        // b) Crear la lista C por intercalación de las listas A y B
        int[] C = intercalarListas(A, B);
        
        // c) Ordenar la lista C y visualizarla
        quickSort(C, 0, C.length - 1);
        System.out.println("Lista C ordenada: " + Arrays.toString(C));
    }
      // Método de quicksort
    public static void quickSort(int[] lista, int inicio, int fin) {
        if (inicio < fin) {
            int indiceParticion = particion(lista, inicio, fin);
            quickSort(lista, inicio, indiceParticion - 1);
            quickSort(lista, indiceParticion + 1, fin);
        }
    }

    // Método para particionar la lista para quicksort
    private static int particion(int[] lista, int inicio, int fin) {
        int pivote = lista[fin];
        int i = inicio - 1;

        for (int j = inicio; j < fin; j++) {
            if (lista[j] < pivote) {
                i++;
                int temp = lista[i];
                lista[i] = lista[j];
                lista[j] = temp;
            }
        }

        int temp = lista[i + 1];
        lista[i + 1] = lista[fin];
        lista[fin] = temp;

        return i + 1;
    }

    // Método para intercalar dos listas ordenadas A y B
    public static int[] intercalarListas(int[] A, int[] B) {
        int[] C = new int[A.length + B.length];
        int i = 0, j = 0, k = 0;

        // Intercalación de los elementos de A y B en C
        while (i < A.length && j < B.length) {
            if (A[i] < B[j]) {
                C[k++] = A[i++];
            } else {
                C[k++] = B[j++];
            }
        }

        // Añadir elementos restantes de A, si los hay
        while (i < A.length) {
            C[k++] = A[i++];
        }

        // Añadir elementos restantes de B, si los hay
        while (j < B.length) {
            C[k++] = B[j++];
        }

        return C;
    }
}
