package bankAccount;

public class Main{
  public static void main(String[] args) {
    BankAccount jim = new BankAccount("jim", 100);
    jim.deposit(200);
    System.out.printf("Account name: %s\nAccount Balance: $%f", jim.getName(), jim.getBalance());
  }
}