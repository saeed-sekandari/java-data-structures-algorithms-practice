public class Student {
    private String name;
    Student(){
        name = "unknown";
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Saeed");
        System.out.println("Name: " + s.getName());
    }
}
