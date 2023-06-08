package week1.tasks;

import java.util.Scanner;

public class Task9 {
// 9.	Напишите программу на Java, которая принимает число
//    в качестве входных данных и печатает свою таблицу умножения до 10.

    public static void main( String[] args ){
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        if(!scanner.hasNextInt()) {
            System.out.println("Введите число!");
        } else {
            int number = scanner.nextInt();
            for (int i = 1; i < 11; i++) {
                System.out.println(number + " x " + i + " = " + number * i);
            }
        }
        scanner.close();
    }
}
