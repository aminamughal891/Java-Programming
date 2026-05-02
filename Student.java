public class Student extends Person {
    private String rollNumber;

    public Student(String name, String rollNumber) {
        super(name); // Passing name to the Person constructor
        this.rollNumber = rollNumber;
    }

    public void isStudying() {
        System.out.println(name + " (Roll No: " + rollNumber + ") is currently studying.");
    }
}
