package Week_4.Array;
import java.util.Scanner;
public class minAndMax {
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        minAndMax obj=new minAndMax();
        int result=obj.sample(n,arr);
        System.out.println(result);
    }
    static int sample(int n,int[] arr)
    {

        int le=arr[0];int se=arr[0];
        for (int i=0;i<n;i++)
        {
            if(le<arr[i])
            {
                le=arr[i];
            }
            if(se>arr[i])
            {
                se=arr[i];
            }
        }
        return le;
    }
}
