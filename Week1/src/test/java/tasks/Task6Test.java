package tasks;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task6Test {
    Task6 task6 = new Task6();

    @Test
    public void summ() {
        int actualMultiplication = task6.summ(2, 3);
        assertEquals(6, actualMultiplication);
    }

    @Test
    public void testWithOneAndOne() {
        int actualMultiplication = task6.summ(1, 1);
        assertEquals(1, actualMultiplication);
    }

    @Test
    public void testWithOneAndMinusOne() {
        int actualMultiplication = task6.summ(-1, 1);
        assertEquals(-1, actualMultiplication);
    }

    @Test
    public void summWithOneNegativeNumber() {
        int actualMultiplication = task6.summ(4, -4);
        assertEquals(-16, actualMultiplication);
    }

    @Test
    public void summWithTwoNegativeNumber() {
        int actualMultiplication = task6.summ(-20, -3);
        assertEquals(60, actualMultiplication);
    }
}