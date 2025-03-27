package Week_3;
import java.util.Scanner;
import java.lang.Math;
public class countPerfectSquare
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int sum=1;int count=0;
            for(int i=2;i<=n;i++)
            {
                if (n % i == 0)
                {
                    sum = sum + i;
                    if (n / i != i)
                    {
                        sum = sum + (n / i);
                    }
                    count=count+1;
                }
            }
            System.out.println(count);

    }
}
