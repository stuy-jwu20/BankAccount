public class BankAccount {
  private double balance;
  private int accountIDs;
  private String passwords;

  public BankAccount(int accountID, String password) {
    accountIDs = accountID;
    passwords = password;
    balance = 0;
  }

  public String toString() {
    return accountIDs + "\t" + balance;
  }

  public boolean deposit(double amount) {
    if (amount > 0) {
      balance += amount;
      System.out.println("Deposit success! You deposited " + amount);
      return true;
    } else {
      System.out.println("Depsoit failed.");
      return false;
    }
  }

  public boolean withdraw(double amount) {
    if ((amount > balance) || (amount < 0)) {
      System.out.println("Withdrawal failure.");
      return false;
    } else {
      balance -= amount;
      System.out.println("Withdrawal success! You withdrew " + amount);
      return true;
    }
  }

  public void setPassword (String newPass) {
    System.out.println("New password set!");
    passwords = newPass;
  }

  public double getBalance() {
    return balance;
  }

  public int getAccountID() {
    return accountIDs;
  }
}
