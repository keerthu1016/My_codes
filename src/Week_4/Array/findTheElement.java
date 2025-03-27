package Week_4.Array;
import java.util.Scanner;
public class findTheElement {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int key=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(key==i)
            {
                System.out.println(arr[i]);
            }
        }
    }
}
