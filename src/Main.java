//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        User u1 = new User(1,"kiran",78987978,"kiranmdhr9@gmail.com");
        User u2 = new User(2,"hari",1234341,"hari12@gmail.com");


        // Book instances
        Book b1 = new Book(101, "To Kill a Mockingbird", "Harper Lee", "Fiction", 12);
        Book b2 = new Book(102, "1984", "George Orwell", "Dystopian", 6);
        Book b3 = new Book(103, "Pride and Prejudice", "Jane Austen", "Romance", 24);
        Book b4 = new Book(104, "The Great Gatsby", "F. Scott Fitzgerald", "Classic", 18);
        Book b5 = new Book(105, "Moby-Dick", "Herman Melville", "Adventure", 9);
        Book b6 = new Book(106, "War and Peace", "Leo Tolstoy", "Historical", 36);
        Book b7 = new Book(107, "The Catcher in the Rye", "J.D. Salinger", "Young Adult", 5);
        Book b8 = new Book(108, "The Hobbit", "J.R.R. Tolkien", "Fantasy", 15);
        Book b9 = new Book(109, "Fahrenheit 451", "Ray Bradbury", "Science Fiction", 10);
        Book b10 = new Book(110, "Jane Eyre", "Charlotte Bronte", "Classic", 22);
        Book b11 = new Book(111, "Crime and Punishment", "Fyodor Dostoevsky", "Psychological", 27);
        Book b12 = new Book(112, "Brave New World", "Aldous Huxley", "Dystopian", 7);
        Book b13 = new Book(113, "The Lord of the Rings", "J.R.R. Tolkien", "Fantasy", 48);
        Book b14 = new Book(114, "The Alchemist", "Paulo Coelho", "Adventure", 11);
        Book b15 = new Book(115, "Wuthering Heights", "Emily Bronte", "Gothic", 14);
        Book b16 = new Book(116, "Frankenstein", "Mary Shelley", "Horror", 20);
        Book b17 = new Book(117, "Animal Farm", "George Orwell", "Political Satire", 8);
        Book b18 = new Book(118, "The Odyssey", "Homer", "Epic", 30);
        Book b19 = new Book(119, "Don Quixote", "Miguel de Cervantes", "Classic", 25);
        Book b20 = new Book(120, "The Brothers Karamazov", "Fyodor Dostoevsky", "Philosophical", 32);


        Library l = new Library();
        l.addUser(u1);
        l.addUser(u2);
        l.addBook(b1);
        l.addBook(b2);
        l.addBook(b3);
        l.addBook(b4);
        l.addBook(b5);
        l.addBook(b6);
        l.addBook(b7);
        l.addBook(b8);
        l.addBook(b9);
        l.addBook(b10);
        l.addBook(b11);
        l.addBook(b12);
        l.addBook(b13);
        l.addBook(b14);
        l.addBook(b15);
        l.addBook(b16);
        l.addBook(b17);
        l.addBook(b18);
        l.addBook(b19);
        l.addBook(b20);


        l.borrowBook("The Odyssey",u1);
        System.out.println(u1.getBorrowedBooks());

        l.pricing(u1,4);
    }
}