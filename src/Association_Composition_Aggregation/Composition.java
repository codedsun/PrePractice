package Association_Composition_Aggregation;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author : codedsun
 * Created on 28/06/18
 */

/*
    Composition represents a strong relationship, unlike association, the object can't exist without each other

 */

class Book {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book(String name) {

        this.name = name;
    }
}

class Library{
    List<Book> bookList;

    public Library(List<Book> bookList) {
        this.bookList = bookList;
    }

    public List<Book> getBookList() {

        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
}

public class Composition {
    public static void main(String[] args) {
        Book b1 = new Book("Book1");
        Book b2 = new Book("Book2");
        Book b3 = new Book("Book3");
        Book b4 = new Book("Book4");
        Book b5 = new Book("Book5");
        List<Book> arrayList = new ArrayList<>();
        arrayList.add(b1);
        arrayList.add(b2);
        arrayList.add(b3);
        arrayList.add(b4);
        arrayList.add(b5);
        Library library = new Library(arrayList);
        library.getBookList().forEach(new Consumer<Book>() {
            @Override
            public void accept(Book book) {
                System.out.println(book.name);
            }
        });
    }
}
