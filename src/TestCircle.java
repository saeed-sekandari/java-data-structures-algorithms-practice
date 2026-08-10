public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(25);
        Circle c3 = new Circle(125);

        System.out.println("Circle c1: ");
        System.out.println("Radius = " + c1.radius);
        System.out.println("Area = " + c1.getArea());
        System.out.println("Perimeter = " + c1.getPerimeter());
        System.out.println();

        System.out.println("Circle c2: ");
        System.out.println("Radius = " + c2.radius);
        System.out.println("Area = " + c2.getArea());
        System.out.println("Perimeter = " + c2.getPerimeter());
        System.out.println();

        System.out.println("Circle c3: ");
        System.out.println("Radius = " + c3.radius);
        System.out.println("Area = " + c3.getArea());
        System.out.println("Perimeter = " + c3.getPerimeter());

    }
}
