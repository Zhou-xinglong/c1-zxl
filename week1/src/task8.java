import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nu = (int)(Math.random()*100+1);
        int count=0;
        int a;
        do {
                a = in.nextInt();
                count++;
                if(a<nu)
                {
                    System.out.println("偏小");
                }
                if(a>nu)
                {
                    System.out.println("偏大");
                }
            }while(a!=nu);
        System.out.println("恭喜你，猜對了，你猜了"+count+"次");
    }
}
