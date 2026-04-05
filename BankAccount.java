public class BankAccount {
    private double balance;
    private String accountHolder;
    public BankAccount( String accountHolder,double initialBalance) {
        if(initialBalance >= 0){
            this.balance = initialBalance;
        }else{
            System.out.println("Error! Initial Balance cannot be Negative. Setting balance to 0.");
            this.balance = 0;
        }
        this.accountHolder = accountHolder;
    }
    public double getBalance() {
        return balance;
    }
    public String getAccountHolder() {
        return accountHolder;
    }
    public void deposit(double amount) {
        if(amount > 0){
            balance += amount;
        }else{
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdrawal successful! New balance: " + amount);
        }else{
            System.out.println("Transaction failed! Invalid amount");
        }
    }

    public void displayAccountDetails() {
         System.out.println("Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}