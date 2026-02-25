class Bank {
    void rate(){
        System.out.println("rate in banking");
    }
}
class SBI extends Bank {
    void rate(){
        System.out.println("rate in SBI");
    }
}
class ICICI extends Bank {
    void rate(){
        System.out.println("rate in ICICI");
    }
}
public class PolymorphismUser {
    public static void main(String[] args){
        Bank b= new Bank();
        Bank s =new SBI();
        Bank i =new ICICI();
        Bank[] b1 ={b,s,i};
        for( Bank a :b1){
         a.rate();
        }
    }
}
