import java.util.*;
public class win
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a[],i,diff=0,s1=0,s2=0;
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(i%2!=0)
            {
                s1=s1+a[i];
            }
            else
            {
                s2=s2+a[i];
            }
        }
        diff=(int)Math.abs(s1-s2);
        if(diff%4==0)
        {
            System.out.println("X");
        }
        if(diff%4!=0)
        {
            System.out.println("Y");
        }
    }
}