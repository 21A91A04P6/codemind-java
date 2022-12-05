import java.util.Scanner;
class pretty
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
         int i,m,n,r,t,count=0;
    t=sc.nextInt();
    while(t-->0)
    {
        m=sc.nextInt();
        n=sc.nextInt();
        count=0;
    for(i=m;i<=n;i++)
    {
        r=i%10;
        if(r==2||r==3||r==9)
       {
           count++;
       }
    }
    System.out.printf("%d
",count);
    }
    }
}