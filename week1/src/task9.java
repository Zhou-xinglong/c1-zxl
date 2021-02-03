import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count=0;
        for(int i=2;;i++)
        {
            int flog=1;
            for(int j=2;j<i;j++)
            {
                if( i%j==0)
                {
                    flog=0;
                    break;
                }
            }
            if(flog==1)
            {
                System.out.print(i+" ");
                count++;
            }
            if(count==50)
            {
                break;
            }
        }
    }
}
