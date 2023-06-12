package week2.library;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public  class Reader {
    private String name;
    private int libraryCardNumber;
    private String faculty;
    private String dateOfBirth;
    private String phoneNumber;
    private Map<Integer, Book> takenBooks = new HashMap<>();

    public Reader(String name, int libraryCardNumber, String faculty, String dateOfBirth, String phoneNumber, Map<Integer, Book> takenBooks) {
        this.name = name;
        this.libraryCardNumber = libraryCardNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.takenBooks = takenBooks;
    }

    public Reader(String name, int libraryCardNumber,
                  String faculty, String dateOfBirth,
                  String phoneNumber) {
        this.name = name;
        this.libraryCardNumber = libraryCardNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLibraryCardNumber() {
        return libraryCardNumber;
    }

    public void setLibraryCardNumber(int libraryCardNumber) {
        this.libraryCardNumber = libraryCardNumber;
    }

    public Map<Integer, Book> getTakenBooks() {
        return takenBooks;
    }

    public void setTakenBooks(Map<Integer, Book> books) {
        books.forEach((k, v) -> this.takenBooks.putIfAbsent(k, v));

    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(int amountOfBooks){
        System.out.println(getName() + " want to take "+ amountOfBooks + " book(s)");
    }

    public void takeBook(String [] nameOfBooks){
        System.out.println(getName() + " is taking the book(s): " + Arrays.toString(nameOfBooks));
    }

    public void takeBook(Map<Integer, Book> books) {
        setTakenBooks(books);
        System.out.println(getName() + " took the book(s): " );
        books.forEach((k, v) ->  System.out.println(k + ". " + v) );
//        for (Map.Entry<Integer, Book> entry : books.entrySet()) {
//            System.out.println(entry.getKey().toString() +". " + entry.getValue().toString()  );
//        }
    }

    public void returnBook(int amountOfBooks){
        System.out.println(getName() + " want to return "+ amountOfBooks + " book(s)");
    }

    public void returnBook(String [] nameOfBooks){
        System.out.println(getName() + " returns the book(s): " + Arrays.toString(nameOfBooks));
    }

    public void returnBook(Map<Integer, Book> books) {
        System.out.println(getName() + " returned the books: " + books.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reader reader = (Reader) o;
        return libraryCardNumber == reader.libraryCardNumber && Objects.equals(name, reader.name) && Objects.equals(faculty, reader.faculty) && Objects.equals(dateOfBirth, reader.dateOfBirth) && Objects.equals(phoneNumber, reader.phoneNumber) && Objects.equals(takenBooks, reader.takenBooks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, libraryCardNumber, faculty, dateOfBirth, phoneNumber, takenBooks);
    }

    @Override
    public String toString() {
        return "Reader{" +
                "name='" + name + '\'' +
                ", libraryCardNumber=" + libraryCardNumber +
                ", faculty='" + faculty + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", takenBooks=" + takenBooks +
                '}';
    }
}
