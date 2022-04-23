package org.example.ejercicios;

public class Ejercicio5 {

    public void recursiveMatrix(int[][] matrix, int x, int y) {
        System.out.print(matrix[x][y] + " ");
        if (y == matrix[x].length - 1 && x != matrix.length -1) {
            x += 1;
            y = 0;
            System.out.println();
        } else if (y == matrix[x].length - 1 && x == matrix.length -1) {
            return;
        } else {
            y +=1;
        }
        recursiveMatrix(matrix,x,y);
    }

    /**
     * Ejemplo Ejercicio resuelto.
     */
    public static void recorrerMatrizRecursivo(int[][] m, int i, int j) {
        System.out.print(m[i][j] + " ");
        if (i != m.length - 1 || j != m[i].length - 1) {
            if (j == m[i].length - 1) {
                i++;
                j = 0;
                System.out.println("");
            } else {
                j++;
            }
            recorrerMatrizRecursivo(m, i, j);
        }
    }
}
