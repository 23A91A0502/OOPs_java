public class Main{
    //static method
    static void myStaticMethod(){
        System.out.println("Static methods can be called without creating objects");
    }
    //public method
    public void myPublicMethod(){
        System.out.println("Public methods must be called by creating objects");
    }
    public static void main(String[] args){
        myStaticMethod();
        Main obj1=new Main();
        obj1.myPublicMethod();
    }
}
