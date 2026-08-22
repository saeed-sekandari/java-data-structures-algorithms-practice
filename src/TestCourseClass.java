public class TestCourseClass {
    public static void main(String[] args) {
        //create an object from the Course class
        Course course = new Course("Comp 380");
        //add students
        course.addStudent("Saeed");
        course.addStudent("Yasamin");
        course.addStudent("peter");
        course.addStudent("Yasamin");

        //drop students
        course.dropStudent("Yasamin");

        String[] students = course.getStudents();

        System.out.println("Course Name: " + course.getCourseName());
        System.out.println("Number of students: " + course.getNumberOfStudents());
        System.out.println("Students: " );
        for (int i=0; i< course.getNumberOfStudents(); i++){
            System.out.println(students[i]);
        }
    }
}
