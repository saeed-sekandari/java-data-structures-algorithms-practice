public class Book extends LibraryItem {
    private String author;
    private int numberOfPages;

    //construct a no-argument constructor
    public Book(){

    }
    //construct book with details
    public Book(String title, String itemId, String author, int numberOfPages){
        super(title,itemId);
        this.author = author;
        this.numberOfPages = numberOfPages;
    }
    //return author
    public String getAuthor(){
        return author;
    }
    //update author
    public void setAuthor(String author){
        this.author = author;
    }
    //return number of pages
    public int getNumberOfPages(){
        return numberOfPages;
    }
    //update number of pages
    public void setNumberOfPages(int numberOfPages){
        this.numberOfPages = numberOfPages;
    }
    //override the method from the parent class
    @Override
    public String toString(){
        return super.toString() +  ", author: " + getAuthor() + ", number of pages is: " + getNumberOfPages();
    }


}
