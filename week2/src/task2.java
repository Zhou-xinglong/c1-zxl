import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String x = in.nextLine();
        int start=x.indexOf("[");
        int end=x.indexOf(']');
        String newString=x.substring(start+1,end);
        String [] strings=newString.split(",");
        //为string预留空间
        String [] result=new String[strings.length];
        //去掉首尾的冒号
        for (int i=0 ; i<strings.length ; i++){
            //strip   substring(裁剪string 第一个参数是开始裁剪的下标+1  第二个是下标的位置)去首尾空格
            String x1=strings[i].trim();
            int star=1;
            int en=x1.length()-1;
            result[i]=x1.substring(star,en);
        }
        String [] str = new String[result.length];
        for(int i=0;i< str.length;i++)
        {
            str[i]=result[i];
        }
        String maxPrefix = longestCommonPrefix(str);
        System.out.println("”"+maxPrefix+"“");
    }
    public static String longestCommonPrefix(String[] str) {
        if (str == null || str.length == 0) {
            return "";
        }
        String maxPrefix = str[0];
        int firstLen = maxPrefix.length();
        for (int i = 1; i < str.length; i++) {
            for (int j = 0; j < firstLen; j++) {
                maxPrefix = str[0].substring(0, j + 1);
                if (!str[i].startsWith(maxPrefix)) {
                    maxPrefix = maxPrefix.substring(0, j);
                    firstLen = maxPrefix.length();
                    break;
                }
            }
            if (firstLen == 0) {
                return maxPrefix;
            }
        }
        return maxPrefix;
    }
}



