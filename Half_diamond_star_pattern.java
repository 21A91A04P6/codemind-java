import java.util.Scanner;
class pattern
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m=1;
        n=sc.nextInt(); 
        if(n>=3 && n<=100)
        {
            for(int i=1;i<=n;i++)  
            {  
               for(int j=1;j<=i;j++)  
               {  
    System.out.printf("*");  
  }  
  System.out.printf("
");  
}  
for(int i=n-1;i>=1;i--)  
 {  
   for(int j=1;j<=i;j++)  
   {  
     System.out.printf("*");  
   }  
   System.out.printf("
");  
 }   
}
else
{
    System.out.println("The pattern is not possible");
}
}  
    
}