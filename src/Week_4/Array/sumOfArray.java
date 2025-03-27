package Week_4.Array;
import java.util.Scanner;
public class sumOfArray
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int[] arr=new int[n];
       int sum=0;
       for(int i=0;i<n;i++)
       {
            arr[i]=sc.nextInt();
       }
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }

}
