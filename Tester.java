public class Tester{
  public static void main(String[] args) {
    BankAccount accOne = new BankAccount(21893837, "myPassword!");
    System.out.println(accOne.getAccountID);
    accOne.deposit(1100);
    accOne.withdraw(400);
    System.out.println(accOne.toString());
  }
}
