import java.util.Scanner;
class can
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
int n,c=0,a[],i;
n=sc.nextInt();
a=new int[n];
for(i=0;i<n;i++)
{
    a[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
    if(a[i]%2!=0)
    {
        c=c+1;
    }
}
if(c<=2)
{
    System.out.println("YES");
}
else{
    System.out.println("NO");
}
}
}