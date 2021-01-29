public class task2 {
    public static void main(String[] args) {
        int num=100,cont=0,a,b,c;
        for(num=100;num<=1000;num++)
        {
            a=num/100;
            b=num%100/10;
            c=num%10;
            if(num == a*a*a + b*b*b + c*c*c ) cont++;
        }
        System.out.println("1000以内的水仙花有"+cont+"个");
    }
}
