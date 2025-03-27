package Week_5.Array;

import java.util.Scanner;
public class findKthValue
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int x=-1;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                x=i;
                break;
            }
        }
        if(x!=-1)
        {
            System.out.println(x+1);
        }
        else
        {
            System.out.println("the array is not rotated");
        }
    }
}
