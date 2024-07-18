public interface LibraryInterface {
    public void addBook(Book book);
    public void addUser(User user);

    public void viewAll();
    public void viewAllUsers();
    public void searchUserByName(String userName);
    public void searchByGenre(String g);
    public void removeBook(String name);
    public void removeUser(String name);
    public void borrowBook(String bookName, String userName, int duration);
    public void viewAllReferenceBook();
}

