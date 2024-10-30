/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercio_2_g7;
import java.util.Arrays;
/**
 *
 * @author 
 */
public class Ejercio_2_G7 {

    /**
     * @param args the command line arguments
     */
    public static void ordenarPorSeleccion(int[] lista) {
        int n = lista.length;

        // Paso por cada elemento de la lista
        for (int i = 0; i < n - 1; i++) {
            // Encontrar el índice del elemento más pequeño en la parte no ordenada
            int indiceMin = i;
            for (int j = i + 1; j < n; j++) {
                if (lista[j] < lista[indiceMin]) {
                    indiceMin = j;
                }
            }

            // Intercambiar el elemento más pequeño encontrado con el primer elemento de la parte no ordenada
            int temp = lista[indiceMin];
            lista[indiceMin] = lista[i];
            lista[i] = temp;
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
         int[] lista = {64, 25, 12, 22, 11};
        ordenarPorSeleccion(lista);
        System.out.println("Lista ordenada: " + Arrays.toString(lista));
    }
    
}
