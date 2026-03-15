package com.gla.arrays.array;

public class LC867 {

    public int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] arr = new int[cols][rows];

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                arr[i][j] = matrix[j][i];
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        LC867 obj = new LC867();

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] result = obj.transpose(matrix);

        // Print result
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}