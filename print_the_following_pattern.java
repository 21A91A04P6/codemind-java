import java.util.Scanner;
class pate
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
    int i, j, n;  
    n=sc.nextInt();   
    for (i=1; i<=n;i++)   
    {  
        for (j=1;j<=n; j++)   
        {  
            if(i==j)
            {
                System.out.printf("0");
            }
            else
            {
            System.out.printf ("x");   
        }  }
        System.out.printf ("
");  
    }  
}  
}