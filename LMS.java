package CodeClause;

import java.util.Scanner;

public class LMS {
    public static void main(String[] args) {
        Library library = new Library(); 
        StudentManager studentManager = new StudentManager(); 
        Scanner scanner = new Scanner(System.in); 
        int choice;
        do {
            System.out.println("**** Library Management System ****");
            System.out.println("1. Add Book");
            System.out.println("2. Increase Book Quantity");
            System.out.println("3. Search Book by Serial Number");
            System.out.println("4. Search Book by Author Name");
            System.out.println("5. Display All Books");
            System.out.println("6. Add Student");
            System.out.println("7. Display All Students");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 
            switch (choice) {
                case 1:
                    System.out.print("Enter Serial Number: ");
                    int serialNo = scanner.nextInt(); 
                    scanner.nextLine();
                    System.out.print("Enter Book Name: ");
                    String bookName = scanner.nextLine(); 
                    System.out.print("Enter Author Name: ");
                    String authorName = scanner.nextLine(); 
                    System.out.print("Enter Quantity: ");
                    int quantity = scanner.nextInt(); 
                    scanner.nextLine();
                    Book book = new Book(serialNo, bookName, authorName, quantity);
                    library.addBook(book); 
                    break;
                case 2:
                    System.out.print("Enter Serial Number: ");
                    int sn = scanner.nextInt(); 
                    scanner.nextLine();
                    System.out.print("Enter Quantity to Increase: ");
                    int qty = scanner.nextInt();
                    scanner.nextLine();
                    library.increaseBookQty(sn, qty); 
                    break;
                case 3:
                    System.out.print("Enter Serial Number: ");
                    int serNo = scanner.nextInt(); 
                    scanner.nextLine();
                    library.searchBookBySerialNo(serNo);  
                    break;
                case 4:
                    System.out.print("Enter Author Name: ");
                    String authName = scanner.nextLine(); 
                    library.searchBookByAuthorName(authName); 
                    break;
                case 5:
                    library.displayAllBooks(); 
                    break;
                case 6:
                    System.out.print("Enter Student Name: ");
                    String studentName = scanner.nextLine(); 
                    System.out.print("Enter Registration Number: ");
                    String regNo = scanner.nextLine(); 
                    Student student = new Student(studentName, regNo); 
                    studentManager.addStudent(student); 
                    break;
                case 7:
                    studentManager.displayAllStudents(); 
                    break;
                case 0:
                    System.out.println("********** Thank You *************");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
            System.out.println();
        } while (choice != 0);
        scanner.close(); 
    }
}