package Week_3;
import java.util.Scanner;
public class reverseNumber
{
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int revN=0;
      while(n>0)
      {
          int ld=n%10;
          revN=revN*10+ld;
          n=n/10;
      }
        System.out.println(revN);
    }
}
