package Week_3;
import java.util.Scanner;
public class numberOfDivisor
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if (n % i == 0)
            {
                System.out.print(i);
                if(i%3==0)
                {
                    count=count+1;
                }
            }
        }
        System.out.println(" ");
        System.out.println(count);
    }

}
