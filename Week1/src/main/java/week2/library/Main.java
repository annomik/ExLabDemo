package week2.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List <Reader> readerList = new ArrayList<>();
        int cardNumber = 0;

        for (;;) {
            System.out.println(" == Welcome to our Library! == \nIf you want to register - enter '1'." +
                    "\nIf you already have an account - enter any other symbol. ");
            Scanner scanner = new Scanner(System.in);
            String fromRegisterOrLogin = scanner.nextLine();

            if (fromRegisterOrLogin.equals("1")) {
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
                        dateOfBirth, phoneNumber));
            }
            System.out.println("To login enter your full name:");
            String enterLoginFromConsole = scanner.nextLine();
//            boolean listContainsReader = readerList.stream()
//                    .anyMatch(reader -> (reader.getName().equalsIgnoreCase(enterLoginFromConsole)));

            Reader findedReader = readerList.stream()
                    .filter(reader -> (reader.getName().equalsIgnoreCase(enterLoginFromConsole)))
                    .findAny()
                    .orElse(null);
            if (findedReader == null) {
                System.out.println("Sorry, no user named " + enterLoginFromConsole);
            }else {
                System.out.println(" Take books - enter '1'. \n Return books - enter '2'." +
                        "\n Finish work - enter any other symbol");
                String chosenNumber = scanner.nextLine();
                if (chosenNumber.equals("1")) {
                    System.out.println("How many books do you want?");
                    int amountOfBooksFromConsole = scanner.nextInt();
                    findedReader.takeBook(amountOfBooksFromConsole);
                    String [] nameOfBooksFromConsole = new String[amountOfBooksFromConsole];

                    System.out.println("Enter the name of book(s): ");
                    for (int i = 0; i < amountOfBooksFromConsole; i++) {
                       // String booksFromConsole = scanner.nextLine();
                        nameOfBooksFromConsole[i] = scanner.nextLine();
                    }
                    findedReader.takeBook(nameOfBooksFromConsole);


                }
//                switch (chosenNumber){
//                    case "1": reader.takeBook();
//                    case "2": reader.returnBook();
//                    case "3": continue;
//                    default: break;
//                       }

                }

            readerList.forEach(s -> System.out.println(s));
            System.out.println("== Thank you for visiting our Library! ==");

            //readerList.forEach( s -> s.getName().equals(fromRegisterOrLogin) );
            // scanner.close();
        }

    }
}
