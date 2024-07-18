import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Book b1 = new Book(101, "To Kill a Mockingbird", "Harper Lee", "Fiction", 5);
        Book b2 = new Book(102, "1984", "George Orwell", "Dystopian", 5);
        Book b3 = new Book(103, "Pride and Prejudice", "Jane Austen", "Romance", 5);
        Book b4 = new Book(104, "The Great Gatsby", "F. Scott Fitzgerald", "Classic", 5);
        Book b5 = new Book(105, "Moby-Dick", "Herman Melville", "Adventure", 5);


        ReferenceBook refBook1 = new ReferenceBook(101, "Advanced Java Programming", "Jane Smith", "Programming", 10, 24);
        ReferenceBook refBook2 = new ReferenceBook(102, "Data Structures and Algorithms", "Robert Martin", "Computer Science", 15, 30);
        ReferenceBook refBook3 = new ReferenceBook(103, "Modern Operating Systems", "Andrew S. Tanenbaum", "Operating Systems", 5, 20);
        ReferenceBook refBook4 = new ReferenceBook(104, "Database Management Systems", "Raghu Ramakrishnan", "Databases", 12, 25);
        ReferenceBook refBook5 = new ReferenceBook(105, "Computer Networks", "James F. Kurose", "Networking", 8, 22);


        User u1 = new User(1, "kiran", 78987978, "kiranmdhr9@gmail.com", "Normal");
        User u2 = new User(2, "hari", 1234341, "hari12@gmail.com", "Normal");

        Library l = new Library();
        l.addUser(u1);
        l.addUser(u2);
        l.addBook(b1);
        l.addBook(b2);
        l.addBook(b3);
        l.addBook(b4);
        l.addBook(b5);
        l.addRefBook(refBook1);
        l.addRefBook(refBook2);
        l.addRefBook(refBook3);
        l.addRefBook(refBook4);
        l.addRefBook(refBook5);
        boolean running = true;
        String library_username = "admin";
        String password = "admin";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please 1 to  login as admin");
        System.out.println("Please 2 to  login as user");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter your username");
                String enteredUserName = scanner.next();
                System.out.println("Enter your password");
                String enteredPassword = scanner.next();
                if ((library_username.equals(enteredUserName)) && (password.equals(enteredPassword))) {
                    System.out.println("Welcome, Library Admin");
                    while (running) {
                        System.out.println("Library Management System");
                        System.out.println("Please the no to perform the following activities ");
                        System.out.println("Enter no 1 to add the User");
                        System.out.println("Enter no 2 to remove the User");
                        System.out.println("Enter no 3 to update the User");
                        System.out.println("Enter no 4 to view all  the Users");
                        System.out.println("Enter no 5 to search user by Name");
                        System.out.println("Enter no 6 to add the Book");
                        System.out.println("Enter no 7 to remove the Book");
                        System.out.println("Enter no 8 to update the Book");
                        System.out.println("Enter no 9 to search the book by it's Genre");

                        System.out.println("Enter no 10 to view all  the Books");
                        System.out.println("Enter no 11 to borrow  the Book");
                        System.out.println("Enter no 12 to report lost of the Book");
                        System.out.println("Enter no 13 to View all Reference Book ");
                        System.out.println("Enter no 14 to add Reference Book ");
                        System.out.println("Enter no 15 to exit ");


//                       Scanner scanner = new Scanner(System.in);
                        System.out.println("Enter your choice:");
                        int userChoice = scanner.nextInt();
                        switch (userChoice) {
                            case 1:
                                System.out.println("Enter user ID:");
                                int id = scanner.nextInt();
                                scanner.nextLine();

                                System.out.println("Enter user name:");
                                String uname = scanner.nextLine();

                                System.out.println("Enter contact number:");
                                int contact = scanner.nextInt();
                                scanner.nextLine();

                                System.out.println("Enter email:");
                                String email = scanner.nextLine();
                                System.out.println("Enter Category:");
                                String category = scanner.nextLine();

                                User u = new User(id, uname, contact, email, category);
                                l.addUser(u);
                                break;
                            case 2:
                                System.out.println("Enter the name of the user you want to remove:");
                                String name = scanner.nextLine();
                                l.removeUser(name);
                                break;
                            case 3:
                                System.out.println("Enter the id of the user you want to Update");//int id, String username, int contact, String email, int balance);
                                int uid = scanner.nextInt();
                                System.out.println("Enter the username you want to keep ");
                                String username = scanner.nextLine();

                                System.out.println("Enter the contact you want to keep");
                                int phone = scanner.nextInt();

                                System.out.println("Enter the email you want to keep");
                                String emailAdd = scanner.nextLine();
                                System.out.println("Enter the balance you want to keep");
                                int balance = scanner.nextInt();
                                l.updateUser(uid, username, phone, emailAdd, balance);
                                break;
                            case 4:
                                l.viewAllUsers();
                                break;
                            case 5:
                                System.out.println("Enter the name of the user you want to search");
                                String searchBookName = scanner.next();
                                l.searchUserByName(searchBookName);
                                break;
                            case 6:

                                System.out.println("Enter the id of the book");
                                int bid = scanner.nextInt();
                                l.checkBookIdExist(bid);
                                System.out.println("Enter the Book's name");
                                String bookName = scanner.next();
                                System.out.println("Enter the author's name");
                                String authorName = scanner.next();
                                System.out.println("Enter the Genre of the Book");
                                String genre = scanner.next();
                                System.out.println("Enter the no of books available");
                                int count = scanner.nextInt();
                                Book b = new Book(bid, bookName, authorName, genre, count);
                                l.addBook(b);
                                break;
                            case 7:
                                System.out.println("Enter the name of the book you want to remove");
                                String removeName = scanner.nextLine();
                                l.removeBook(removeName);
                                break;
                            case 8:
                                System.out.println("Enter the book id you want to update");
                                int updateBookId = scanner.nextInt();
                                scanner.nextLine();
                                System.out.println("Enter the book name  ");
                                String updatedBookName = scanner.nextLine();
                                System.out.println("Enter the author name");
                                String updatedAuthorName = scanner.nextLine();
                                System.out.println("Enter the Genre");
                                String updatedGenre = scanner.nextLine();
                                l.updateBook(updateBookId, updatedBookName, updatedAuthorName, updatedGenre);
                                break;
                            case 9:
                                System.out.println("Enter the genre you want to search");
                                String searchGenre = scanner.next();
                                l.searchByGenre(searchGenre);
                                break;

                            case 10:
                                l.viewAll();
                                break;
                            case 11:
                                System.out.println("Enter the name of the book you want to borrow");
                                String borrowBookName = scanner.next();
                                System.out.println("Enter the name of the user that wants to borrow the book");
                                scanner.nextLine();
                                String borrowingUserName = scanner.next();
                                System.out.println("Enter the no of duration");
                                int duration = scanner.nextInt();
                                scanner.nextLine();
                                l.borrowBook(borrowBookName, borrowingUserName, duration);
                                break;
                            case 12:
                                System.out.println("Enter the name of the user who lost the book");
                                String lostUser = scanner.next();
                                System.out.println("Enter the name of the  lost the book");
                                String lostBook = scanner.next();
                                l.lostBook(lostUser, lostBook);

                            case 13:
                                l.viewAllReferenceBook();
                                break;
                            case 14:

                                System.out.println("Enter the id of the book");
                                int refid = scanner.nextInt();
                                l.checkBookIdExist(refid);
                                System.out.println("Enter the RefBook's name");
                                String refBookName = scanner.next();
                                System.out.println("Enter the author's name");
                                String refAuthorName = scanner.next();
                                System.out.println("Enter the Genre of the Book");
                                String refGenre = scanner.next();
                                System.out.println("Enter the no of books available");
                                int refCount = scanner.nextInt();
                                System.out.println("Enter the no of hours");
                                int noofHours = scanner.nextInt();
                                ReferenceBook refB = new ReferenceBook(refid, refBookName, refAuthorName, refGenre, refCount, noofHours);
                                l.addRefBook(refB);
                                break;
                            case 15:
                                System.out.println("Exiting");
                                running = false;
                                break;
                        }
                    }
                } else {
                    System.out.println("Enter correct Username and Password");
                }
                break;
            case 2:
                String username = "user";
                String pass = "user";
                System.out.println("Enter your username");
                String userName = scanner.next();
                System.out.println("Enter your password");
                String userPassword = scanner.next();
                if ((userName.equals(username)) && (pass.equals(userPassword))) {
                    while (running) {
                        System.out.println("Welcome user");
                        System.out.println("please no 1 to view your detail");
                        System.out.println("please no 2 to view all books");
                        System.out.println("please no 3 to find book according to the genre");
                        System.out.println("please no 4 to exit");
                        System.out.println("Enter your choice:");
                        int userChoice = scanner.nextInt();
                        switch (userChoice) {
                            case 1:
                                System.out.println("Enter your name :");
                                String name = scanner.next();
                                l.searchUserByName(name);
                                break;
                            case 2:
                                l.viewAll();
                                break;
                            case 3:
                                System.out.println("Enter the genre to find the books related to it");
                                String g = scanner.next();
                                l.searchByGenre(g);
                                break;

                            case 4:
                                System.out.println("Exiting ! Thank You");
                                running = false;
                                break;
                        }
                    }
                } else {
                    System.out.println("You have entered wrong Username and Password");
                    break;
                }


        }


        Book b6 = new Book(106, "War and Peace", "Leo Tolstoy", "Historical", 5);
        Book b7 = new Book(107, "The Catcher in the Rye", "J.D. Salinger", "Young Adult", 5);
        Book b8 = new Book(108, "The Hobbit", "J.R.R. Tolkien", "Fantasy", 5);
        Book b9 = new Book(109, "Fahrenheit 451", "Ray Bradbury", "Science Fiction", 5);
        Book b10 = new Book(110, "Jane Eyre", "Charlotte Bronte", "Classic", 5);
        Book b11 = new Book(111, "Crime and Punishment", "Fyodor Dostoevsky", "Psychological", 5);
        Book b12 = new Book(112, "Brave New World", "Aldous Huxley", "Dystopian", 5);
        Book b13 = new Book(113, "The Lord of the Rings", "J.R.R. Tolkien", "Fantasy", 5);
        Book b14 = new Book(114, "The Alchemist", "Paulo Coelho", "Adventure", 5);
        Book b15 = new Book(115, "Wuthering Heights", "Emily Bronte", "Gothic", 5);
        Book b16 = new Book(116, "Frankenstein", "Mary Shelley", "Horror", 5);
        Book b17 = new Book(117, "Animal Farm", "George Orwell", "Political Satire", 5);
        Book b18 = new Book(118, "The Odyssey", "Homer", "Epic", 5);
        Book b19 = new Book(119, "Don Quixote", "Miguel de Cervantes", "Classic", 5);
        Book b20 = new Book(120, "The Brothers Karamazov", "Fyodor Dostoevsky", "Philosophical", 5);


//        l.addBook(b3);
//        l.addBook(b4);
//        l.addBook(b5);
//        l.addBook(b6);
//        l.addBook(b7);
//        l.addBook(b8);
//        l.addBook(b9);
//        l.addBook(b10);
//        l.addBook(b11);
//        l.addBook(b12);
//        l.addBook(b13);
//        l.addBook(b14);
//        l.addBook(b15);
//        l.addBook(b16);
//        l.addBook(b17);
//        l.addBook(b18);
//        l.addBook(b19);
//        l.addBook(b20);


//        l.borrowBook("The Odyssey",u1);
//        l.borrowBook("The Odyssey",u2);
//        System.out.println(u1.getBorrowedBooks());
//        System.out.println(u2.getBorrowedBooks());
//
//        l.pricing(u1,4);
//        l.UpdateBook(102,"hello","kiran","comedy");
//
//     l.viewAll();

//        l.viewAllUsers();

//        l.updateUser(1,"ramesh",98456223,"ramesh@hotmail.com",100);

//        l.viewAllUsers();

//l.lostBook(u2);
//l.lostBook(u1,b1);
//l.viewAll();


    }
}