public class TestCircleWithException {
    public static void main(String[] args) {
        try {
            //creates circles with different radius
            CircleWithException circle = new CircleWithException();
            System.out.println("fixed circle radius: " + circle.getRadius());
            System.out.println("fixed circle area: " + circle.getArea());

            CircleWithException circle1 = new CircleWithException(5);
            System.out.println("Circle 1 radius: " + circle1.getRadius());
            System.out.println("Circle 1 area: " + circle1.getArea());
            CircleWithException circle2 = new CircleWithException(-5);
            System.out.println("Circle 2 radius: " + circle2.getRadius());
            System.out.println("Circle 2 area: " + circle2.getArea());
            CircleWithException circle3 = new CircleWithException(0);
            System.out.println("Circle 3 radius: " + circle3.getRadius());
            System.out.println("Circle 3 area: " + circle3.getArea());
        }
        catch (IllegalArgumentException ex){
            System.out.println("Exception: radius cannot be negative!");
        }
        System.out.println("Number of objects: " + CircleWithException.getNumberOfObjects()) ;
    }
}
