import java.util.Scanner;
public class task5 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner((System.in));
        int r;
        r = in.nextInt();
        Circle cr = new Circle (r);
        cr.getArea(r);
        cr.getPerimeter(r);
    }
}
class Circle
{
    int radius;
    public Circle(int radius)
    {
        this.radius=radius;
    }
    void getArea(int radius)
    {
        double s;
        s=3.14*radius*radius;
        System.out.println("the area is "+s);
    }
    void getPerimeter(int radius)
    {
        double c;
        c=2*3.14*radius;
        System.out.println("the perimeter is "+c);
    }
}
