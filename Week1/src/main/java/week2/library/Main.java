package week2.library;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List <Reader> readerList = new ArrayList<>();
        Map<Integer, Book> bookList = new HashMap<>();
        bookList.put(1, new Book("It", "Stephen King"));
        bookList.put(2, new Book("Carrie", "Stephen King"));
        bookList.put(3,new Book("The Green Mile", "Stephen King"));
        bookList.put(4, new Book("Fairy tales", "A.S.Pushkin"));
        bookList.put(5, new Book("Harry Potter and the Philosopher's Stone", "Joanne Rowling"));
        bookList.put(6, new Book("Harry Potter and the Chamber of Secrets", "Joanne Rowling"));
        bookList.put(7, new Book("Harry Potter and the Goblet of Fire", "Joanne Rowling"));
        bookList.put(8, new Book("Harry Potter and the Deathly Hallows", "Joanne Rowling"));

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
                Map<Integer, Book> takenBooksForReader = new HashMap<>();
                if (chosenNumber.equals("1")) {                             //to take books
                    System.out.println("Select book(s):");
                    for (Map.Entry<Integer, Book> entry : bookList.entrySet()) {
                        System.out.println(entry.getKey().toString() +". " + entry.getValue().toString()     );
                    }

                    System.out.println("How many books do you want to take?");
                    int amountOfBooksFromConsole = scanner.nextInt();
                    findedReader.takeBook(amountOfBooksFromConsole);
                    String [] nameOfBooksFromConsole = new String[amountOfBooksFromConsole];

                    for (int i = 0; i < amountOfBooksFromConsole; i++) {
                        System.out.print("Enter the numbers of chosen book(s): ");
                        String indexBookFromConsole = scanner.next();
                        int indexOfBook = Integer.parseInt(indexBookFromConsole);
                        Book book = bookList.get(indexOfBook);
                        nameOfBooksFromConsole[i] = book.getNameOfBook();
                        takenBooksForReader.put(indexOfBook,bookList.get(indexOfBook));
                        bookList.remove(indexOfBook);
                    }
                    findedReader.takeBook(nameOfBooksFromConsole);
                    findedReader.takeBook(takenBooksForReader);
                    System.out.println(findedReader);

                } else if (chosenNumber.equals("2")) {                          //return books
                    System.out.println("How many books do you want to return?");
                    int amountOfBooksFromConsole = scanner.nextInt();
                    findedReader.returnBook(amountOfBooksFromConsole);
                    String [] namesOfBooksFromConsole = new String[amountOfBooksFromConsole];

                    for (Map.Entry<Integer, Book> entry : findedReader.getTakenBooks().entrySet()) {
                        System.out.println(entry.getKey() +". " + entry.getValue().toString() );
                    }
                    for (int i = 0; i < amountOfBooksFromConsole; i++) {
                        System.out.print("Enter the numbers of returned book(s): ");
                        String bookFromConsole = scanner.next();
                        int indexOfBook = Integer.parseInt(bookFromConsole);
                        Book book = findedReader.getTakenBooks().get(indexOfBook);
                        namesOfBooksFromConsole[i] = book.getNameOfBook();
                        bookList.put(indexOfBook, findedReader.getTakenBooks().get(indexOfBook));
                        findedReader.getTakenBooks().remove(indexOfBook);
                    }
                    findedReader.returnBook(namesOfBooksFromConsole);
                    System.out.println(findedReader);
                    System.out.println("Books in Library:");
                    for (Map.Entry<Integer, Book> entry : bookList.entrySet()) {
                        System.out.println(entry.getKey().toString() +". " + bookList.get(entry.getKey()).toString());
                    }
                }
            }
            //readerList.forEach(s -> System.out.println(s));
            System.out.println("== Thank you for visiting our Library! ==\n");
        }

    }
}
