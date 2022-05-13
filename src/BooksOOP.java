public class BooksOOP {
    private String bookTitle;
    private int bookPage;
    private int bookPub;

    public BooksOOP (String bookTitle, int bookPage, int bookPub){
        this.bookTitle = bookTitle;
        this.bookPage = bookPage;
        this.bookPub = bookPub;
    }

    public String getTitle(){
        return this.bookTitle;
    }

    public int getPage(){
        return this.bookPage;
    }

    public int getPub(){
        return this.bookPub;
    }

    @Override
    public String toString(){
        return getTitle() + ", " + getPage() + "pages, " + getPub();
    }
}