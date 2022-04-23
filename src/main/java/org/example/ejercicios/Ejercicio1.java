package org.example.ejercicios;

public class Ejercicio1 {
    public int suma(int n) {
        if (n == 1) {
            return 1;
        }

        return n + suma(n - 1);
    }
}
