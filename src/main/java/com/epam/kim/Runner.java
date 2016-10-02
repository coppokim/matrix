package com.epam.kim;

public class Runner {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(3,3);
        matrix1.printMatrix();
        Matrix matrix2 = new Matrix(3,3);
        matrix2.printMatrix();
        Matrix matrixResult;
        Multiplication multiplication = new Multiplication();
        if (multiplication.possibility(matrix1,matrix2)) {
            matrixResult = multiplication.multiply(matrix1, matrix2);
            matrixResult.printMatrix();
        }else System.out.println("Умножение матриц не возможно");
    }

}
