package Week_3;
import java.util.*;
public class palindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int sum=0;
        int x=n;
        while(n>0)
        {
            int ld = n % 10;
            sum = sum * 10 + ld;
            n = n / 10;
        }
        System.out.println(n);
        System.out.println(x);
        if (x==sum)
        {
            System.out.println("pallindrome");
        }
        else
        {
            System.out.println("not pallindrome");
        }
    }
}
