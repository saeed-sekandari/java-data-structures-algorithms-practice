public class TestOrder {
    public static void main(String[] args) {
        //creates an array that can store the regular, order pickup and delivery info
        Order [] orders = new Order[3];
        //Polymorphism... creates different objects from the same parent
        orders[0] = new Order("Ak233", "Saeed", 233.8);
        orders[1] = new PickUpOrder("AC901", "Yasamin", 449.22, "Northridge");
        orders[2] = new DeliveryOrder("AP068", "John",44.94, "21828 Rosce Blvd Apt 22", 359.8);

        for(int i=0; i< orders.length; i++){
            System.out.println(orders[i]);
        }
    }
}
