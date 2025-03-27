package Week_5.Array;

import java.util.Scanner;
public class secaondLargestelement
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for (int j = 0;j <n-1; j++)
            {
                if (arr[j]>arr[j+1])
                {
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        int[] max=new int[arr.length];
        for(int i=0;i<n;i++)
        {
            max[i]=arr[i];
        }
        System.out.println("second largest" +max[n-2]);
    }
}
