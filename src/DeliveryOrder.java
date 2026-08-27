public class DeliveryOrder extends Order {
    private String deliveryAddress;
    private double deliveryFee;

    //creates an order delivery with the given information
    public DeliveryOrder(String orderId,String customerName,double totalPrice,String deliveryAddress, double deliveryFee){
        super(orderId, customerName, totalPrice);
        this.deliveryAddress = deliveryAddress;
        this.deliveryFee = deliveryFee;
    }
    //Added the delivery info the order summary
    @Override
    public String toString(){
        return super.toString() + ", Delivery Address: " + deliveryAddress +
                ", Delivery Fee: " + deliveryFee;
    }

}
