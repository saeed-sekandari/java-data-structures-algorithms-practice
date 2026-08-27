public class Order {
    private String orderId;
    private String customerName;
    private double totalPrice;

    //creates an order with default values
    public Order(){
        this("Unknown","Unknown", 0);
    }
    //Creates an order with given details
    public Order(String orderId, String customerName, double totalPrice){
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
    }
    //return orderId
    public String getOrderId(){
        return orderId;
    }
    //set orderID
    public void setOrderId(String orderId){
        this.orderId = orderId;
    }
    //return customer name
    public String getCustomerName(){
        return customerName;
    }
    //set customer name
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    //return total price
    public double getTotalPrice(){
        return totalPrice;
    }
    //set total price
    public void setTotalPrice(double totalPrice){
        this.totalPrice = totalPrice;
    }
    //return a readable summary of the order
    @Override
    public String toString(){
        return "Order: " + orderId +
                ", Customer Name: " + customerName +
                ", Total Price: " + totalPrice;
    }
}
