public class ReferenceBook extends Book{
    int noOfHours;
    public ReferenceBook(int bid, String bookName, String authorName, String genre,int count,int noOfHours){
        super(bid,bookName,authorName,genre,count);
        this.noOfHours = noOfHours;
    }
}
