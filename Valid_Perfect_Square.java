import java.util.Scanner;
class per
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t,i;
        t=sc.nextInt();
        for(i=0;i<t;i++)
        {
            int a,j,f=0;
            a=sc.nextInt();
            for(j=1;j<a;j++)
            {
                if(a==j*j)
                {
                    f=1;
                }
            }
            if(f==1)
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
        }
    }
}