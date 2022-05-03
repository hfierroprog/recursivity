package org.example.ejercicios;

public class Ejercicio7 {

    /**
     * To Obtain last number use this lastDigit = number % 10
     * To Obtain the rest of digits use int intPart = number / 10
     * @param number number to reverse
     * @param res Variable to store result
     */
    public int reverseRecursive(int number, int res) {
        int intPart = number / 10;
        int lastDigit = number %10;
        if (intPart == 0) {
            return res * 10 + lastDigit;
        }

        return reverseRecursive(intPart, res * 10 + lastDigit);
    }
}
