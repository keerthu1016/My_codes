// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class helloWorld
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a<b)
        {
            gcd(a,b);
        }
        else
        {
            gcd(b,a);
        }
        helloWorld obj=new helloWorld();
        int result=obj.gcd(a,b);
        System.out.println(result);
    }
    public static int gcd(int a,int b)
    {
        int getv=1;
        for(int i=1;i<=a;i++)
        {
            if(a%i==0&&b%i==0)
            {
                getv=i;
            }
        }
        return(getv);
    }
}

