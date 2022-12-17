import java.util.Scanner;
class patt
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n,j;
        n=sc.nextInt();
    for(i=1;i<=n;i++)
    {
        for(j=i;j<=n;j++)
        {
            System.out.printf("%d ",j);
        }
        System.out.printf("
");
    }
    }
}