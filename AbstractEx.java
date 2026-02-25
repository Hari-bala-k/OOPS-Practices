abstract class Shape {
    abstract double area();
}

class Circle extends Shape{
   double r;
   public Circle(double r){
       this.r =r;
   }
    public double area(){
    return  3.14 * (r *r);
    }
}
class Square extends Shape{
    double a;
    public Square(double a){
    this.a = a;
    }
    public double area(){
        return (a*a);
    }
}
class Rectangle extends Shape{
    double l;
    double h;
    public Rectangle(double l,double h){
        this.l = l;
        this.h = h;
    }
    public double area(){
        return (l*h);
    }
}
public class AbstractEx {
    public static void main(String[] args) {
        Shape c = new Circle(10);
        Shape s = new Square(5);
        Shape r = new Rectangle(10,5);
    System.out.print("Circle area: " + c.area());
    System.out.println("Square area: " +s.area());
    System.out.println("Rectangle area: "+ r.area());
    
// using array to calculate total
    double total=0;
    Shape[] shape ={new Circle(20),new Square(10),new Rectangle(10, 20)};
    for(int i=0;i<shape.length;i++){
       total+= shape[i].area();
    }
    System.out.println("Total area:"+total);
    }
}
