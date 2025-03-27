package Week_4.Recursion;
import java.util.Scanner;
public class countDigit
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(countd(n));
    }
    static int countd(int n)
    {
        if(n==0)
            return 0;
        return 1+countd(n/10);
    }
}
