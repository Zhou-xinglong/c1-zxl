import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Game v = new Game();
        v.printf();
        v.guess();
    }
}
class Game
{
    Scanner in = new Scanner(System.in);
    int v = (int)(Math.random()*100+1);
    public void printf()
    {
        System.out.println("欢迎来到数字游戏，请猜一个数：");
    }
    public void guess()
    {
        int num;
        do {
            num=in.nextInt();
            if(num>v)
            {
                System.out.println("猜大了噢，再试一下吧！");
            }
            if(num<v)
            {
                System.out.println("猜的有点小，再试一下吧！");
            }
        }while(num!=v);
        System.out.println("恭喜你，猜对了！");
    }
}
