package Week_4.Array;
import java.util.Scanner;
public class minAndMaxPoduct {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int fn=sc.nextInt();
        int sn=sc.nextInt();
        int[] farr=new int[fn];
        int[] sarr=new int[sn];

        for(int i=0;i<fn;i++)
        {
            farr[i] =sc.nextInt();
        }
        for( int i=0;i<sn;i++)
        {
            sarr[i]=sc.nextInt();
        }
        int max=farr[0];
        int min=sarr[0];
        for(int i=0;i<fn;i++)
        {
            if(max<farr[i])
            {
                max=farr[i];
            }
        }
        for(int i=0;i<sn;i++)
        {
            if(min>sarr[i])
            {
                min=sarr[i];
            }
        }
        int result=max*min;
        System.out.println(result);
    }
}
