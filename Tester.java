public class Tester{
  public static void main(String[] args) {
    BankAccount accOne = new BankAccount(1, "myPassword!");
    BankAccount accTwo = new BankAccount(2, "thisBetterOne");
    // System.out.println("Your account ID is " + accOne.getAccountID());
    // accOne.setPassword("myNew1!");
    // accOne.deposit(0);
    // accOne.withdraw(1);
    accOne.deposit(1000);
    System.out.println(accOne.transferTo(accTwo, 100, "myPassword!"));
    // System.out.println(accTwo.getBalance());
    // accOne.withdraw(400);
    // System.out.println(accOne.getBalance());
    // System.out.println(accOne.getAccountID());
    System.out.println(accTwo.toString());
  }
}
