package Week_4.Recursion;
import java.util.Scanner;
public class sumOfDigits
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
    static int sum(int n)
    {
        if(n==0)
            return 0;
        return  (n%10)+sum(n/10);
    }
}
