package Week_5.String;
import java.util.Scanner;
public class pallindromeString
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        boolean result=checkpallindrome(str);
        System.out.println(result ? "pallindrome":"not pallindrome");

    }
    static boolean checkpallindrome(String str)
    {
        int i=0;
        int j=str.length()-1;
        while(i<=j)
        {
            if(str.charAt(i)!=str.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;

    }
}
