public class Task7Main {
    public static void main(String[] args) {
        // 1. Initialize Teacher
        Teacher myTeacher = new Teacher("Mr. Seemab Shaukat", "Software Construction");
        
        // 2. Initialize Student
        Student myStudent = new Student("Amina Maqsood", "BSSE012315046");
        
        // 3. Initialize HOD
        HOD myHOD = new HOD("Dr. Smith", "Computer Science", "Software Engineering");

        // Execute Methods
        System.out.println("--- University System Execution ---");
        myStudent.isStudying();
        myTeacher.teach();
        
        // HOD demonstrating inherited and unique methods
        myHOD.teach(); 
        myHOD.manageDepartment();
    }
}