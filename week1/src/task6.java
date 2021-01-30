import java.util.Scanner;
public class task6 {
    String name;
    double money;
    void Kh()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入你的账户名字：");
        name=in.nextLine();
        System.out.print("请输入你要存的钱：");
        money=in.nextDouble();
    }
    void showMoney()
    {
        System.out.println("你的余额为："+money);
    }
    public static void main(String[] args) {
        task6 v = new task6();
        v.Kh();
        v.showMoney();
    }
}
