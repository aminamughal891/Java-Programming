public class Teacher extends Person {
    protected String subject;

    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    public void teach() {
        System.out.println("Teacher " + name + " is teaching " + subject + ".");
    }
}