import java.util.Scanner;
class auto
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,s=0,temp,p,q;
        n=sc.nextInt();
        temp=n;
while(n!=0)
{
    n/=10;
    s=s+1;
}
q=(int)Math.pow(temp,2);
p=q%((int)Math.pow(10,s));
if(p==temp)
{
    System.out.println("Automorphic Number");
}
else{
    System.out.println("Not an Automorphic Number");
}
    }
}