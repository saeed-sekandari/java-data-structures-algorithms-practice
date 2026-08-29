import java.util.ArrayList;

public class ShoppingCart {
    private String customerName;
    private ArrayList<String> items = new ArrayList<>();

    //Creates a shopping cart for the customer
    public ShoppingCart(String customerName){
        this.customerName = customerName;
    }
    //return customer name
    public String getCustomerName(){
        return customerName;
    }
    //Add items to the shopping cart
    public void addItems(String itemName){
      items.add(itemName);
    }
    //remove items
    public void removeItem(String itemName){
        items.remove(itemName);
    }
    //return the items
    public String getItem(int index){
        return items.get(index);
    }
    //return number of items
    public int getNumberOfItems(){
        return items.size();
    }
    //print items
    public void printItems(){
        for(int i=0; i<items.size(); i++){
            System.out.println(items.get(i));
        }
    }
    @Override
    public String toString(){
        return "Customer Name: " + customerName + ", Number of items: " + getNumberOfItems();
    }

}
