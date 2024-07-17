//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        System.out.println("Library Manangement System");
        System.out.println("Please the no to perform the following activities ");
        System.out.println("Enter no 1 to add the User");
        System.out.println("Enter no 2 to remove the User");
        System.out.println("Enter no 3 to update the User");
        System.out.println("Enter no 4 to view all  the Users");
        System.out.println("Enter no 5 to add the Book");
        System.out.println("Enter no 6 to remove the Book");
        System.out.println("Enter no 7 to update the Book");
        System.out.println("Enter no 8 to search the book by it's Genre");
        System.out.println("Enter no 8 to view all  the Books");
        System.out.println("Enter no 9 to borrow  the Book");
        System.out.println("Enter no 10 to report lost of the Book");

        Library l = new Library()
        switch (){
            case 1:  l.addUser();

        }

        User u1 = new User(1, "kiran", 78987978, "kiranmdhr9@gmail.com");
        User u2 = new User(2, "hari", 1234341, "hari12@gmail.com");


        Book b1 = new Book(101, "To Kill a Mockingbird", "Harper Lee", "Fiction", 5, 12);
        Book b2 = new Book(102, "1984", "George Orwell", "Dystopian", 5, 6);
        Book b3 = new Book(103, "Pride and Prejudice", "Jane Austen", "Romance", 5, 24);
        Book b4 = new Book(104, "The Great Gatsby", "F. Scott Fitzgerald", "Classic", 5, 18);
        Book b5 = new Book(105, "Moby-Dick", "Herman Melville", "Adventure", 5, 9);
        Book b6 = new Book(106, "War and Peace", "Leo Tolstoy", "Historical", 5, 36);
        Book b7 = new Book(107, "The Catcher in the Rye", "J.D. Salinger", "Young Adult", 5, 5);
        Book b8 = new Book(108, "The Hobbit", "J.R.R. Tolkien", "Fantasy", 5, 15);
        Book b9 = new Book(109, "Fahrenheit 451", "Ray Bradbury", "Science Fiction", 5, 10);
        Book b10 = new Book(110, "Jane Eyre", "Charlotte Bronte", "Classic", 5, 22);
        Book b11 = new Book(111, "Crime and Punishment", "Fyodor Dostoevsky", "Psychological", 5, 27);
        Book b12 = new Book(112, "Brave New World", "Aldous Huxley", "Dystopian", 5, 7);
        Book b13 = new Book(113, "The Lord of the Rings", "J.R.R. Tolkien", "Fantasy", 5, 48);
        Book b14 = new Book(114, "The Alchemist", "Paulo Coelho", "Adventure", 5, 11);
        Book b15 = new Book(115, "Wuthering Heights", "Emily Bronte", "Gothic", 5, 14);
        Book b16 = new Book(116, "Frankenstein", "Mary Shelley", "Horror", 5, 20);
        Book b17 = new Book(117, "Animal Farm", "George Orwell", "Political Satire", 5, 8);
        Book b18 = new Book(118, "The Odyssey", "Homer", "Epic", 5, 30);
        Book b19 = new Book(119, "Don Quixote", "Miguel de Cervantes", "Classic", 5, 25);
        Book b20 = new Book(120, "The Brothers Karamazov", "Fyodor Dostoevsky", "Philosophical", 5, 32);


        Library l = new Library();
        l.addUser(u1);
        l.addUser(u2);
        l.addBook(b1);
        l.addBook(b2);
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
        l.viewAllUsers();

    }
}