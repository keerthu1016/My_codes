package Week_4.Recursion;
import java.util.Scanner;
public class countZeros
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(countzero(n));
    }
    static int countzero(int n)
    {
        if(n%10==n)
        {
            if(n%10==0)
                return 1;
            else
                return 0;
        }
        if(n%10==0)
            return 1+ countzero(n/10);
        else
            return countzero(n/10);
    }
}
