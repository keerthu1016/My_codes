package Week_4.Array;
import java.util.Scanner;
public class smallestElement {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int smallElement=arr[0];
        for(int i=0;i<n;i++)
        {
            if(smallElement>arr[i])
            {
                smallElement=arr[i];
            }
        }
        System.out.println(smallElement);
    }
}
