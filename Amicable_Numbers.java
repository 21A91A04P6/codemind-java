import java.util.Scanner;
class ami
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c=0,i;
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=1;i<a;i++)
        {
            if(a%i==0)
            {
                c=c+i;
            }
        }
        if(c==b)
        {
            System.out.println("Amicable");
        }
        else
        {
            System.out.println("Not Amicable");
        }
    }
}