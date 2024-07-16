public class Book {
    private int bid;
    private String bookName;
    private String authorName;
    private String genre;
    private boolean isAvailable;



    public Book(int bid, String bookName, String authorName, String genre,int months){
        this.bid = bid;
        this.bookName = bookName;
        this.authorName = authorName;
        this.genre = genre;
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
    public void setGenre(String genre ){
        this.genre = genre;
    }


    public void setIsAvailable(boolean isAvailable){
        this.isAvailable = isAvailable;
    }


    public String toString(){
        return "BookName : " + bookName + "AuthorName : " +authorName + "Genre :"+ genre + "isavailable"+isAvailable ;
    }
}
