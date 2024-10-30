/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercio_8_g7;

/**
 *
 * @author
 */
public class Ejercio_8_G7 {

    /**
     * @param args the command line arguments
     */
    
    public static int busquedaBinariaDesc(int[] arr, int valorBuscado) {
        int inicio = 0;
        int fin = arr.length - 1;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;

            // Comprobación del elemento medio
            if (arr[medio] == valorBuscado) {
                return medio; // Valor encontrado
            }

            // Como el array está en orden descendente:
            if (arr[medio] < valorBuscado) {
                fin = medio - 1; // Buscar en la mitad izquierda
            } else {
                inicio = medio + 1; // Buscar en la mitad derecha
            }
        }

        return -1; // Valor no encontrado
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10};
        int valorBuscado = 80;

        int resultado = busquedaBinariaDesc(arr, valorBuscado);

        if (resultado != -1) {
            System.out.println("El valor " + valorBuscado + " se encuentra en el índice: " + resultado);
        } else {
            System.out.println("El valor " + valorBuscado + " no se encuentra en el array.");
        }
    }

}
