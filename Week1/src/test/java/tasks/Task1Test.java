package tasks;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task1Test {
    Task1 number = new Task1();

    @Test
    public void isPalindromeTrue() {
        boolean checkIsPalindrome = number.isPalindrome(10001);
        assertEquals(true, checkIsPalindrome );
    }

    @Test
    public void isPalindromeTrueTwoDigitNumber() {
        boolean checkIsPalindrome = number.isPalindrome(33);
        assertEquals(true, checkIsPalindrome );
    }

    @Test
    public void isPalindromeFalsePositiveNumber() {
        boolean checkIsPalindrome = number.isPalindrome(1022);
        assertEquals(false, checkIsPalindrome );
    }

    @Test
    public void isPalindromeFalseNegativeNumber() {
        boolean checkIsPalindrome = number.isPalindrome(-111);
        assertEquals(false, checkIsPalindrome );
    }
}