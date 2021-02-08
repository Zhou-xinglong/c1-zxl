import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Duck s =new Duck();
        s.showMsg();
        s.setIllness();
        s.showSymptom();
    }
}
abstract class Poultry
{
    String name,symptom,illness;
    int age;
    Poultry()
    {
        this("家禽","发烧","感冒",2);
    }
    Poultry(String name,String sympthom, String illness,int age)
    {
        this.name=name;
        this.symptom=sympthom;
        this.illness=illness;
        this.age=age;
    }
    public void showMsg()
   {
        System.out.println("动物种类:"+name+",年龄："+age+"岁");
    }
    public void setIllness()
    {
        System.out.println("入院原因:"+illness);
    }
    public abstract void showSymptom();
}
class Duck extends Poultry{
    Duck()
    {
        this("鸭子","发烧","感冒",2);
    }
    Duck(String name,String sympthom, String illness,int age)
    {
        this.name=name;
        this.symptom=sympthom;
        this.illness=illness;
        this.age=age;
    }
    public void showSymptom()
    {
        System.out.println("症状为:"+symptom);
    }
}


