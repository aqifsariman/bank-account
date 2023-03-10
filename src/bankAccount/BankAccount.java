package bankAccount;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class BankAccount {
  private String name;
  private String accountNum;
  protected float balance;
  private String transactions;
  private boolean closed;
  private String creationDate;
  private String closingDate;

  public BankAccount(String name) {
    this.name = name;
    this.balance = 0;
  }

  public BankAccount(String name, float balance) {
    this.name = name;
    this.balance = balance;
  }

  public String getName() {
    return name.substring(0, 1).toUpperCase() + name.substring(1);
  }

  public void setName(String name) {
    System.out.println("Not allowed to change name once set.");
  }

  public String getAccountNum() {
    Random rand = new Random();
    int randomAccountNum = rand.nextInt(999999999);
    this.accountNum = String.format("%6d", randomAccountNum);
    return accountNum;
  }

  public void setAccountNum(String accountNum) {
    System.out.println("Not allowed to change account number once set.");
  }

  public float getBalance() {
    return balance;
  }

  public void setBalance(float balance) {
    System.out.println();
    this.balance = balance;
  }

  public String getTransactions() {
    return transactions;
  }

  public void setTransactions(String transactions) {
    this.transactions = transactions;
  }

  public boolean isClosed() {
    return closed;
  }

  public void setClosed(boolean closed) {
    this.closed = closed;
  }

  public String getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(String creationDate) {
    this.creationDate = creationDate;
  }

  public String getClosingDate() {
    return closingDate;
  }

  public void setClosingDate(String closingDate) {
    this.closingDate = closingDate;
  }

  public void deposit(float amount) {
    try {
      DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
      LocalDateTime now = LocalDateTime.now();
      setBalance(amount + getBalance());
      setTransactions(String.format("%s Depositted $%.2f at %s", this.getName(), amount, dtf.format(now)));
    } catch (IllegalArgumentException e) {
      System.err.println(e);
    }
  }

  public void withdraw(float amount) {
    try {
      DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
      LocalDateTime now = LocalDateTime.now();
      setBalance(getBalance() - amount);
      setTransactions(String.format("%s Withdrawn $%.2f at %s", this.getName(), amount, dtf.format(now)));
    } catch (IllegalArgumentException e) {
      System.err.println(e);
    }
  }

}
