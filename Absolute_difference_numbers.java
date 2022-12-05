import java.util.*;
class abs
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,s,e,r,c=0,d=0,g=0,f,t;
        a=sc.nextInt();
        t=a;
        b=sc.nextInt();
        s=a%(int)Math.pow(10,b);
        while(t!=0){
            r=t%10;
            d=d*10+r;
            t=t/10;
        }
        e=d%(int)Math.pow(10,b);
        while(e!=0)
        {
            f=e%10;
            g=g*10+f;
            e=e/10;
        }
        c=Math.abs(g-s);
        System.out.printf("%d",c);
    }
}