class Stu{
    String name;
    int age;
    String college;
    //constructor
    public Stu(String name,int age,String college){
        this.name=name;
        this.age=age;
        this.college=college;
    }
    //method
    void getDetails(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("College: " + college);
    }
}
public class Constr{
    public static void main(String[] args){
        Stu s1=new Stu("Madhu",19,"AEC");
        s1.getDetails();
    }
}
