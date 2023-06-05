package tasks;

public class Task10 {
//10.	Напишите программу на Java, чтобы добавить два двоичных числа.

    public String addBinaryNumbers(String first, String second){

        String binaryString = Integer.toBinaryString(Integer.parseInt(first, 2)
                                + Integer.parseInt(second, 2));

        return binaryString;
    }
}
