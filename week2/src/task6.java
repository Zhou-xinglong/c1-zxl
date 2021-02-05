import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        System.out.print("输入小车人数：");
        a=in.nextInt();
        Car s1 = new Car(a);
        Vehicle v1 = new Vehicle(4,1150);
        v1.show();
        s1.show();
        System.out.println("____________________________");
        int b;
        double c;
        System.out.print("输入卡车人数：");
        b=in.nextInt();
        System.out.print("输入卡车装载：");
        c=in.nextDouble();
        Vehicle v2 = new Vehicle(6,15000.0);
        Truck s2 = new Truck(b,c);
        v2.show();
        s2.show();
    }
}
class Vehicle
{
    int wheels;
    double weight;
    Vehicle(int a,double b)
    {
        wheels=a;
        weight=b;
    }
    public void show()
    {
        System.out.println("车轮的个数是："+wheels+"  车重："+weight);
    }
}
class Car
{
    int loader;
    Car(int a)
    {
        loader=a;
    }
    public void show()
    {
        System.out.print("这是一辆小车,能载5人,实载"+loader+"人");
        if(loader>5)
        {
            System.out.println(",你超员了！！！");
        }
        else
        {
            System.out.println();
        }
    }
}
class Truck
{
    int loader;
    double payload;
    Truck(int a,double b)
    {
        loader=a;
        payload=b;
    }
    public void show()
    {
        System.out.print("这是一辆卡车,能载3人,实载"+loader+"人");
        if(loader>3)
        {
            System.out.println(",你超员了！！！");
        }
        else
        {
            System.out.println();
        }
        System.out.print("这是一辆卡车,核载5000kg,你已装载"+payload+"kg");
        if(payload>5000)
        {
            System.out.println("你超载了！！！");
        }
    }
}
