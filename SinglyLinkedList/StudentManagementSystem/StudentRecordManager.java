package StudentManagementSystem;
public class StudentRecordManager {
    public static void main(String[] args) {
        StudentLinkedList studentList = new StudentLinkedList();

        // Adding some students to the list
        studentList.addAtEnd(1, "Alice", 20, "A");
        studentList.addAtEnd(2, "Bob", 21, "B");
        studentList.addAtEnd(3, "Charlie", 22, "C");

        // Display all students
        System.out.println("All student records:");
        studentList.displayAllStudents();

        // Add a student at the beginning
        studentList.addAtBeginning(4, "David", 19, "B");
        System.out.println("\nAfter adding a student at the beginning:");
        studentList.displayAllStudents();

        // Add a student at a specific position
        studentList.addAtPosition(5, "Eve", 23, "A", 2);
        System.out.println("\nAfter adding a student at position 2:");
        studentList.displayAllStudents();

        // Update a student's grade
        studentList.updateGrade(2, "A+");
        System.out.println("\nAfter updating Bob's grade:");
        studentList.displayAllStudents();

        // Delete a student by roll number
        studentList.deleteByRollNumber(3);
        System.out.println("\nAfter deleting student with Roll Number 3:");
        studentList.displayAllStudents();

        // Search for a student by roll number
        Student student = studentList.searchByRollNumber(1);
        if (student != null) {
            System.out.println("\nStudent found: " + student.name + " (" + student.rollNumber + ")");
        } else {
            System.out.println("\nStudent not found.");
        }
    }
    
}
