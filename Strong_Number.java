import java.util.Scanner;
class strong
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
    int n,i,fact,r,sum=0,temp;
    n=sc.nextInt();
    temp=n;
    while(n>0)
    {
        i=1;
        fact=1;
        r=n%10;
        while(i<=r)
        {
            fact=fact*i;
             i++;
        }
        sum=sum+fact;
        n=n/10;
    }
    if(sum==temp)
    {
        System.out.printf("The number %d is a strong number",temp);
    }
    else
    {
         System.out.printf("The number %d is not a strong number",temp);
    }
}
}