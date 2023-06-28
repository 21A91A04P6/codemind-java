import java.util.*;
public class win
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a[],b[],i,j,s;
        n=sc.nextInt();
        a=new int[n];
        b=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            b[i]=a[i]*a[i];
        }
       Arrays.sort(b);
       for(i=0;i<n;i++)
       {
       System.out.printf("%d ",b[i]);
       }
    }
}