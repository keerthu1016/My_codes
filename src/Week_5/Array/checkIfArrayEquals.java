package Week_5.Array;

import java.util.Scanner;
import java.util.Arrays;
public class checkIfArrayEquals
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[m];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++)
        {
           b[i]=sc.nextInt();
        }
        System.out.println(checkequal(a,b));
    }
    static boolean checkequal(int[] a,int[] b)
    {
        if(a.length!=b.length)
        {
            return false;
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]!=b[i])
            {
                return false;
            }
        }
        return true;
    }
}
