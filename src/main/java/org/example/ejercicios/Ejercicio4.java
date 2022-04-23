package org.example.ejercicios;

public class Ejercicio4 {

    public int searchElement(int[] array, int searchingValue, int index) {
        if (array[index] == searchingValue) {
            return index;
        }

        if (index == array.length - 1) {
            return -1;
        }

        return searchElement(array, searchingValue, index + 1);
    }
}
