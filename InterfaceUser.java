interface Drawable {
  void draw();
  default void info(){
    System.out.println("this is from interface");
  }
}
class Line implements Drawable{
    @Override
   public void draw(){
    System.out.println("draw Line");
   }
}
class Circle implements Drawable{
    @Override
   public void draw(){
    System.out.println("draw circle");
   }
}
public class InterfaceUser {
    public static void main(String[] args) {
        Drawable l = new Line();
        Drawable c = new Circle();
        l.draw();
        c.draw();
        l.info();
        c.info();
    }
}
