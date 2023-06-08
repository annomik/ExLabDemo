package tasks;

import junit.framework.TestCase;
import week1.tasks.Task10;

public class Task10Test extends TestCase {
    Task10 task10 = new Task10();

    public void testAddBinaryNumbers() {
        String actual = task10.addBinaryNumbers("10", "11");
        assertEquals("101", actual);
    }

    public void testAddBinaryNumbersWithOneBigNumber() {
        String actual = task10.addBinaryNumbers("10101010", "11");
        assertEquals("10101101", actual);
    }

    public void testAddBinaryNumbersWithTwoBigNumber() {
        String actual = task10.addBinaryNumbers("101111111010", "11110000001111");
        assertEquals("100100000001001", actual);
    }

}