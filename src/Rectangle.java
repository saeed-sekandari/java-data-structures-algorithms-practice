public class Rectangle extends GeometricObject {
    private double width;
    private double height;

    //Construct the rectangle with no arguments
    public Rectangle(){
        width = 1;
        height = 1;
    }
    //Construct the rectangle with arguments
    public Rectangle(double width, double height){
        this.height = height;
        this.width = width;
    }
    //return width
    public double getWidth(){
        return width;
    }
    //update width
    public void setWidth(double width){
        this.width = width;
    }
    //return height
    public double getHeight(){
        return height;
    }
    //update height
    public void setHeight(double height){
        this.height = height;
    }
    //return area
    public double getArea(){
        return width * height;
    }
    //return perimeter
    public double getPerimeter(){
        return 2 * (width + height);
    }
}
