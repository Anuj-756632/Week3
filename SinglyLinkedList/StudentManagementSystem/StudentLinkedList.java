package StudentManagementSystem;
class StudentLinkedList {
    Student head;

    // Constructor to initialize an empty list
    public StudentLinkedList() {
        head = null;
    }

    // Add a new student at the beginning of the list
    public void addAtBeginning(int rollNumber, String name, int age, String grade) {
        Student newStudent = new Student(rollNumber, name, age, grade);
        newStudent.next = head;
        head = newStudent;
    }

    // Add a new student at the end of the list
    public void addAtEnd(int rollNumber, String name, int age, String grade) {
        Student newStudent = new Student(rollNumber, name, age, grade);
        if (head == null) {
            head = newStudent;
        } else {
            Student temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newStudent;
        }
    }

    // Add a new student at a specific position
    public void addAtPosition(int rollNumber, String name, int age, String grade, int position) {
        Student newStudent = new Student(rollNumber, name, age, grade);
        if (position == 0) {
            addAtBeginning(rollNumber, name, age, grade);
            return;
        }
        Student temp = head;
        int count = 0;
        while (temp != null && count < position - 1) {
            temp = temp.next;
            count++;
        }
        if (temp != null) {
            newStudent.next = temp.next;
            temp.next = newStudent;
        } else {
            System.out.println("Position out of range.");
        }
    }

    // Delete a student by roll number
    public void deleteByRollNumber(int rollNumber) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.rollNumber == rollNumber) {
            head = head.next;
            return;
        }

        Student temp = head;
        while (temp.next != null && temp.next.rollNumber != rollNumber) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Student not found.");
        } else {
            temp.next = temp.next.next;
        }
    }

    // Search for a student by roll number
    public Student searchByRollNumber(int rollNumber) {
        Student temp = head;
        while (temp != null) {
            if (temp.rollNumber == rollNumber) {
                return temp;
            }
            temp = temp.next;
        }
        return null; // Student not found
    }

    // Update a student's grade by roll number
    public void updateGrade(int rollNumber, String newGrade) {
        Student student = searchByRollNumber(rollNumber);
        if (student != null) {
            student.grade = newGrade;
            System.out.println("Grade updated successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    // Display all student records
    public void displayAllStudents() {
        if (head == null) {
            System.out.println("No students in the list.");
            return;
        }
        Student temp = head;
        while (temp != null) {
            System.out.println("Roll Number: " + temp.rollNumber + ", Name: " + temp.name +
                    ", Age: " + temp.age + ", Grade: " + temp.grade);
            temp = temp.next;
        }
    }
}