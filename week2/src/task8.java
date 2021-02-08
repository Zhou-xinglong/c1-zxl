import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        C c = new C();
        c.showA();
        c.showB();
        c.showC();
    }
}
class A
{
    private int numa=10;
    public void showA()
    {
        System.out.println("A类中的numa："+numa);
    }
}
class B extends A
{
    private int numb=20;
    public void showB()
    {
        System.out.println("B类中的numb："+numb);
    }
}
class C extends B
{
    private int numc=30;
    public void showC()
    {
        System.out.println("C类中的numc："+numc);
    }
}
