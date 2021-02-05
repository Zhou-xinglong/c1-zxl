import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str;
        str=in.nextLine();
        char[] c= new char[str.length()];
        for(int i=0 ;i<str.length();i++)
        {
            c[i]= str.charAt(i);
            if('0'<=c[i]&&c[i]<='9')
            {
                System.out.print(c[i]);
            }
            else
            {
                if('0'<=c[i-1]&&c[i-1]<='9'&&i>=1)
                {
                    System.out.print(",");
                }
            }
        }
    }
}
