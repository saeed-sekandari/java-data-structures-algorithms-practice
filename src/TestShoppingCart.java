public class TestShoppingCart {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart("Ali");
        //add items
        shoppingCart.addItems("Iphone 16 pro max");
        shoppingCart.addItems("MacBook Pro M2 max");
        shoppingCart.addItems("Iphone 16 pro max case");
        shoppingCart.addItems("Airpods Pro gen 7");
        //print customer name
        System.out.println(shoppingCart.getCustomerName());
        //print number of items
        System.out.println(shoppingCart.getNumberOfItems());
        //print one item using index
        System.out.println(shoppingCart.getItem(2));
        //print all items
        //remove item
        shoppingCart.removeItem("Iphone 16 pro max case");
        shoppingCart.printItems();
        shoppingCart.findItem("Pencil");
    }
}
