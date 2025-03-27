package Week_5.Array;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;
public class moveNegativeElements
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer>pos=new ArrayList<>();
        ArrayList<Integer>neg=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(arr[i]>=0)
            {
                pos.add(arr[i]);
            }
            else
            {
                neg.add(arr[i]);
            }
        }
        int size1=pos.size();
        int size2=neg.size();
        int j=0;
        for(int i=0;i<size1;i++)
        {
            arr[j]=pos.get(i);
            j++;
        }
        for(int i=0;i<size2;i++)
        {
            arr[j]=neg.get(i);
            j++;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
