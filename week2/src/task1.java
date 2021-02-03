import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("输入n：");
        int n;
        n = in.nextInt();
        int [][] matrix = new int[n][n];
        System.out.println("matrix=");
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix.length;j++)
            {
                matrix[i][j]=in.nextInt();
            }
        }
        int [][] m = new int[matrix.length][matrix.length];
        for(int i= 0;i< matrix.length;i++)
        {
            for(int j=0;j< matrix.length;j++)
            {
                m[i][j]=matrix[i][j];
            }
        }
        for(int i= 0;i< matrix.length;i++)
        {
            for(int j=0;j< matrix.length;j++)
            {
                matrix[i][j]=m[matrix.length-1-j][i];
            }
        }
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix.length;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
