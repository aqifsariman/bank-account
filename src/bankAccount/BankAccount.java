package bankAccount;

import java.time.LocalDateTime;

public class BankAccount {
  private String name;
  private String accountNum;
  private float balance;
  private String transactions;
  private boolean closed;
  private String creationDate;
  private String closingDate;

  public BankAccount(String name){
    this.name = name;
    this.balance = 0;
  }

  public BankAccount(String name, float balance){
    this.name = name;
    this.balance = balance;
  }
  

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getAccountNum() {
    return accountNum;
  }
  public void setAccountNum(String accountNum) {
    this.accountNum = accountNum;
  }
  public float getBalance() {
    return balance;
  }
  public void setBalance(float balance) {
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
  
  public void deposit(float amount){
    try{
      DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");  
      LocalDateTime now = LocalDateTime.now();
      setBalance(amount);
      setTransactions("Depositted $%f at ");
    } catch (IllegalArgumentException e){
      System.err.println(e);
    }
  }

  
}
