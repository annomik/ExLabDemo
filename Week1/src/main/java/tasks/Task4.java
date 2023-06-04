package tasks;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
//4.	Создаём квадратную матрицу, размер вводим с клавиатуры.
//    Заполняем случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде матрицы).
//    Далее необходимо транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й строкой и т. д.)
    public static void main( String[] args ){
        System.out.println("Введите размер матрицы: ");
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[][] array = new int[arraySize][arraySize];
        Random random = new Random();
        for (int i = 0; i < arraySize; i++) {
            for (int j = 0; j < arraySize; j++) {
                array[i][j] = random.nextInt(50);
                System.out.print( array[i][j] + "  ");
            }
            System.out.println();
        }

        int[][] transposedMatrix = new int[arraySize][arraySize];
        for (int i = 0; i < arraySize; i++) {
            for (int j = 0; j < arraySize; j++) {
                transposedMatrix[j][i] =  array[i][j];
            }
        }
        System.out.println("transposedMatrix:");
        for (int i = 0; i < arraySize; i++) {
            for (int j = 0; j < arraySize; j++) {
                System.out.print( transposedMatrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
