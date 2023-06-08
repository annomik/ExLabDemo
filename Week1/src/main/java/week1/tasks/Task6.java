package week1.tasks;

public class Task6 {
//6. Напишите реализацию метода summ(int a, int b), вычисляющий a*b,
//    не пользуясь операцией умножения, где a и b целые числа,
//    вызовите метод summ  в методе main и распечатайте на консоль.

    public int summ(int a, int b){
        int result = 0;
        int moduleA = Math.abs(a);
        int moduleB = Math.abs(b);

        for (int i = 0; i < moduleB; i++) {
            result += moduleA;
        }
        if ( (a > 0 && b > 0) || (a < 0 && b < 0) ) {
            return result;
        } else return -result;
    }
}
