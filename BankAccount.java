public class BankAccount {
  private double balance;
  private int accountID;
  private String password;

  private boolean authenticate(String password) {
    return (this.password.equals(password));
  }

  public BankAccount(int accountID, String password) {
    this.accountID = accountID;
    this.password = password;
    balance = 0;
  }

  public boolean transferTo(BankAccount other, double amount, String password) {
    if(authenticate(password) && withdraw(amount)) {
      if(other.deposit(amount)) {
        System.out.println("Transfer was successful!");
        return true;
      } else {
        System.out.println("Major error! If you see this error message, call customer support! We could not deposit.");
      }
    }
    return false;
}

  public String toString() {
    return "#" + this.accountID + "\t" + "$" + balance;
  }


  public boolean deposit(double amount) {
    if (amount >= 0) {
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
    this.password = newPass;
  }

  public double getBalance() {
    return balance;
  }

  public int getAccountID() {
    return accountID;
  }
}
