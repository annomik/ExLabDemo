import task1.Task1;

public class App 
{
    public static void main( String[] args )
    {
        Task1 number = new Task1();
        boolean checkIsPalindrome = number.isPalindrome(1001);
        boolean checkIsPalindrome102 = number.isPalindrome(1022);
        System.out.println( "CheckIsPalindrome 1001 = " + checkIsPalindrome);
        System.out.println( "CheckIsPalindrome 1022 = " + checkIsPalindrome102);
    }


}
