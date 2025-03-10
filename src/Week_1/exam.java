// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class exam
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;int seriesTerm=0;
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
            seriesTerm=seriesTerm+sum;
        }
        System.out.println(seriesTerm);
    }
}