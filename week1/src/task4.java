import java.util.Scanner;
public class task4 {
    public static void nums(int num[],int a) {
        int i,j;
        for(i=0;i<a;i++)
        {
            for (j=i+1;j<a;j++){
                if (num[i]==0){
                    int x=num[i];
                    num[i]=num[j];
                    num[j]=x;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        System.out.println("输入你要输入的数字个数：");
        a=in.nextInt();
        int[] num = new int [a];
        for(int i=0;i<a;i++)
        {
            num[i]=in.nextInt();
        }
        nums(num,a);
        for(int i=0;i<a;i++)
        {
            System.out.print(num[i]+" " );
        }
    }
}
