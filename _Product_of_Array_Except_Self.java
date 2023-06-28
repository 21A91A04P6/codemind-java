import java.util.*;
public class win
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a[],i,j,p=1;
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            p=1;
            for(j=0;j<n;j++)
            {
               if(i!=j)
               {
                   p=p*a[j];
               }
            }
           System.out.printf("%d ",p);
        }
       
    }
}