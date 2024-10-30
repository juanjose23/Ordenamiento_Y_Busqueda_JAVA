/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercio_13_g7;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 
 */
public class Ejercio_13_G7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int[] X = new int[80];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Llenar el vector X con números aleatorios
        for (int i = 0; i < X.length; i++) {
            X[i] = random.nextInt(1000); // Números aleatorios entre 0 y 999
        }

        // Imprimir el vector
        System.out.print("Vector X: ");
        for (int num : X) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Leer el número a buscar
        System.out.print("Ingrese un número para buscar en el vector: ");
        int numeroBuscado = scanner.nextInt();

        // Realizar búsqueda secuencial
        int posicion = buscarNumero(X, numeroBuscado);

        // Imprimir el resultado
        if (posicion != -1) {
            System.out.println("Número encontrado en la posición: " + posicion);
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
       // Método para realizar la búsqueda secuencial
    public static int buscarNumero(int[] array, int numeroBuscado) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numeroBuscado) {
                return i; // Retorna la posición si encuentra el número
            }
        }
        return -1; // Retorna -1 si no encuentra el número
    }
}
