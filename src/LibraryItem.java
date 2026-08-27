public class LibraryItem {
    private String title;
    private String itemId;

    //Construct a no argument library item
    public LibraryItem(){
        this("Unknown", "Unknown");
    }
    //construct a library item with arguments
    public LibraryItem(String title, String itemId){
        this.title = title;
        this.itemId = itemId;
    }
    //return title
    public String getTitle(){
        return title;
    }
    //update title
    public void setTitle(String title){
        this.title = title;
    }
    //return itemId
    public String getItemId(){
        return itemId;
    }
    //set itemId
    public void setItemId(String itemId){
        this.itemId = itemId;
    }
    //return a string statement
    @Override
    public String toString(){
     return "Title: " + getTitle() + ", Item ID: " + itemId;
    }
}
