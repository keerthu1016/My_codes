package Week_3;
import java.util.Scanner;
import java.lang.Math;
public class squareDifference
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long sum=0;long sumOfSquare=0;
        long d=0;
        for(int i=1;i<=n;i++)
        {
            sumOfSquare=(long) Math.pow(i,2);
            sum=sum+sumOfSquare;
        }
       // System.out.println(sum);
        long sum1=0; long squareOfsum=0;
        for(int i=1;i<=n;i++)
        {
            sum1=sum1+i;
            squareOfsum=(long)Math.pow(sum1,2);
        }
       // System.out.println(squareOfsum);
        d=squareOfsum-sumOfSquare;
        System.out.println(d);
    }
}
