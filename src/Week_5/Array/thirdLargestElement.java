package Week_5.Array;
import java.util.Scanner;
import java.util.Arrays;
public class thirdLargestElement
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println("Third largest number is  "+ a[n-3]);
    }
}
