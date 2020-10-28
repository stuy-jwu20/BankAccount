public class Tester{
  public static void main(String[] args) {
    BankAccount accOne = new BankAccount(82, "myPassword!");
    System.out.println("Your account ID is " + accOne.getAccountID());
    accOne.setPassword("myNew1!");
    accOne.deposit(0);
    accOne.withdraw(1);
    accOne.deposit(1000.2);
    accOne.withdraw(400.1);
    System.out.println(accOne.getBalance());
    System.out.println(accOne.getAccountID());
    System.out.println(accOne.toString());
  }
}
