package Week_3;
import java.util.Scanner;
import java.lang.Math;
public class perfectSquare
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=1;

        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                sum = sum + i;
                if (n / i != i)
                {
                    sum = sum + (n / i);
                }
            }
        }
        System.out.println(sum);
        if(sum==n)
        {
            System.out.println("perfect number");
        }
    }

}
