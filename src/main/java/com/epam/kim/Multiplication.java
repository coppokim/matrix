package com.epam.kim;

public class Multiplication {
    public Matrix multiply(Matrix matrix1,Matrix matrix2){
        Matrix matrixResult = new Matrix(matrix1.lineCount,matrix2.columnCount);
        for (int i=0; i<matrix1.lineCount; i++){
            for (int j=0; j<matrix2.columnCount; j++){
                matrixResult.a[i][j] = calculateValue(matrix1,matrix2,i,j);
            }
        }

        return matrixResult;
    }
    public boolean possibility(Matrix matrix1, Matrix matrix2){
        if (matrix1.columnCount == matrix2.lineCount) return true;
        else return false;
    }
    public int calculateValue(Matrix matrix1,Matrix matrix2, int n,int m){
        int a=0;
        for (int i=0; i<matrix1.columnCount; i++){
            a += matrix1.a[n][i] * matrix2.a[i][m];
        }
        return  a;
    }
}
