package org.example;

import org.example.ejercicios.Ejercicio5;
import org.example.ejercicios.Ejercicio7;

/**
 * Ejercicios Recursividad https://www.discoduroderoer.es/ejercicios-propuestos-y-resueltos-de-recursividad-java/
 */
public class App
{


    public static void main( String[] args )
    {
        Ejercicio7 ejercicio7 = new Ejercicio7();

        //ejercicio7.reverseRecursive(1234,0);
        System.out.println(ejercicio7.reverseRecursive(123456,0));
    }



    /**
     * Matriz 3X3 Example 1
     * 2  4  4
     * 6  6  9
     * 8 10 12
     *
     * Matriz 2X3 Example 2
     * 2  2  4
     * 6  6  9
     */

/*    public static void main( String[] args )
    {
        Ejercicio5 ejercicio5 = new Ejercicio5();

        //int[][] matriz = {{2,4,4},{6,6,9},{8,10,12}};
        int[][] matrix = {{2,4,4},{6,6,9}};

        ejercicio5.recursiveMatrix(matrix, 0,0);
    }*/

/*    public static void main( String[] args )
    {
        Ejercicio4 ejercicio4 = new Ejercicio4();

        int[] array = {1,2,3,4,5};

        int resultado = ejercicio4.searchElement(array, 3, 0);

        System.out.println("Elemento encontrado en el indice " + resultado);
    }*/
}
