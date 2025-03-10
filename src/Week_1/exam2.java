package Week_1;
import java.util.Scanner;
import java.lang.Math;
public class exam2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        long square = 0;
        for (int i = 1; i <= n; i++)
        {
            square = (long) Math.pow(i, 5);
            sum = sum + square;
        }
        System.out.println(sum);
    }

}
