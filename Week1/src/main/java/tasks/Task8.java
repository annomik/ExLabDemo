package tasks;

public class Task8 {
//8. В Григорианском календаре год является високосным в двух случаях:
//   либо он кратен 4, но при этом не кратен 100, либо кратен 400.
//   Реализуйте метод, вычисляющий количество високосных лет с начала нашей эры (первого года)
//   до заданного года включительно.
    public int countLeapYears(int year) {
        int numberLeapYears = 0;
        for (int i = 1; i <= year; i++) {
            if (i % 400 == 0){
                numberLeapYears++;
            }else if (i >= 4 && i % 4 == 0 && i % 100 != 0) {
                numberLeapYears++;
            }
        }
        return numberLeapYears;
    }
}
