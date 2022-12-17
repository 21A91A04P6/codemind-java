import java.util.Scanner;
class par
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
         int i,j,n;
         n=sc.nextInt();
    for(i=1;i<=n;i++)
    {
        for(j=1;j<=i;j++)
        {
            System.out.printf("%d",j);
        }
        System.out.printf("
");
    }
    }
}