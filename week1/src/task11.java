import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a= in.nextInt();
        int b= in.nextInt();
        int oa=a,ob=b;
        while(b!=0)
        {
            int lck=a%b;
            a=b;
            b=lck;
        }
        System.out.println(oa+"和"+ob+"的最大公约数为"+a);
    }
}
