import java.util.Scanner;
class pattern
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
         int i, j, n, ch = 'A';  
    n=sc.nextInt();   
    for (i =1; i<=n; i++)   
    {  
        for (j = 1; j<=n; j++)   
        {  
            System.out.printf ("%c ", ch);   
        }  
        ch++;  
        System.out.printf ("
");  
    }  
    }
}