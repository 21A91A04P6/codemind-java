import java.util.Scanner;
class add
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,sum=0,r;
        n=sc.nextInt();
        while(n/10!=0)
        {
            sum=0;
            while(n>0)
            {
                r=n%10;
                sum=sum+r;
                n=n/10;
            }
            n=sum;
        }
        System.out.printf("%d",sum);
    }
}