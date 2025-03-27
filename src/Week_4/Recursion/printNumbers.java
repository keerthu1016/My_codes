package Week_4.Recursion;
import java.util.Scanner;
public class printNumbers
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        printNumbers obj=new printNumbers();
        obj.printn(n);
    }
    void printn(int n)
    {
        if (n==0)
        {
            return;
        }
        else
        {
            System.out.println(n);
            printn(n-1);
        }
    }
}
