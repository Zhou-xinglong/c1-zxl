import java.util.Scanner;
public class task3 {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        String s;
        System.out.println("请输入字符串：");
        s=in.nextLine();
        for(int i=s.length()-1;i>=0;i--)
        {
            System.out.print(s.charAt(i));
        }
    }
}

