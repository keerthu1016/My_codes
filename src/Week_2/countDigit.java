package Week_2;

public class countDigit {
    public static void main(String[] args)
    {
        int n=6789;
        int count=0;
        while(n>0)
        {
            int fd=n%10;
            count=count+1;
            n=n/10;
        }
        System.out.println(count);
    }

}
