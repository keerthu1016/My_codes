package Week_2;
import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
public class sumOfFdanLd
{
    public static void main(String[] args)
    {
        int n=89564;
        int last_digit;
        int first_digit=0;
        last_digit=n%10;
        int sum=0;
        while(n>0)
        {
            first_digit=n%10;
            n=n/10;
        }
        System.out.println(last_digit);
        System.out.println(first_digit);
        sum=first_digit+last_digit;
        System.out.println(sum);
    }
}
