import java.util.Scanner;
public class half
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a[],i;
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=n-1;i>=n/2;i--)
        {
           System.out.printf("%d ",a[i]);
        }
         for(i=0;i<n/2;i++)
        {
            System.out.printf("%d ",a[i]);
        }
    }
}