import tasks.Task1;
import tasks.Task6;

import java.util.Random;

public class App 
{
    public static void main( String[] args )
    {
        Task1 number = new Task1();
        boolean checkIsPalindrome = number.isPalindrome(1001);
        boolean checkIsPalindrome1002 = number.isPalindrome(1022);
        System.out.println( "CheckIsPalindrome 1001 = " + checkIsPalindrome);
        System.out.println( "CheckIsPalindrome 1022 = " + checkIsPalindrome1002);

        Task6 task6 = new Task6();
        System.out.println("Вычисление a*b без операции умножения: " + task6.summ(  4, 5));


    }

}
