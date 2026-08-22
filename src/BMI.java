public class BMI {
    //declare variables
    private String name;
    private int age;
    private double weight;//in pounds
    private double height;//in inches
    public static final double KILOGRAMS_PER_POUNDS = 0.45359237;
    public static final double METERS_PER_INCH = 0.0254;

    //constructor with four parameters
    public BMI(String name, int age, double weight, double height){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
    //construct name, weight and height
    public BMI(String name, double weight, double height){
        this(name, 20, weight, height);
    }
    //return the BMI
    public double getBMI(){
        //calculate the bmi
        double bmi = (weight * KILOGRAMS_PER_POUNDS) / (height * METERS_PER_INCH * height * METERS_PER_INCH);
        return bmi;
    }
    //return the status of the BMI
    public String getStatus(){
        String status;
        double bmi = getBMI();
        if(bmi < 18.5){
            status = "underweight";
        } else if (bmi < 25) {
            status = "normal";
        } else if (bmi < 30) {
            status = "overweight";
        }
        else
            status = "obese";

        return status;
    }
    //get name
    public String getName(){
        return name;
    }
    //get age
    public int getAge(){
        return age;
    }
    //get weight
    public double getWeight(){
        return weight;
    }
    //get height
    public double getHeight(){
        return height;
    }

}
