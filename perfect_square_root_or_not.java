import java.util.Scanner;
class root
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,i,f=0;
        a=sc.nextInt();
        for(i=1;i<a;i++)
        {
        if(a==i*i)
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