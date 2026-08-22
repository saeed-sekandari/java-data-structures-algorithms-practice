public class UseBMIClass {
    public static void main(String[] args) {
        //create an object of the BMI class
        BMI bmi1 = new BMI("Saeed",28, 187.5, 71);
        System.out.println("Name: " + bmi1.getName());
        System.out.println("Age: " + bmi1.getAge());
        System.out.println("Weight: " + bmi1.getWeight());
        System.out.println("Height: " + bmi1.getHeight());
        System.out.println("BMI: " + bmi1.getBMI());
        System.out.println("BMI Status: " + bmi1.getStatus());

        BMI bmi2 = new BMI("Yasamin",132, 61.8);
        System.out.println("\nName: " + bmi2.getName());
        System.out.println("Age: " + bmi2.getAge());
        System.out.println("Weight: " + bmi2.getWeight());
        System.out.println("Height: " + bmi2.getHeight());
        System.out.println("BMI: " + bmi2.getBMI());
        System.out.println("BMI Status: " + bmi2.getStatus());

    }
}
