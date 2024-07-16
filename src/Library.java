import java.util.ArrayList;
import java.util.HashMap;

import java.util.Iterator;

public class Library {

    private ArrayList<Book> books;

    private ArrayList<User> users;
    private HashMap<String, String> borrow;


    public Library() {
        this.books = new ArrayList<>();
        this.users = new ArrayList<>();
        this.borrow = new HashMap<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void searchName(String title) {
        boolean found = false;
        for (Book book : books) {
            if (book.getBookName().equalsIgnoreCase(title)) {
                System.out.println("Book Found" + book);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Not found");
        }
    }

    public void viewAll() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library");
        } else {
            System.out.println("Book available are:");
            for (Book b : books) {
                System.out.println(b);
            }
        }

    }

    public void searchByGenre(String g) {

        boolean found = false;
        Iterator<Book> iterator = books.iterator();
        System.out.println("The related books are :");
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getGenre().equalsIgnoreCase(g)) {

                System.out.println(book);

                found = true;

            }
        }
        if (!found) {
            System.out.println("Not available");
        }

    }

    public void removeBook(String name) {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getBookName().equalsIgnoreCase(name)) {
                iterator.remove();
                System.out.println("Removed Successfully");
                return;
            }

        }
        System.out.println("no book available of that name to delete it");
    }

    public void borrowBook(String bookName, User user) {
        for (Book book : books) {
            if (book.getBookName().equalsIgnoreCase(bookName)) {
                if (book.getIsAvailable()) {
                    user.addBook(book);
                    System.out.println("book Borrowed");
                    book.setIsAvailable(false);
                    break;

                } else {

                    System.out.println("Book not available");
                }
            }

        }


    }

public void pricing(User user,int month){
      System.out.println( user.getPricing() * month);

}
}
