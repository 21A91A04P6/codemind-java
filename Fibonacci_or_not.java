import java.util.Scanner;
class fib
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a=0,b=1,i,c,cout=0;
        n=sc.nextInt();
        for(i=0;i<=n;i++)
        {
            if(a==n)
            {
                cout++;
            }
            c=a+b;
            a=b;
            b=c;
        }
        if(cout==1)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}