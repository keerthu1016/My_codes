package Week_5.String;
import java.util.Scanner;
public class reverseString
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[] arr=str.toCharArray();
        int i=0;
        int j=arr.length-1;
        while(i<j)
        {
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.println("reversed string");
        for(int k=0;k<arr.length;k++)
        {
            System.out.print(arr[k]);
        }
    }
}
