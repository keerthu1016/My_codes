package Week_2;

public class firstDigit
{
    public static void main(String[] args)
    {
        int n=89286;
        while(n>0)
        {
            int fd=n%10;
            n=n/10;
            if(n==0)
            {
                System.out.println(fd);
            }
        }
    }
}
