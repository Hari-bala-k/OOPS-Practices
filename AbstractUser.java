abstract class Payment {
    abstract void pay();
}
class Gpay extends Payment {
    void pay(){
        System.out.println("Paid through Gpay");
    }
}
class PhonePay extends Payment {
    void pay(){
        System.out.println("Paid through Phonepay");
    }
}
public class AbstractUser {
    public static void main(String[] args) {
        Payment g = new Gpay();
        Payment p = new PhonePay();
        g.pay();
        p.pay();    
    }
}
