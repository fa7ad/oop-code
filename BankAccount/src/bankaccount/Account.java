package bankaccount;

public class Account {
    private int balance;
    private int withdraw;
    private int deposit;

    public Account() {
    }

    public Account(int bal) {
        this.balance = bal;
    }

    public void setBalance(int bl) {
        this.balance = bl;
    }

    public int getBalance() {
        return this.balance;
    }

    public void Deposit(int amt) {
        this.balance += amt;
        this.deposit += amt;
        System.out.println("Balance after deposit: " + this.balance);
    }

    public void Withdraw(int amt) {
        this.balance -= amt;
        this.withdraw += amt;
        System.out.println("Balance after withdraw: " + this.balance);
    }

    public void showAccountInfo() {
        System.out.println("ACCOUNT INFORMATION");
        System.out.println("Balance: " + this.balance);
        System.out.println("Total Deposit: " + this.deposit);
        System.out.println("Total Withdraw: " + this.withdraw);
    }
}
