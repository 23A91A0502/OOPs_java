public class Main{
    final int x=5;
    int y=10;
    public static void main(String[] args){
        Main m1=new Main();
        System.out.println(m1.x);
        System.out.println(m1.y);
        //after updating
        // m1.x=100;
        // System.out.println(m1.x);
        // m1.y=120;
        // System.out.println(m1.y);
        //after applying final the x value doesn't change as it remains as the final value this helps in the situation like fixed values like pi=3.14
    }
}
