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

            if (fromRegisterOrLogin.equals("1")) {                          //registration
                cardNumber++;
                System.out.print("Please, fill out the form. Enter your name: ");
                String nameFromScanner = scanner.nextLine();
                System.out.print("Enter your faculty: ");
                String facultyFromScanner = scanner.nextLine();
                System.out.print("Enter your date of Birth: ");
                String dateOfBirth = scanner.nextLine();
                System.out.print("Enter your phoneNumber:");
                String phoneNumber = scanner.nextLine();
                readerList.add(new Reader(nameFromScanner, cardNumber, facultyFromScanner,
                        dateOfBirth, phoneNumber));
            }
            System.out.print("To login enter your full name:");
            String enterLoginFromConsole = scanner.nextLine();

            Reader findedReader = readerList.stream()                         //find reader in readerList
                    .filter(reader -> (reader.getName().equalsIgnoreCase(enterLoginFromConsole)))
                    .findAny()
                    .orElse(null);
            if (findedReader == null) {
                System.out.println("Sorry, NO user named: " + enterLoginFromConsole);
            }else {
                System.out.println(" Take books - enter '1'. \n Return books - enter '2'." +
                        "\n Finish work - enter any other symbol.");
                String chosenNumber = scanner.nextLine();
                if (chosenNumber.equals("1")) {                              //to take books
                    System.out.println("How many books do you want to take?");
                    int amountOfBooksFromConsole = scanner.nextInt();
                    findedReader.takeBook(amountOfBooksFromConsole);
                    String [] nameOfBooksFromConsole = new String[amountOfBooksFromConsole];
                    List <Book> booksToTake = new ArrayList<>();
                    for (int i = 0; i < amountOfBooksFromConsole; i++) {
                        System.out.print("Enter the name of book(s): ");
                        String booksFromConsole = scanner.next();
                        nameOfBooksFromConsole[i] = booksFromConsole;
                        booksToTake.add(new Book(booksFromConsole, "author"+i));
                    }
                    findedReader.takeBook(nameOfBooksFromConsole);
                    findedReader.takeBook(booksToTake);
                    System.out.println(findedReader);

                } else if (chosenNumber.equals("2")) {                   //return books
                    System.out.println("How many books do you want to return?");
                    int amountOfBooksFromConsole = scanner.nextInt();
                    findedReader.returnBook(amountOfBooksFromConsole);
                    String [] nameOfBooksFromConsole = new String[amountOfBooksFromConsole];
                    List <Book> booksToReturn = new ArrayList<>();
                    for (int i = 0; i < amountOfBooksFromConsole; i++) {
                        System.out.print("Enter the name of book(s): ");
                        String booksFromConsole = scanner.next();
                        nameOfBooksFromConsole[i] = booksFromConsole;
                        booksToReturn.add(new Book(booksFromConsole, "author"+i));
                    }
                    findedReader.returnBook(nameOfBooksFromConsole);
                    findedReader.returnBook(booksToReturn);
                    System.out.println(findedReader);
                }
            }
            //readerList.forEach(s -> System.out.println(s));
            System.out.println("== Thank you for visiting our Library! ==\n");
        }

    }
}
