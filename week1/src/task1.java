import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        int a;
        double b,c;
        Scanner in = new Scanner(System.in);
        System.out.println("输入体重(kg)：");
        a = in.nextInt();
        System.out.print("输入身高(m): ");
        b = in.nextDouble();
        c = a / (b * b);

        if(c<18.5) System.out.println("过轻");
        if(c>=18.5 && c<25) System.out.println("正常");
        if(c>=25 && c<28) System.out.println("过重");
        if(c>=28 && c<32) System.out.println("肥胖");
        if(c>=32) System.out.println("过于肥胖");
    }
}