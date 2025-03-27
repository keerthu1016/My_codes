package Week_4.Recursion;
import java.util.Scanner;
public class reversePrintNmbers
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        reversePrintNmbers obj=new reversePrintNmbers();
        obj.reversen(n);
    }
    void reversen(int n)
    {
        if(n==0)
        {
            return;
        }
        else
        {
            reversen(n-1);
            System.out.println(n);
        }
    }
}
