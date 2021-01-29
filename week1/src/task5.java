import java.util.Scanner;
public class task5 {
    public static double getArea(int r) {
        return 3.14*r*r;
    }
    public static double getPerimeter(int r) {
        return 2*3.14*r;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int r;
        System.out.print("输入圆的半径radius：");
        r=in.nextInt();
        double area,perimeter;
        System.out.println("the area is "+getArea(r));
        System.out.println("the perimeter is "+getPerimeter(r));
    }
}
