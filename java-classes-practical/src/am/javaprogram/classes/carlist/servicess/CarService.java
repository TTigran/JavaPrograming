package am.javaprogram.classes.carlist.servicess;

import am.javaprogram.classes.booklist.BookGenerator;
import am.javaprogram.classes.booklist.models.Book;

public class BookService {
    private Book[] bookData = new Book[10];

    public BookService() {
        BookGenerator generator = new BookGenerator();
        for (int i = 0; i < bookData.length; i++) {
            bookData[i] = generator.generateBook();
        }
    }

    public void printData(Book[] array) {
        for (Book book : array) {
            if (book != null) {
                System.out.println(book.toString());
            }
        }
    }


    public Book[] getByFromYear(int year) {
        int countFoundData = 0;
        Book[] foundData = new Book[bookData.length];
        for (Book book : bookData) {
            if (book.getDate().getYear() < year) {
                foundData[countFoundData++] = book;
            }
        }
        return foundData;
    }

    public Book[] getByAuthor(String author) {
        int countFoundData = 0;
        Book[] foundData = new Book[bookData.length];
        for (Book book : bookData) {
            if (book.getAuthor().equals(author)) {
                foundData[countFoundData++] = book;
            }
        }
        return foundData;
    }

    public Book[] getByNamePublisher(String namePublisher) {
        int countFoundData = 0;
        Book[] foundData = new Book[bookData.length];
        for (Book book : bookData) {
            if (book.getNamePublisher().equals(namePublisher)) {
                foundData[countFoundData++] = book;
            }
        }
        return foundData;
    }
}
