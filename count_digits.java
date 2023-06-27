import java.util.Scanner;
public class even
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,p=0,i,r,a[],max=0;
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            p=0;
              if(a[i]==0)
           {
               p=p+1;
           }
            
           while(a[i]!=0)
           {
               r=a[i]%10;
               p=p+1;
               a[i]=a[i]/10;
           }
         
        System.out.printf("%d ",p);
        }
    }
}