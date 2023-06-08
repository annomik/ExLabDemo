package tasks;

import org.junit.Test;
import week1.tasks.Task2;

import static org.junit.Assert.*;

public class Task2Test {
    Task2 number = new Task2();

    @Test
    public void numberWithOutNull() {
        int actualReverseNumber = number.reverseNumber(456);
        assertEquals(654, actualReverseNumber);
    }

    @Test
    public void numberHaveNullInside() {
        int actualReverseNumber = number.reverseNumber(100023);
        assertEquals(320001, actualReverseNumber);
    }

    @Test
    public void numberFinishedWithNull() {
        int actualReverseNumber = number.reverseNumber(100000);
        assertEquals(1, actualReverseNumber);
    }

    @Test
    public void numberHaveNullInsideAndFinishedWithNull() {
        int actualReverseNumber = number.reverseNumber(7030);
        assertEquals(307, actualReverseNumber);
    }

    @Test
    public void numberNaveOneNumber() {
        int actualReverseNumber = number.reverseNumber(8);
        assertEquals(8, actualReverseNumber);
    }
}