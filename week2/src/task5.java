import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s;
        s=in.nextLine();
        Monkey v1 = new Monkey(s);
        People v2 = new People();
        v1.speak();
        v2.speak();
        v2.think();
    }
}
class Monkey
{
    private String s;
    Monkey(String s)
    {
        this.s=s;
    }
    public void speak()
    {
        System.out.println("咿咿呀呀......");
    }
}
class People
{
    public void speak()
    {
        System.out.println("小样的，不错嘛！会说话了!");
    }
    public void think()
    {
        System.out.println("别说话！认真思考!");
    }
}