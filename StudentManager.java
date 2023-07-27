package CodeClause;

public class StudentManager {
    private Student[] students; 
    private int studentCount; 

    public StudentManager() {
        students = new Student[50]; 
        studentCount = 0; 
    }

    public void addStudent(Student student) {
        if (studentCount < 50) { 
            students[studentCount] = student; 
            studentCount++;
            System.out.println("Student added successfully.");
        } else {
            System.out.println("No space to add more students.");
        }
    }

    public void displayAllStudents() {
        for (int i = 0; i < studentCount; i++) {
            System.out.println(students[i]); 
        }
    }
}