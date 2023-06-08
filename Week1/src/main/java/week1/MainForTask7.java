package week1;

import week1.tasks.Task7;

public class MainForTask7
{
    public static void main( String[] args ){
        Task7 task7 = new Task7();

        System.out.println("a:");
        String[][] matrixA = task7.fillInMatrixA();
        task7.print(matrixA);

        System.out.println("b:");
        task7.print(task7.fillInMatrixB());

        System.out.println("c:");
        task7.print(task7.fillInMatrixC());

        System.out.println("d:");
        task7.print(task7.fillInMatrixD());

    }

}
