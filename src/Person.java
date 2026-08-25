public class Person {
    String name;
    int age;

    //Construct person info
    Person(){
        name = "Unknown";
        age = 18;
    }
    //Construct person info
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    //get name
    public String getName(){
        return name;
    }
    //set name
    public void setName(String name){
        this.name = name;
    }
    //return age
    public int getAge(){
        return age;
    }
    //set age
    public void setAge(int age){
        this.age = age;
    }
    public void sayHello(){
        System.out.println("hello");
    }
}

