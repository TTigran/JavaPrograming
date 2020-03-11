package am.javaprogram.classes.booklist.servicess;

import am.javaprogram.classes.booklist.BookGenerator;
import am.javaprogram.classes.booklist.models.House;

public class BookService {
    private House[] bookData = new House[10];

    public BookService() {
        BookGenerator generator = new BookGenerator();
        for (int i = 0; i < bookData.length; i++) {
            bookData[i] = generator.generateBook();
        }
    }

    public void printData(House[] array) {
        for (House book : array) {
            if (book != null) {
                System.out.println(book.toString());
            }
        }
    }


    public House[] getByFromYear(int year) {
        int countFoundData = 0;
        House[] foundData = new House[bookData.length];
        for (House book : bookData) {
            if (book.getDate().getYear() < year) {
                foundData[countFoundData++] = book;
            }
        }
        return foundData;
    }

    public House[] getByAuthor(String author) {
        int countFoundData = 0;
        House[] foundData = new House[bookData.length];
        for (House book : bookData) {
            if (book.getAuthor().equals(author)) {
                foundData[countFoundData++] = book;
            }
        }
        return foundData;
    }

    public House[] getByNamePublisher(String namePublisher) {
        int countFoundData = 0;
        House[] foundData = new House[bookData.length];
        for (House book : bookData) {
            if (book.getNamePublisher().equals(namePublisher)) {
                foundData[countFoundData++] = book;
            }
        }
        return foundData;
    }
}
