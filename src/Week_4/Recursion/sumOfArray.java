package Week_4.Recursion;

public class sumOfArray
{
    public static void main(String args[])
    {
        int arr[]={10,5,4,1,9};
        System.out.println(sum(arr,5,0));
    }
    static int sum(int arr[],int n, int i)
    {
        if(i>=n)
            return 0;
        return arr[i]+ sum(arr,5,i=i+1);
    }
}
