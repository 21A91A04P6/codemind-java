import java.util.Scanner;
class count
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a[],i,k=0,c,p=0;
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            k=k+a[i];
        }
        c=k/n;
        for(i=0;i<n;i++)
        {
            if(a[i]>=c)
            {
                p++;
            }
        }
        System.out.printf("%d",p);
    }
}