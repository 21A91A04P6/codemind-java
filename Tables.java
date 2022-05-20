import java.util.Scanner;
class table
{
    public static void main(String aegs[])
    {
        Scanner sc=new Scanner(System.in);
        int n,r,i,pro=1;
        n=sc.nextInt();
        r=sc.nextInt();
        for(i=1;i<=r;i++)
        {
            if(i%2!=0)
            {
                pro=n*i;
                 System.out.printf("%d x %d = %d
",n,i,pro);
            }
        }
       
    }
    
}