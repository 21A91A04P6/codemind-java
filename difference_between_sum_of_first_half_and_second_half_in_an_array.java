import java.util.Scanner;
class sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a[],i,s1=0,s2=0;
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n/2;i++)
        {
            s1=s1+a[i];
        }
        for(i=n/2;i<n;i++)
        {
            s2=s2+a[i];
        }
        System.out.printf("%d",s2-s1);
    }
}