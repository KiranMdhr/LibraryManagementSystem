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

    public void viewAllUsers() {
        if (users.isEmpty()) {
            System.out.println("No Users available");
        } else {
            System.out.println("Users available are:");
            for (User u : users) {

                System.out.println(u);
            }
        }

    }

    public void searchUserByName(String userName) {
        boolean found = false;
        for (User u : users) {
            if (u.getUname().equalsIgnoreCase(userName)) {
                System.out.println(u);
                found = true;
            }


        }
        if (!found) {
            System.out.println("NO user Found of this name");
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

    public void removeUser(String name) {
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            User users = iterator.next();
            if (users.getUname().equalsIgnoreCase(name)) {
                iterator.remove();
                System.out.println("Removed Successfully");
                return;
            }

        }
        System.out.println("no book available of that name to delete it");
    }

    public void borrowBook(String bookName, String userName, int duration) {
        int finalCost = 200 * duration;
//        int bookCount = b.getCount();
        //   int availableBookCount = bookCount - 1;
//        int calculatedCost = u.getBalance() - finalCost;

        for (User u : users) {
            if (u.getUname().equalsIgnoreCase(userName)) {
                for (Book book : books) {
                    if (book.getBookName().equalsIgnoreCase(bookName)) {
                        if (book.getIsAvailable() && u.getBalance() > finalCost) {
                            u.addBook(book);
                            System.out.println("book Borrowed");
                            System.out.println("The amount is" + finalCost);
                            u.setBalance(u.getBalance() - finalCost);
                            System.out.println("Your payment hasbeen done");
                            book.setCount(book.getCount() - 1);
                            if (book.getCount() < 1) {
                                book.setIsAvailable(false);
                            }
                            break;

                        } else {

                            System.out.println("You cannot borrow the book");
                        }
                    } else {
                        System.out.println("User not found");
                    }

                }
            }
        }


    }

    public void updateBook(int id, String bookName, String authorName, String g) {
        boolean found = false;
        for (Book b : books) {
            if (b.getBid() == id) {
                b.setBookName(bookName);
                b.setAuthorName(authorName);
                b.setGenre(g);
                System.out.println("Updated successfully");
                found = true;
                break; // Exit the loop after updating the book
            }
        }
        if (!found) {
            System.out.println("ID not found");
        }
    }

    public void updateUser(int id, String username, int contact, String email, int balance) {
        boolean userFound = false;
        for (User u : users) {
            if (u.getUid() == id) {
                u.setUname(username);
                u.setContact(contact);
                ;
                u.setEmail(email);
                u.setBalance(balance);
                userFound = true;
                System.out.println("User successfully updated");
            }

        }
        if (!userFound) {
            System.out.println("ID not found");
        }
    }

    public void lostBook(String userName, String lostBookName) {
        User foundUser = null;
        Book foundBook = null;

        // Find the user
        for (User u : users) {
            if (u.getUname().equalsIgnoreCase(userName)) {
                foundUser = u;
                break;
            }
        }

        if (foundUser == null) {
            System.out.println("User not found.");
            return;
        }

        // Find the lost book
        for (Book b : books) {
            if (b.getBookName().equalsIgnoreCase(lostBookName)) {
                foundBook = b;
                break;
            }
        }

        if (foundBook == null) {
            System.out.println("Book not found.");
            return;
        }

        // Deduct the fee and update book count
        int currentBalance = foundUser.getBalance();
        int deduction = 500;

        if (currentBalance < deduction) {
            System.out.println("You don't have sufficient balance to cover the lost book fee.");
        } else {
            foundUser.setBalance(currentBalance - deduction);
            System.out.println("Lost book fee deducted from your balance.");

            // Decrease book count
            int currentBookCount = foundBook.getCount();
            if (currentBookCount > 0) {
                foundBook.setCount(currentBookCount - 1);
                foundBook.setIsAvailable(currentBookCount - 1 > 0); // Update availability status
                System.out.println("Book count decreased.");
            } else {
                System.out.println("No more copies of this book available.");
            }
        }
    }

}
