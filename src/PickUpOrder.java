public class PickUpOrder extends Order {
    private String pickUpLocation;

    //Create an order pick with order details and pick up location
    public PickUpOrder(String orderId, String customerName, double totalPrice, String pickUpLocation){
        super(orderId, customerName, totalPrice);
        this.pickUpLocation = pickUpLocation;
    }
    //Adds the pickup information to the basic order summary
    @Override
    public String toString(){
        return super.toString() + ", Pick Up Location: " + pickUpLocation;
    }

}
