import java.util.Scanner;
class Product{
    private String name;
    private double price;
    private int stock;
    
    public void  setName(String name){
        this.name = name;
    }
    public void  setPrice(double price){
        if(price >=0) this.price = price;
        else throw new IllegalArgumentException("price Invalid");
    }
    public void setStock(int stock){
        if(stock >=0) this.stock = stock;
        else throw new IllegalArgumentException("Stock invalid");
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int getStock(){
        return stock;
    }
}
class EncapsulationEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         Product p =new Product();
         try{
       System.out.print("Enter the product name :");
       String name = sc.nextLine();
       System.out.print("Enter the price amount :");
       double price = sc.nextDouble();
       System.out.print("Enter the Stock count  :");
       int    stock = sc.nextInt();
        p.setName(name);
        p.setStock(stock);
        p.setPrice(price);
        System.out.println("Product details :");
        System.out.println("Product Name  :" + p.getName());
        System.out.println("Product Price :" + p.getPrice());
        System.out.println("Stock count   :" +  p.getStock());
         }
         catch(Exception e){
             System.out.println("Error: "+e);
         }
        
    }
}