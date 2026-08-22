//implement a course class for a school system
public class Course {
    //declare 3 private data fields
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    //construct a course object with a course name
    public Course(String courseName){
        this.courseName = courseName;
    }
    //add a student
    public void addStudent(String studentName){
        students[numberOfStudents]= studentName;
        numberOfStudents++;
    }
    //return all the students currently stored in the course
    public String[] getStudents(){
        return students;
    }
    //return number of students who are enrolled
    public int getNumberOfStudents(){
        return numberOfStudents;
    }
    //return the course name
    public String getCourseName(){
        return courseName;
    }

    // Drop a student
    public void dropStudent(String student) {
        for (int i = 0; i < numberOfStudents; i++) {

            // Find the student
            if (students[i].equals(student)) {

                // Shift students to the left
                for (int j = i; j < numberOfStudents - 1; j++) {
                    students[j] = students[j + 1];
                }

                // Clear the old last position
                students[numberOfStudents - 1] = null;

                // Decrease the number of students
                numberOfStudents--;

                // Student was found and removed, so stop searching
                break;
            }
        }
    }

}