class Vehicle{
    String Brand="Waganor";
}
class Car extends Vehicle{
    int prodd_year=1950;
}
public class Inheri{
    public static void main(String[] args){
         Car c1=new Car();
         System.out.println("Name: " +  c1.Brand + "," + "Produced Year: " + c1.prodd_year);
    }
}
