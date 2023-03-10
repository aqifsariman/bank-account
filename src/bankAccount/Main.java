package bankAccount;

public class Main {
  public static void main(String[] args) {
    BankAccount jim = new BankAccount("jim", 100);

    System.out.printf("\n>>>>> Bank Account <<<<<\nAccount name: %s\nAccount Number: %s\nAccount Balance: $%.2f\n",
        jim.getName(), jim.getAccountNum(),
        jim.getBalance());
    jim.deposit(200);
    System.out.println(jim.getTransactions());
    jim.withdraw(100);
    System.out.println(jim.getTransactions());

    FixedDepositAcount bob = new FixedDepositAcount("bob", 100);
    bob.withdraw(100);
    System.out.printf("\n>>>>> Fixed Deposit Account <<<<<\nAccount name: %s\nAccount Balance: $%.2f\n", bob.getName(),
        bob.getBalance());
  }
}