import java.util.*;
public class even
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a[],i,r=0,p=0;
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
           r=(int)Math.log10(a[i])+1;
            if(r%2==0)
            {
                p++;
            }
        }
        System.out.printf("%d",p);
    }
}