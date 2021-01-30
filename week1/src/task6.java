import java.util.Scanner;
public class task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("请选择你要进行的操作(1是开户，其他是查询余额）：");
        n=in.nextInt();
        Bank s = new Bank(n);
        if(n==1)
        {
            s.ku();
        }
        else
        {
            s.Cx();
        }
    }
}
class Bank
{
    String name;
    double ye ;
    Scanner in =new Scanner(System.in);
    double ku()
    {
        System.out.print("请输入你的账户名称:");
        name = in.nextLine();
        double money;
        System.out.print("请输入你要存入钱：");
        money = in.nextDouble();
        return money;
    }
    Bank(double ye)
    {
        this.ye=ye;
    }
    void Cx()
    {
        System.out.print("请输入你的名字：");
        name=in.nextLine();

        System.out.println("你的余额为："+ye);
    }
}
