public class BankMain {
    
    public static void main(String[] args){
    BankAccount account1 = new BankAccount("Amina Maqsood", 0.0);
        BankAccount account2 = new BankAccount("Sarah", 10000);
    
        account1.deposit(-100);
        account1.withdraw(50);

        account2.deposit(500);
        account2.withdraw(3000);
      
        account1.displayAccountDetails();
        account2.displayAccountDetails();

        System.out.println("Final Details:" + account1.getAccountHolder() + account1.getBalance());
        System.out.println("Final Details:" + account2.getAccountHolder() + account2.getBalance());

    }
}