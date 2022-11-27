import java.util.Scanner;
class fact
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t,i;
        t=sc.nextInt();
        for(i=0;i<t;i++)
        {
            int a,j,f=1;
            a=sc.nextInt();
            for(j=1;j<=a;j++)
            {
                f=f*j;
            }
            System.out.printf("%d
",f);
        }
    }
}