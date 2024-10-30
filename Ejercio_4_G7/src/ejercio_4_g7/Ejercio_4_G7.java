/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercio_4_g7;

/**
 *
 * @author
 */
public class Ejercio_4_G7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr = {47, 3, 21, 32, 56, 92};
        int numPasadas = ordenarBurbuja(arr);

        System.out.println("Array ordenado: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\nNúmero de pasadas necesarias: " + numPasadas);
    }

    public static int ordenarBurbuja(int[] arr) {
        int n = arr.length;
        int numPasadas = 0;
        boolean intercambio;

        for (int i = 0; i < n - 1; i++) {
            intercambio = false;
            numPasadas++;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Intercambio de elementos
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    intercambio = true;
                }
            }

            // Si no hubo intercambios, el array está ordenado
            if (!intercambio) {
                break;
            }
        }
        return numPasadas;
    }
}
