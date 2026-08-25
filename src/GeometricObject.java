public class GeometricObject {
    private String color;
    private boolean filled;

    //construct the geometric object with no argument
    public GeometricObject(){
        color = "Unknown";
        filled = true;
    }
    //Construct the geometric object with arguments
    public GeometricObject(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    //return the color
    public String getColor(){
        return color;
    }
    //Update the color
    public void setColor(String color){
        this.color = color;
    }
    //return the filled or not filled
    public boolean isFilled(){
        return filled;
    }
    //update the filled status
    public void setFilled(boolean filled){
        this.filled = filled;
    }
}
