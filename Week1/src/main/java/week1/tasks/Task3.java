package week1.tasks;

import java.util.Random;
import java.util.Scanner;

public class Task3 {
//3.	Напишите класс, который заполняет случайными трехзначными числами массив,
// размер которого при инициализации вводится с клавиатуры.
// После заполнения класс должен вывести на экран значения массива следующим образом:
// • в первой строке - первую половину массива;
// • во второй строке - вторую половину массива.
//    В случае если массив имеет нечетный размер, центральную ячейку следует выводить в первой строке.

    public static void main( String[] args ){
        System.out.println("Введите размер массива: ");
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        Random random = new Random();
        for (int i = 0; i < arraySize; i++) {
            array[i] =  random.nextInt(900) + 100;
        }

        for (int j = 0; j < arraySize; j++) {
            if( j < arraySize/2) {
                System.out.print( array[j] + " ");
            } else if (j == arraySize/2){
                System.out.print(array[j] + "\n");
            }
            if(j > arraySize/2) {
                System.out.print(array[j] + " ");
            }
        }
        scanner.close();
    }
}
