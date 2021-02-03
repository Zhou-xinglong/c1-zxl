import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i,j,k,count=0;
        for(i=0;i<=20;i++)
        {
            for(j=0;j<=50;j++)
            {
                for(k=0;k<=1000;k++)
                {
                    if(5*i+2*j+k==100)
                    {
                        count++;
                        System.out.println("10元可以用"+i+"5角硬币，"+j+"2角硬币，"+k+"个1角硬币组成");
                    }
                }
            }
        }
        System.out.println("共有"+count+"种");
    }
}
