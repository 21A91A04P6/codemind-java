import java.util.Scanner;
class k
{
    public static void main(String args[])
    {
	 Scanner sc=new Scanner(System.in);
	int a[],n,b,count=0;
	n=sc.nextInt();
	b=sc.nextInt();
    a=new int[n];
	int i;
	for(i=0;i<n;i++)
	{
	    a[i]=sc.nextInt();
    }
    	for(i=0;i<n;i++)
	{
    if(a[i]%b==0)
    {
    	count++;
	} 
}
    System.out.printf("%d",count);
    }
}