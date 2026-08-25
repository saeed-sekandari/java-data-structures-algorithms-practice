public class TestArrayOfObjects {
    public static void main(String[] args) {

        Circle[] circles = new Circle[4];

        for (int i = 0; i < circles.length; i++) {
            circles[i] = new Circle(i+1);
        }
        for(int i=0; i<circles.length;i++){
            System.out.println("Circle " + (i+1));
            System.out.println("Radius " + circles[i].getRadius());
            System.out.println("Area " + circles[i].getArea());
            System.out.println("Perimeter " + circles[i].getPerimeter());
            System.out.println();
        }
    }
}
