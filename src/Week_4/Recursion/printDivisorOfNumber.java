package Week_4.Recursion;
import java.util.Scanner;
public class printDivisorOfNumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printd(n,1);
    }
    static void printd(int n,int i)
    {
        if(i>n)
        {
            return;
        }
        if(n%i==0)
        {
            System.out.println(i);
        }
            printd(n, i+1);
    }
}
