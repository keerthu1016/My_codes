// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
import java.lang.Math;
class exam1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;int square=0;
        for(int i=1;i<=n;i++)
        {
               square=(int)Math.pow(i,3);
               sum=square+sum;
        }
        System.out.println(sum);
    }
}