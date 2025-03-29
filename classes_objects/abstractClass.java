abstract class Main{
    public String name="Madhumitha";
    public int age=19;
    public abstract void study();
}
class Student extends Main{
    @Override
    public void study(){
        System.out.println("Studying");
    }
}
public class AbstrCls{
    public static void main(String[] args){
        Student o1=new Student();
        System.out.println("Name: " + o1.name);
        System.out.println("Age: " + o1.age);
        o1.study();
    }
}
