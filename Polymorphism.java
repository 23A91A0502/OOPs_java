class Animal{
    public void animalSnd(){
        System.out.println("Animals Makes Sound");
    }
}
class Dog extends Animal{
    public void dogSnd(){
        System.out.println("Dog says bow bow");
    }
}
class Cat extends Animal{
    public void catSnd(){
        System.out.println("Cat says meow meow");
    }
}
public class Polymor{
    public static void main(String[] args){
        Dog d1=new Dog();
        Cat c1=new Cat();
        d1.dogSnd();
        c1.catSnd(); 

    }
}
