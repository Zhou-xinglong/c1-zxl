import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Poultry s =new Poultry();
        s.showMsg();
        s.setIllness();
        s.showSymptom();
    }
}
class Poultry
{
    String name,symptom,illness;
    int age;
    Poultry()
    {
        this("鸭子","发烧","感冒",2);
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
    public void showSymptom()
    {
        System.out.println("症状为:"+symptom);
    }
}


