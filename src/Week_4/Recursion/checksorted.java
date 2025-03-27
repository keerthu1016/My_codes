package Week_4.Recursion;

public class checksorted
{
    static boolean checksort(int arr[],int n,int i)
    {
        if(i>=n-1)
            return true;
        if(arr[i]>arr[i+1])
            return false;
        return checksort(arr,5,i=i+1);
    }
    public static void main(String args[])
    {
        int arr[]={1,2,4,3,5};
        System.out.println(checksort(arr,5,0));
    }
}
