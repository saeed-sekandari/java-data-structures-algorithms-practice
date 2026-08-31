public class CircleWithException {
    private double radius;
    private static int numberOfObjects = 0;

    //create a circle with no argument
    public CircleWithException(){
        this(1);
    }
    //create a circle with a new radius
    public CircleWithException(double newRadius){
        setRadius(newRadius);
        numberOfObjects++;
    }
    //return radius
    public double getRadius(){
        return radius;
    }
    //Set radius
    public void setRadius(double newRadius)
    throws IllegalArgumentException{
        if(newRadius >= 0) {
            this.radius = newRadius;
        }
        //exception handling
        else {
            throw new IllegalArgumentException("Radius can not be negative");
        }
    }
    //return number of objects
    public static int getNumberOfObjects(){
        return numberOfObjects;
    }
    //find the area
    public double getArea(){
        return radius * radius * Math.PI;
    }

}
