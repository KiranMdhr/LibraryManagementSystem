public class Book {
    private int bid;
    private String bookname;
    private String authorName;
    private String genre;
    private boolean isAvailable;



    public Book(int bid, String bookname, String authorName, String genre,int months){
        this.bid = bid;
        this.bookname = bookname;
        this.authorName = authorName;
        this.genre = genre;
        this.isAvailable = true;



    }
    public int getBid(){
        return bid;
    }

    public String getBookName(){
        return bookname;
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



    public void setIsAvailable(boolean isAvailable){
        this.isAvailable = isAvailable;
    }


    public String toString(){
        return "BookName : " + bookname + "AuthorName : " +authorName + "Genre :"+ genre + "isavailable"+isAvailable ;
    }
}
