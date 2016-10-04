package com.epam.kim.matrix;

public class Printer {
    public void matrix(Matrix m) {
        System.out.println();
        for (int i=0; i<m.lineCount; i++){
            for (int j=0; j<m.columnCount; j++){
                System.out.print(m.a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
