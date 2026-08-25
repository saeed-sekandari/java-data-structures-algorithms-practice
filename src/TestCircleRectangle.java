public class TestCircleRectangle {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.setColor("red");
        circle.setFilled(true);
        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Circle Perimeter: " + circle.getPerimeter());
        System.out.println("Circle Diameter: " + circle.getDiameter());
        System.out.println("Circle color: " + circle.getColor());
        System.out.println("Circle Filled Status: " + circle.isFilled());

        Rectangle rectangle = new Rectangle(4, 6);
        rectangle.setColor("blue");
        rectangle.setFilled(false);
        System.out.println("\nRectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());
        System.out.println("Rectangle color: " + rectangle.getColor());
        System.out.println("Rectangle Filled Status: " + rectangle.isFilled());

    }
}
