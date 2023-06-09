package week2.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List <Reader> readerList = new ArrayList<>();
        int cardNumber = 0;

        for (;;) {
        System.out.println(" == Welcome to our Library! == \n If you already have an account - enter your full name. " +
                "\n If you want to register - enter '1'.");
        Scanner scanner = new Scanner(System.in);
        String fromRegisterOrLogin = scanner.nextLine();

        if(fromRegisterOrLogin.equals("1")) {
            cardNumber++;
            System.out.println("Please, fill out a form. Enter your name: ");
            String nameFromScanner = scanner.nextLine();
            System.out.println("Enter your faculty: ");
            String facultyFromScanner = scanner.nextLine();
            System.out.println("Enter your date of Birth in format: dd.mm.yyyy ");
            String dateOfBirth = scanner.nextLine();
            System.out.println("Enter your phoneNumber");
            String phoneNumber = scanner.nextLine();
            readerList.add(new Reader(nameFromScanner, cardNumber, facultyFromScanner,
                                         dateOfBirth, phoneNumber ));

        } else{
            for (Reader reader:readerList)  {
                if(reader.getName().equals(fromRegisterOrLogin) ){
                    System.out.println("Take books - enter '1'. \n Return books - enter '2'." +
                            "\n Выйти из системы - enter '3'");
                    String chosenNumber = scanner.nextLine();
                    if(chosenNumber.equals("1")){
                        System.out.println("Enter the books");

                    }
//                    switch (chosenNumber){
//                        case "1": reader.takeBook();
//                        case "2": reader.returnBook();
//                        case "3": continue;
//                        default: break;
//                    }
                } else {
                    System.out.println("Sorry, no user named " + fromRegisterOrLogin);
                }
            }

        }
        //readerList.forEach( s -> s.getName().equals(fromRegisterOrLogin) );

        readerList.forEach( s ->  System.out.println(s));

        System.out.println("== Thank you for visiting our Library! ==");
       // scanner.close();
        }

    }
}
