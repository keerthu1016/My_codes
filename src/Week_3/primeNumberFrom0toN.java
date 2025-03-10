package Week_3;
import java.util.Scanner;
public class primeNumberFrom0toN
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int x=2;x<=n;x++)
        {
            int flag=0;
            for(int i=2;i<x;i++)
            {
                if(x%i==0)
                {
                    flag=1;
                }
            }
            if(flag==0)
            {
                System.out.println(x);
            }
        }
    }
}
