package Week_4.Array;
import java.util.Scanner;
public class countOddandEven
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int cEven=0;int cOdd=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                cEven=cEven+1;
            }
            else
            {
                cOdd=cOdd+1;
            }
        }
        System.out.println("even count "+cEven);
        System.out.println("odd count "+cOdd);
    }
}
