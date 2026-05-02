public class HOD extends Teacher {
    private String department;

    public HOD(String name, String subject, String department) {
        super(name, subject); // Passing name and subject to Teacher constructor
        this.department = department;
    }

    public void manageDepartment() {
        System.out.println("HOD " + name + " is managing the " + department + " department.");
    }
}