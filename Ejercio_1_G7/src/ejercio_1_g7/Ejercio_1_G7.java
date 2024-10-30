/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercio_1_g7;

/**
 *
 * @author 
 */
public class Ejercio_1_G7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          double[][] notas = {
            {8.5, 7.0, 6.5, 9.0, 7.5}, // Alumno 1
            {6.0, 5.5, 7.5, 8.0, 6.0}, // Alumno 2
            {7.5, 8.0, 9.0, 6.5, 7.0}, // Alumno 3
            {8.0, 8.5, 7.5, 8.5, 8.0}  // Alumno 4
        };
        
        int numAlumnos = notas.length;
        int numAsignaturas = notas[0].length;
        
        // Array para almacenar las medias de cada alumno
        double[] mediasAlumnos = new double[numAlumnos];
        
        // Calcular la media de cada alumno
        for (int i = 0; i < numAlumnos; i++) {
            double suma = 0;
            for (int j = 0; j < numAsignaturas; j++) {
                suma += notas[i][j];
            }
            mediasAlumnos[i] = suma / numAsignaturas;
        }
        
        // Calcular la media de cada asignatura
        double[] mediasAsignaturas = new double[numAsignaturas];
        for (int j = 0; j < numAsignaturas; j++) {
            double suma = 0;
            for (int i = 0; i < numAlumnos; i++) {
                suma += notas[i][j];
            }
            mediasAsignaturas[j] = suma / numAlumnos;
        }
        
        // Calcular la media total de la clase
        double sumaTotal = 0;
        for (double media : mediasAlumnos) {
            sumaTotal += media;
        }
        double mediaTotalClase = sumaTotal / numAlumnos;
        
        // Ordenar los alumnos por orden decreciente de notas medias usando el método Shell
        ordenarShellDescendente(mediasAlumnos, notas);
        
        // Imprimir resultados
        System.out.println("Medias de cada alumno:");
        for (int i = 0; i < numAlumnos; i++) {
            System.out.printf("Alumno %d: %.2f\n", i + 1, mediasAlumnos[i]);
        }
        
        System.out.println("\nMedias de cada asignatura:");
        for (int j = 0; j < numAsignaturas; j++) {
            System.out.printf("Asignatura %d: %.2f\n", j + 1, mediasAsignaturas[j]);
        }
        
        System.out.printf("\nMedia total de la clase: %.2f\n", mediaTotalClase);
    }
    // Método de ordenación Shell para ordenar en orden descendente
    public static void ordenarShellDescendente(double[] medias, double[][] notas) {
        int n = medias.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                double tempMedia = medias[i];
                double[] tempNotas = notas[i];
                
                int j;
                for (j = i; j >= gap && medias[j - gap] < tempMedia; j -= gap) {
                    medias[j] = medias[j - gap];
                    notas[j] = notas[j - gap];
                }
                
                medias[j] = tempMedia;
                notas[j] = tempNotas;
            }
        }
    }
    
}
