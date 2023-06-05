package tasks;

import java.util.Random;

public class Task7 {
//Дан двухмерный массив размерностью 4 на 4, необходимо нарисовать четыре треугольникa

    public static void main( String[] args ) {
        int size = 4;
        String[][] array = new String[size][size];

        int starMark = 0;
        int n = 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j >= size - n) {
                    array[i][j] = "*";
                }else{
                    array[i][j] = " ";
                }
            }
            n++;
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }

    }
}
