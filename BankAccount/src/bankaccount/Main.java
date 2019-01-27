package bankaccount;

import java.util.Scanner;

public class Main {
    public static void prompt() {
        System.out.println("Press any of the following keys");
        System.out.println("d -> deposit");
        System.out.println("w -> withdraw");
        System.out.println("i -> account information");
        System.out.println("q -> quit");
    }

    public static void main(String[] args) {
        Account ac = new Account(10000);
        System.out.println("Inital Balance: " + ac.getBalance());
        Scanner sc = new Scanner(System.in);

        
        char cmd = '\0';
        while (cmd != 'q') {
            prompt();
            cmd = sc.next().charAt(0);
            switch(cmd) {
            case 'd':
                System.out.print("Enter an amount: ");
                ac.Deposit(sc.nextInt());
                break;
            case 'w':
                System.out.print("Enter an amount: ");
                ac.Withdraw(sc.nextInt());
                break;
            case 'i':
                ac.showAccountInfo();
                break;
            case 'q':
                System.out.println("Thank you for banking with us! xD");
                System.exit(0);
                break;
            default:
                prompt();
            }
        }
        
        sc.close();
    }

}
