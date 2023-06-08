package week1;

import week1.tasks.Task1;
import week1.tasks.Task10;
import week1.tasks.Task6;

import java.util.Scanner;

public class App {
    public static void main( String[] args )  {
        Task1 number = new Task1();
        boolean checkIsPalindrome = number.isPalindrome(1001);
        boolean checkIsPalindrome1002 = number.isPalindrome(1022);
        System.out.println( "CheckIsPalindrome 1001 = " + checkIsPalindrome);
        System.out.println( "CheckIsPalindrome 1022 = " + checkIsPalindrome1002);

        Task6 task6 = new Task6();
        System.out.println("Task6. Вычисление a*b без операции умножения: " + task6.summ(  4, 5));

        System.out.println("--Task 10--");
        System.out.println("Введите первое двоичное число: ");
        Scanner scanner = new Scanner(System.in);
        String firstNumber = scanner.nextLine();
        System.out.println("Введите второе двоичное число: ");
        String secondNumber = scanner.nextLine();
        Task10 task10 = new Task10();
        System.out.println( task10.addBinaryNumbers(firstNumber,secondNumber));
        scanner.close();
    }

}
