package CodeClause;

public class Student {
    private String studentName;
    private String registrationNumber;

    public Student(String studentName, String registrationNumber) {
        this.studentName = studentName; 
        this.registrationNumber = registrationNumber; 
    }

    public String getStudentName() {
        return studentName; 
    }

    public String getRegistrationNumber() {
        return registrationNumber; 
    }

    @Override
    public String toString() {
        return "Student Name: " + studentName + ", Registration Number: " + registrationNumber;
    }
}