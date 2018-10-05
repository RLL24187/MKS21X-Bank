public class Driver{
  public static void main(String[]args){
  //6. A main method (included in the same file) to test your code.

    BankAccount a = new BankAccount(1234.05, 1234567890, "iLikeThisPassword ");
    //Testing the constructor and accessor methods
    System.out.println(a.toString());
    System.out.println(a.getAccountID());
    System.out.println(a.getBalance());
    //Testing setPassword()
    System.out.println(a.getPassword());
    a.setPassword("B3773rP455w0rd");
    System.out.println(a.getPassword());
    //Testing deposit()
    System.out.println(a.deposit(66.75));
    System.out.println(a.getBalance());
    System.out.println(a.deposit(-2.80));
    System.out.println(a.getBalance());
    if( a.deposit(1000) ){
        System.out.println("Deposit success!");
    }else{
        System.out.println("Deposit failure!");
    }
    System.out.println(a.getBalance());
    if (a.deposit(-9.67)){
        System.out.println("Deposit success!");
    }else{
        System.out.println("Deposit failure!");
    }
    System.out.println(a.getBalance());
    //Testing withdraw()
    System.out.println(a.withdraw(167.22));
    System.out.println(a.getBalance());
    System.out.println(a.withdraw(-89.54));
    System.out.println(a.getBalance());
    if(a.withdraw(1000)){
        System.out.println("Withdrawal success!");
    }else{
        System.out.println("Withdrawal failure!");
    }
    System.out.println(a.getBalance());
    if(a.withdraw(99999)) {
        System.out.println("Withdrawal success!");
    }else{
        System.out.println("Withdrawal failure!");
    }
    System.out.println(a.getBalance());
  }
}
