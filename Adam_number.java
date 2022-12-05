import java.util.Scanner;
class adam
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
    int n;
    n=sc.nextInt();
    int sq;
    sq=n*n;
    int r,rev=0,r1=0;
    while(n!=0)
    {
        r=n%10;
        rev=rev*10+r;
        n=n/10;
    }
    int s,r2;
    s=rev*rev;
    while(s!=0)
    {
        r2=s%10;
        r1=r1*10+r2;
        s=s/10;
    }
    if(sq==r1)
    {
        System.out.println("True");
    }
    else
    {
        System.out.println("False");
    }
}
    }