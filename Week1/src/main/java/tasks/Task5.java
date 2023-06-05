package tasks;

import java.util.Random;

public class Task5 {
//5.	Создать матрицу размера 10 на 10 и заполнить ее случайными целочислеными значениями (тип int)
// из диапазона от 0 до 10000.       Найти максимум среди сумм трех соседних элементов в строке.
//    Для найденной тройки с максимальной суммой выведите значение суммы и индексы(i,j) первого элемента тройки.

    public static void main( String[] args ) {
        int size = 10;
        int[][] array = new int[size][size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = random.nextInt(10000);
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
        int maxSum = 0;
        int lineIndex = 0;
        int columnIndex = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 2; j++) {
                if (maxSum < array[i][j] + array[i][j + 1] + array[i][j + 2]) {
                    maxSum = array[i][j] + array[i][j + 1] + array[i][j + 2];
                    lineIndex = i;
                    columnIndex = j;
                }
            }
        }
        System.out.println(maxSum + " (" + lineIndex + "," + columnIndex + ")");
    }
}
