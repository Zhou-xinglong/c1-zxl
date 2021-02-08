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
abstract class A
{
    int numa=10;
    public abstract void showA();
}
abstract class B extends A
{
    int numb=20;
    public abstract void showB();
}
class C extends B{
    int numc=30;
    public void showA()
    {
        System.out.println("A类中的numa："+numa);
    }
    public void showB()
    {
        System.out.println("B类中的numb："+numb);
    }
    public void showC()
    {
        System.out.println("C类中的numc："+numc);
    }
}
