class Employee {
    protected String name;
    protected int id;
    protected double salary;
    public Employee(String name ,int id,double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
}
class Manager extends Employee {
    public Manager(String name ,int id,double salary){
        super(name ,id,salary);
    }
   public void bonus(){

   }
}
class Developer extends Employee {
    public Developer(String name ,int id,double salary){
        super(name,id, salary);
    }
     public void overTime(){
        
    }
}
public class InheritanceEx {
    public static void main(String[] args){
      Employee M =new Manager("hari",102,300000);
      Employee D =new Developer("raju",101,200000);
      
    } 
}
