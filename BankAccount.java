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
      System.out.println("Deposit success!");
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
      System.out.println("Withdrawal succes!");
      return true;
    }
  }

  public void setPassword (String newPass) {
    System.out.println("New password set!");
    password = newPass;
  }

  public double getBalance() {
    return balance;
  }

  public int getAccountID() {
    return accountID;
  }
}
