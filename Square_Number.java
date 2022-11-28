import java.util.Scanner;
class sq
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,f=0,i,j;
        n=sc.nextInt();
for(i=0;i<n;i++)
{
    for(j=0;j<n;j++)
    {
        if(n==(i*i)+(j*j))
        {
            f=1;
        }
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