package StudentManagementSystem;
class Student {
    int rollNumber;
    String name;
    int age;
    String grade;
    Student next;

    // Constructor to initialize a new student
    public Student(int rollNumber, String name, int age, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}