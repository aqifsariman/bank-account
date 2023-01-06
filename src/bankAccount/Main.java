package bankAccount;

public class Main{
  public static void main(String[] args) {
    BankAccount jim = new BankAccount("jim", 100);
    jim.deposit(200);
    System.out.printf("Account name: %s\nAccount Balance: $%.2f\n", jim.getName(), jim.getBalance());
    System.out.println(jim.getTransactions());
  }
}