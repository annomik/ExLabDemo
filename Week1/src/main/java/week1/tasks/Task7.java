package week1.tasks;

public class Task7 {
//Дан двухмерный массив размерностью 4 на 4, необходимо нарисовать четыре треугольникa
    private int size = 4;
    public String[][] fillInMatrixA( ) {
        String[][] array = new String[size][size];
        int n = 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j >= size - n) {
                    array[i][j] = "*";
                }else{
                    array[i][j] = " ";
                }
            }
            n++;
        }
        return array;
    }

    public String[][] fillInMatrixB( ) {
        String[][] array = new String[size][size];
        int n = 4;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j <= size - n) {
                    array[i][j] = "*";
                }else{
                    array[i][j] = " ";
                }
            }
            n--;
        }
        return array;
    }

    public String[][] fillInMatrixC( ) {
        String[][] array = new String[size][size];
        int n = 4;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j >=  size - n) {
                    array[i][j] = "*";
                }else{
                    array[i][j] = " ";
                }
            }
            n--;
        }
        return array;
    }

    public String[][] fillInMatrixD( ) {
        String[][] array = new String[size][size];

        int n = 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j <= size - n) {
                    array[i][j] = "*";
                }else{
                    array[i][j] = " ";
                }
            }
            n++;
        }
        return array;
    }


    public void print( String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
