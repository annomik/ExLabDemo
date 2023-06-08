package tasks;

import junit.framework.TestCase;
import week1.tasks.Task8;

public class Task8Test extends TestCase {

    Task8 task8 = new Task8();
    public void testCountLeapYearsWithThree() {
        int actual = task8.countLeapYears(3);
        assertEquals(0, actual);
    }

    public void testCountLeapYearsWithFour() {
        int actual = task8.countLeapYears(4);
        assertEquals(1, actual);
    }

    public void testCountLeapYearsWithSixteen() {
        int actual = task8.countLeapYears(16);
        assertEquals(4, actual);
    }
    public void testCountLeapYearsWithOneHundred() {
        int actual = task8.countLeapYears(100);
        assertEquals(24, actual);
    }
    public void testCountLeapYearsWithTwoHundred() {
        int actual = task8.countLeapYears(200);
        assertEquals(48, actual);
    }
    public void testCountLeapYearsWithFourHundred() {
        int actual = task8.countLeapYears(400);
        assertEquals(97, actual);
    }
    public void testCountLeapYearsWithEightHundred() {
        int actual = task8.countLeapYears(800);
        assertEquals(194, actual);

    }
}