package Week_4.Array;
import java.util.Scanner;
public class largestElement {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int largeElement=arr[0];
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(largeElement<arr[i])
            {
                largeElement=arr[i];
            }
        }
        System.out.println(largeElement);
    }
}
