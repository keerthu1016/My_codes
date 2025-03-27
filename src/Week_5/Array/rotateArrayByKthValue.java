package Week_5.Array;
import java.util.Scanner;
public class rotateArrayByKthValue
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=3;int j=0;
        int[] arr=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int mid=n-k;
        int[] b=new int[n];
        for(int i=mid;i<n;i++)
        {
            b[j]=arr[i];
            j++;
        }
        for(int i=0;i<mid;i++)
        {
            b[j]=arr[i];
            j++;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(b[i]+" ");
        }
    }
}
