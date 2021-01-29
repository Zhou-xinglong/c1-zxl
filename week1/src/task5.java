import java.util.Scanner;
public class task5 {
    int radius;
    double area;
    double perimeter;
    void insetRadius()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("圆的半径: ");
        radius = in.nextInt();
    }
    void getArea()
    {
        area = 3.14*radius*radius;
        System.out.println("the area is "+area);
    }
    void getPerimeter()
    {
        perimeter = 2 * 3.14 * radius;
        System.out.println("the perimeter is "+perimeter);
    }
    public static void main(String[] args) {
        task5 s = new task5();
        s.insetRadius();
        s.getArea();
        s.getPerimeter();
    }
}
