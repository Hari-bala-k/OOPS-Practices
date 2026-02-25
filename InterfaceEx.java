interface A {
    void msg();
}
interface B {
    void msg();
}
class C implements A,B {
    @Override
    public void msg(){
        System.out.println("from c");
    }
}
public class InterfaceEx {
    public static void main(String[] args) {
       A a = new C();
       B b = new C();
       a.msg();
       b.msg(); 
    }
}
