public class TestPerson {
    public static void main(String[] args) {
        FirstPerson firstPerson = new FirstPerson();
        firstPerson.setName("Yasamin");
        System.out.println("Name: " + firstPerson.getName());
        firstPerson.setAge(22);
        System.out.println("Age: " + firstPerson.getAge());
        firstPerson.setMaritalStatus("Engaged");
        System.out.println("Marital Status: " + firstPerson.getMaritalStatus());
        firstPerson.setSkinColor("Wheat");
        System.out.println("Skin Color: " + firstPerson.getSkinColor());

    }
}
