import java.util.Scanner;
public class sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a[],i,sum=0,b;
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
         for(i=0;i<n;i++)
        {
            for(b=1;b<=a[i];b++)
            {
            if(a[i]==b*b)
            {
                sum=sum+a[i];
            }
        }
        }
        System.out.printf("%d",sum);
    }
}