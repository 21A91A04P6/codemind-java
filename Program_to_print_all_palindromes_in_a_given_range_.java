import java.util.*;
public class pal
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m,i,r,s=0,temp=0;;
        n=sc.nextInt();
        m=sc.nextInt();
        for(i=n;i<=m;i++)
        {
            temp=i;
            s=0;
            while(temp!=0)
            {
                r=temp%10;
                s=s*10+r;
                temp=temp/10;
            }
            if(s==i)
            {
            System.out.printf("%d ",s);
            }
        }
    }
}