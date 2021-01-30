import java.util.Scanner;
public class task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a1,b1,a2,b2;
        System.out.print("输入第一个复数的实部和虚部：");
        a1=in.nextInt();
        b1=in.nextInt();
        System.out.print("输入第二个复数的实部和虚部：");
        a2= in.nextInt();
        b2=in.nextInt();
        fs s = new fs();
        s.add(a1,a2,b1,b2);
        s.reduce(a1,a2,b1,b2);
        s.multiply(a1,a2,b1,b2);
    }
}
class fs
{
    int a1,a2,b1,b2;
    void add(int a1,int a2,int b1,int b2)
    {
        int a3=a1+a2;
        int b3=b1+b2;
        System.out.println("两复数相加的结果为："+a3+"+"+b3+"i");
    }
    void reduce(int a1,int a2,int b1,int b2)
    {
        int a3=a1-a2;
        int b3=b1-b2;
        System.out.println("两复数相减的结果为："+a3+"+"+b3+"i");
    }
    void multiply(int a1,int a2,int b1,int b2)
    {
        int a3=a1*a2-b1*b2;
        int b3=a1*b2+a2*b1;
        System.out.println("两复数相乘的结果为："+a3+"+"+b3+"i");
    }
}
