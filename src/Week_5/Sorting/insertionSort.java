package Week_5.Sorting;

import java.util.Scanner;
public class insertionSort
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int key=arr[i];
            int j=i-1;
            while(j>=0 && key<arr[j])
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
