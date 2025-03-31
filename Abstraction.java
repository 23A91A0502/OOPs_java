abstract class Animal{
    //abstract method
   public abstract void animalSnd();
   //regular method
   public void sleep(){
    System.out.println("Zzzz");
   }
}
class Cat extends Animal{
    @Override
    public void animalSnd(){
        System.out.println("Cat Says : Meow meow");
    }
}
public class Abstrn{
    public static void main(String[] args){
         Cat c1=new Cat();
         c1.animalSnd();
         c1.sleep();

    }
}
