public class TestGetterSetter {
    public static void main(String[] args) {
        GetterSetter c1 = new GetterSetter();
        System.out.println("The radius of c1 is " + c1.getRadius());
        c1.setRadius(21);
        System.out.println("The updated radius of c1 is " + c1.getRadius());
        System.out.println("The area of updated c1 is " + c1.getArea());
        c1.setRadius(-33);
        System.out.println("The new updated radius of c1 is " + c1.getRadius());




    }
}
