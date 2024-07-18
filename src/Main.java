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

        User u1 = new User(1, "kiran", 78987978, "kiranmdhr9@gmail.com");
        User u2 = new User(2, "hari", 1234341, "hari12@gmail.com");
        Library l = new Library();
        l.addUser(u1);
        l.addUser(u2);
        l.addBook(b1);
        l.addBook(b2);
        l.addBook(b3);
        l.addBook(b4);
        l.addBook(b5);
        boolean running = true;

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
            System.out.println("Enter no 13 to exit ");


            Scanner scanner = new Scanner(System.in);
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

                    User u = new User(id, uname, contact, email);
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
                    l.removeUser(removeName);
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
                    l.lostBook(lostUser,lostBook);


                case 13:
                    System.out.println("Exiting");
                    running = false;
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