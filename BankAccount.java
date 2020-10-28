public class BankAccount {
  private double balance;
  private int accountID;
  private String password;

  public BankAccount(int accountID, String password) {
    accountID = accountID;
    password = password;
    balance = 0;
  }

  public String toString() {
    return accountID + "\t" + balance;
  }

  public boolean deposit(double amount) {
    if (amount > 0) {
      balance += amount;
      println("Deposit success!");
      return true;
    } else {
      println("Depsoit failed.");
      return false;
    }
  }

  public boolean withdraw(double amount) {
    if ((amount > balance) || (amount < 0)) {
      println("Withdrawal failure.");
      return false;
    } else {
      balance -= amount;
      println("Withdrawal succes!");
      return true;
    }
  }

  public void setPassword (String newPass) {
    println("New password set!");
    password = newPass;
  }

  public double getBalance() {
    return balance;
  }

  public int getAccountID() {
    return accountID;
  }
}
