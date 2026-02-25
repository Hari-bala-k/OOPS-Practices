import java.util.Scanner;

class BankAccount1{
    private int accNumber;
    private double balance;

    BankAccount1(int acccNumber,double balance){
     if(acccNumber > 0 ) this.accNumber = acccNumber;
     else throw new IllegalArgumentException("Invalid accnumber");
     if(balance >= 0 ) this.balance = balance;
     else throw new IllegalArgumentException("Invalid balance");
    }

    public int getAccnumber(){
        return accNumber;
    }
    public void deposite(double amount){
         if(amount > 0) balance += amount;
         else throw new IllegalArgumentException("Invalid amount"); 
    }

    public void withdraw(double withdraAmount){
       if(balance > withdraAmount && withdraAmount > 0){
        balance -= withdraAmount;
       }
       else throw new IllegalArgumentException("Invalid withdraw amount ");
    }
    public void transfer(BankAccount1 receiver,double amount){
            if(receiver == null){
        throw new IllegalArgumentException("Receiver account is null");
    }
      if(amount > 0 && amount <= this.balance){
        System.out.println("money transfered successfully to "+ receiver.accNumber);
        this.balance -= amount;
        receiver.balance += amount;
      }
      else throw new IllegalArgumentException("accNumber invlid");

    }

    public double balanceAmount() {
        return balance;
    }
}
class EncapsulationUser{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your account number ");
        int accNumber = sc.nextInt();
        System.out.print("enter balance amount ");
        double balance = sc.nextDouble();
        try{
        BankAccount1 b = new BankAccount1(accNumber, balance);
        BankAccount1 b2 = new BankAccount1(12345, 1000);
        b.deposite(500);
        b.withdraw(100);
        b.transfer(b2, 500);
       System.out.println(b.balanceAmount());
        }
        catch(Exception e){
            System.out.println("Error:" +e);
        }

    }
}