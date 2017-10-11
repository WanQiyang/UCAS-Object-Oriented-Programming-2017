public class Book {
    String BookID;
    String BookName;
    String ISBN;
    String Position;
    BookStatus Status;

    public enum BookStatus {}
    public Book(String _ID, String _Name, String ISBN, String Position) {}
    public String getBookID() {}
    public String getBookName() {}
    public String getISBN() {}
    public String getPosition() {}
    public BookStatus getStatus() {}
    public String ChangeName(String _Name) {}
    public String ChangeISBN(String _ISBN) {}
    public String ChangePosition(String _Position) {}
    public int Borrow() {}
    public int Return() {}

}
