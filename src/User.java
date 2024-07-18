import java.util.ArrayList;
import java.util.List;

public class User {

    private int uid;
    private String uname;
    private int contact;
    private String email;
    private boolean hasBooks;
    private ArrayList<Book> borrowedBooks;
//    private int pricing;
//    private int months;
    private int balance;


    public User(int uid, String uname, int contact, String email) {
        this.uid = uid;
        this.uname = uname;
        this.contact = contact;
        this.email = email;
        this.hasBooks = false;
        this.borrowedBooks = new ArrayList<>();
//        this.pricing = 200;
//        this.months = 1;
        this.balance = 1000;


    }
    public void setUname(String uname){
        this.uname = uname;
    }
    public void setContact(int contact){
         this.contact = contact;
    }
    public void setEmail(String email){
        this.email = email;
    }
 public void setBalance(int balance){
         this.balance = balance;
    }

    public int getUid() {
        return uid;
    }

    public String getUname() {
        return uname;
    }

    public int getContact() {

        return contact;
    }

    public String getEmail() {
        return email;
    }

    public boolean getHasBooks() {
        return hasBooks;
    }

//    public int getPricing(){
//        return pricing;
//    }
//    public int getMonths(){
//        return months;
//    }
    public int getBalance(){
        return balance;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }
    public void addBook(Book book){
        borrowedBooks.add(book);


    }

    @Override

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("User Details:\n");
        sb.append("--------------------------------------------------------------------------------------------\n");
        sb.append(String.format("%-20s | %-20s | %-30s | %-10s | %-20s\n", "Name", "Contact", "Email", "Balance", "Borrowed Books"));
        sb.append("--------------------------------------------------------------------------------------------\n");
        sb.append(String.format("%-20s | %-20s | %-30s | %-10d | %-20s\n", uname, String.valueOf(contact), email, balance, borrowedBooks));
        return sb.toString();
    }


}
