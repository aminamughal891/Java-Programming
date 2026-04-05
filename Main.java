public class Main {
    
    public static void main(String[] args){

        Students s1 = new Students();
        s1.name = "Amina Maqsood ";
        s1.rollNumber = 46;

        Students s2 = new Students();
        s2.name = "Farah";
        s2.rollNumber = 11;

        s1.displayInfo();
        s2.displayInfo();
    }
}