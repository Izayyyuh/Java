public class BankAccount {
    private double checkingBalance;
    private double savingsBalance;


    public static int numberOfAccounts = 0;

    public static double accountTotal = 0.0;

    public BankAccount (double checkingBalance, double savingsBalance){
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        numberOfAccounts++;
        accountTotal += checkingBalance + savingsBalance;
    }
    

    public double getCheckingAccountBalance() {
        return checkingBalance;
    }

    public double getSavingsAccountBalance() {
        return savingsBalance;
    }

    public void deposit(String accountType, double amount){
        if(accountType.equals("checking")) {
            checkingBalance += amount;
        } else if (accountType.equals("savings")) {
            savingsBalance += amount;
        } else {
            System.out.print("Invalid account type. Please choose checking or savings");
            return;
        }

        accountTotal += amount;
    }
    
    public void withdraw(String accountType, double amount){
        
        if(accountType.equals("checking")) {
            if (amount> checkingBalance) {
            System.out.print("Not enough funds in account to withdraw");
            return;
            }
            checkingBalance -= amount;
        }
        else if (accountType.equals("savings")) {
            if (amount> savingsBalance) {
            System.out.print("Not enough funds in account to withdraw");
            return;
        }
        savingsBalance -= amount;
        }
        else {
            System.out.print("Invalid account type. Please choose checking or savings");
            return;
        }

        accountTotal -= amount;
    }

    public double totalAmount() {
        return checkingBalance + savingsBalance;
    }
}


