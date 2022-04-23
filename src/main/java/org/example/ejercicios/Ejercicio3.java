package org.example.ejercicios;

public class Ejercicio3 {

    public void printArray(int[] array, int indice) {
        if (indice == array.length){
            return;
        }

        System.out.println("Valor Array: " + array[indice]);
        printArray(array, indice+1);
    }
}
