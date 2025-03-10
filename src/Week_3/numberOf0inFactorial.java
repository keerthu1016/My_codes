package Week_3;
import java.util.Scanner;
public class numberOf0inFactorial
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);
        int count=0;
        while(fact>0)
        {
            int ld=fact%10;
            if(ld==0)
            {
                count = count + 1;
            }
            fact=fact/10;
        }
        System.out.println(count);
    }
}
