public class Book {
    private int bid;
    private String bookName;
    private String authorName;
    private String genre;
    private int count;
    private boolean isAvailable;



    public Book(int bid, String bookName, String authorName, String genre,int count,int months){
        this.bid = bid;
        this.bookName = bookName;
        this.authorName = authorName;
        this.genre = genre;
        this.count = count;
        this.isAvailable = true;



    }
    public int getBid(){
        return bid;
    }

    public String getBookName(){
        return bookName;
    }
    public String getAuthorName(){
        return authorName;
    }
    public String getGenre(){
        return genre;
    }
    public boolean getIsAvailable(){
        return isAvailable;
    }
    public void setBookName(String bookName){
        this.bookName = bookName;
}
    public void setAuthorName(String authorName){
        this.authorName = authorName;
    }
    public void setCount(int count){
        this.count = count;
    }
    public int getCount(){
        return  count;
    }
    public void setGenre(String genre ){
        this.genre = genre;
    }


    public void setIsAvailable(boolean isAvailable){
        this.isAvailable = isAvailable;
    }



    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Book Details:\n");
        sb.append("--------------------------------------------------------------------------------------------\n");
        sb.append(String.format("%-20s | %-20s | %-20s | %-10s | %-10s\n", "BookName", "AuthorName", "Genre", "Count", "IsAvailable"));
        sb.append("--------------------------------------------------------------------------------------------\n");
        sb.append(String.format("%-20s | %-20s | %-20s | %-10d | %-10b\n", bookName, authorName, genre, count, isAvailable));
        sb.append("--------------------------------------------------------------------------------------------\n");
        return sb.toString();
    }
}
