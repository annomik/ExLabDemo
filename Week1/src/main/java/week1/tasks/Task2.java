package week1.tasks;

public class Task2 {
 //2.	Напишите метод, который принимает в качестве параметра положительное целое число
 // и возвращает число с противоположным порядком цифр.
 // Например, для параметра 123 метод возвратит 321, для параметра 120 метод вернет 21.

    public int reverseNumber(int number){
        StringBuilder originalString = new StringBuilder(Integer.toString(number));
        StringBuilder reverseString = originalString.reverse();

        for (int i = 0; i < reverseString.length(); i++) {
            if (reverseString.charAt(i) == '0'){
                reverseString.deleteCharAt(0);
                i--;
            } else break;
        }
        return Integer.parseInt(String.valueOf(reverseString));
    }
}
