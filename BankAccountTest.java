public class BankAccountTest{

    public static void main(String[] args){
        BankAccount account1 = new BankAccount(32.0, 33.0);

        // System.out.println(BankAccount.numberOfAccounts);
        System.out.println("Total money:" + account1.totalAmount());
        
        account1.withdraw("savings", 200);
        System.out.println("Total money after checking withdrawl: " + account1.totalAmount());

    }
}