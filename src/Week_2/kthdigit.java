package Week_2;
import java.lang.Math;
public class kthdigit {
    public static void main(String[] args)
    {
        int a=3;int b=3; int k=1;
        long power=(long)Math.pow(a,b);
        long i=1;

        while(power>0)
        {
            long ans=power%10;
            if(k==i)
            {
                System.out.println(ans);
                break;
            }
            i++;
            power=power/10;
        }
    }
}
