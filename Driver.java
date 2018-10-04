public class Driver{
  public static void main(String[]args){
    BankAccount a = new BankAccount(192012832, 291047.24, "7h1s1s4B4dP455w0rd");
    System.out.println(a.toString());
    System.out.println(a.getAccountID());
    System.out.println(a.getBalance());
  }
}
