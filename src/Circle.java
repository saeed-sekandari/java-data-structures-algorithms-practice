public class Circle extends GeometricObject {
    private double radius;
    //Construct the circle with no arguments
    public Circle(){
        radius = 1;
    }
    //Construct the circle with radius
    public Circle(double radius){
        this.radius = radius;
    }
    //return the radius
    public double getRadius(){
        return radius;
    }
    //update the radius
    public void setRadius(double radius){
        this.radius = radius;
    }
    //return the area
    public double getArea(){
        return radius * radius * Math.PI;
    }
    //return the perimeter
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
    //return the diameter
    public double getDiameter(){
        return 2 * radius;
    }

}
