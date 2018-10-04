public class Driver{
  public static void main(String[]args){
    BankAccount a = new BankAccount(1234567890, 1234.05, "iLikeThisPassword ");
    System.out.println(a.toString());
    System.out.println(a.getAccountID());
    System.out.println(a.getBalance());
    System.out.println(a.getPassword());
    a.setPassword("B3773rP455w0rd");
    System.out.println(a.getPassword());
    System.out.println(a.deposit(66.75));
    System.out.println(a.getBalance());
  }
}
