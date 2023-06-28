import java.util.*;
public class win
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a[],i,j,p=0;
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            p=0;
            for(j=0;j<n;j++)
            {
               if(a[i]==a[j])
               {
                   p++;
               }
            }
        
            if(p>1)
            {
           System.out.printf("%d ",a[i]);
                break;
            }
        }
       
    }
}