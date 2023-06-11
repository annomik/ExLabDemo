package week2.library;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public  class Reader {
    private String name;
    private int libraryCardNumber;
    private String faculty;
    private String dateOfBirth;
    private String phoneNumber;

    public Reader() {
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

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
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

    public void takeBook(List<Book>  books) {
        System.out.println(getName() + " took the books: " + books.toString());
    }

//    public void returnBook(int amountOfBooks){
//            System.out.println();
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reader reader = (Reader) o;
        return libraryCardNumber == reader.libraryCardNumber && Objects.equals(name, reader.name) && Objects.equals(faculty, reader.faculty) && Objects.equals(dateOfBirth, reader.dateOfBirth) && Objects.equals(phoneNumber, reader.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, libraryCardNumber, faculty, dateOfBirth, phoneNumber);
    }

    @Override
    public String toString() {
        return "Reader{" +
                "name='" + name + '\'' +
                ", libraryCardNumber=" + libraryCardNumber +
                ", faculty='" + faculty + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
