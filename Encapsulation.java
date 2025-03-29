class Person{
    private String name;
    //getter
    public String getName(){
        return name;
    }
    //setter
    public void setName(String name){
        this.name=name;
    }
}
public class Encapsu{
    public static void main(String[] args){
         Person p1=new Person();
         p1.setName("Madhuu");
         System.out.println("Name is: " + p1.getName());
    }
}
