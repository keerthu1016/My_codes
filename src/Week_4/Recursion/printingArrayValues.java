package Week_4.Recursion;
import java.util.Scanner;
public class printingArrayValues
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        //int n=sc.nextInt();
        int[] arr={10,20,30,40,50};
        printa(arr,5,0);
    }
    static void printa(int arr[],int n ,int i)
    {
        if(i>=n)
            return;
        else
        {
            System.out.println(arr[i]);
            i=i+1;
            printa(arr,n,i);
        }
    }
}
