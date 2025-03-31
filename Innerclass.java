class Outercls{
    int x=3;
    class Innercls{
        int y=10;
    }
}
public class Main{
    public static void main(String[] args){
         Outercls o=new Outercls();
         Outercls.Innercls i=o.new Innercls();
         System.out.println(o.x + i.y);

    }
}
