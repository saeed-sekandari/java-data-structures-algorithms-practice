import java.util.ArrayList;
public class TestOrder {
    public static void main(String[] args) {
        /*//creates an array that can store the regular, order pickup and delivery info
        Order [] orders = new Order[3];
        //Polymorphism... creates different objects from the same parent
        orders[0] = new Order("Ak233", "Saeed", 233.8);
        orders[1] = new PickUpOrder("AC901", "Yasamin", 449.22, "Northridge");
        orders[2] = new DeliveryOrder("AP068", "John",44.94, "21828 Rosce Blvd Apt 22", 359.8);

        for(int i=0; i< orders.length; i++){
            System.out.println(orders[i]);
        }*/
        //Creates an ArrayList that can store regular, order pickup and delivery info
        ArrayList<Order> orders = new ArrayList<>();
        //polymorphism that can creates different objects from same parent
        orders.add(new Order("AK233","Saeed",233.8));
        orders.add(new PickUpOrder("AC901","Yasamin", 449.22, "Northridge"));
        orders.add(new DeliveryOrder("AP068","John", 444.94, "21828 Roscoe Blvd Apt 22",44.8));

        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
