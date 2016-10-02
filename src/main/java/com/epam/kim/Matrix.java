package com.epam.kim;

import java.util.Random;

public class Matrix {
    public int [][] a;
    public int lineCount;
    public int columnCount;

    public Matrix (int n, int m) {
        this.lineCount = n;
        this.columnCount = m;
        this.a = new int [lineCount][columnCount];
        setValue();
    }

    public void setValue() {
        Random random = new Random();
        for (int i=0; i<lineCount; i++){
            for (int j=0; j<columnCount; j++){
                a[i][j] = random.nextInt(10);
            }
        }
    }
    public void printMatrix() {
        System.out.println();
        for (int i=0; i<lineCount; i++){
            for (int j=0; j<columnCount; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
