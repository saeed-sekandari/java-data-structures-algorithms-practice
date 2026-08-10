public class GetterSetter {
    private double radius;
    //Declare a constructor
    public GetterSetter(){
        radius = 1;
    }
    //create a getter method
    public double getRadius(){
        return radius;
    }
    //create a setter method
    public void setRadius(double newRadius){
        if(newRadius > 0){
            radius = newRadius;
        }
    }
    //get the area of the circle
    public double getArea(){
        return Math.PI * radius * radius;
    }
}
