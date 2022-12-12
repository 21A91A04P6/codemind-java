import java.util.Scanner;
class series
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        float i,sum=0;
        for(i=1;i<=n;i++)
        {
            sum=sum+(1/i);
        }
        System.out.printf("%.2f",sum);
    }
}