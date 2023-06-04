package tasks;

public class Task1 {
 //1.	Напишите метод, который принимает в качестве параметра целое число и возвращает значение true,
 // если оно - симметричное (палиндром - как, например, число 53477435); в ином случае метод возвращает значение false.

    public boolean isPalindrome(int number){
        StringBuilder originalString = new StringBuilder(Integer.toString(number));
        if (originalString.toString().equals(originalString.reverse().toString()) ){
            return true;
        }
        return false;

//        char [] original =  Integer.toString(number).toCharArray();
//        char [] reverse = new  char [original.length];
//        for (int i = 0; i < original.length ; i++) {
//            reverse[i] = original [original.length - 1 - i];
//        }
//        if (Arrays.equals(original, reverse)){
//             return true;
//        }
//        return false;
    }
}
