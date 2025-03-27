package Week_4.Array;
import java.util.Scanner;
public class searchForNumber
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int[] arr= new int[n];
        int flag=-1;
        int index=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]==x)
            {
                index=i;
            }
        }
        System.out.println(index);
    }
}
