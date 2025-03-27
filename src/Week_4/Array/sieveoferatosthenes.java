package Week_4.Array;
import java.lang.Math;
public class sieveoferatosthenes {
    public static void main(String arg[])
    {
        int n=30;
        boolean[] prime=new boolean[n];
        int limit=(int)Math.sqrt(n);
        for(int i=2;i<limit;i++)
        {
            if(prime[i]==false)
            {
                for(int j=i*i;j<n;j++)
                {
                    prime[j]=true;
                }
            }
        }
        for(int i=2;i<n;i++)
        {
            if(prime[i]==false)
            {
                System.out.println(i);
            }
        }


    }
}
