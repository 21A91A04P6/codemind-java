import java.util.Scanner;
class evod
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
        for(i=0;i<n;i++)
        {
            if(a[i]%2!=0)
            {
                System.out.printf("%d ",a[i]);
            }
        }
        for(i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                System.out.printf("%d ",a[i]);
            }
        }
    }
}