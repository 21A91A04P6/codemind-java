import java.util.Scanner;
class sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,sum;
        a=sc.nextInt();
        sum=a*(a+1)/2;
        System.out.println(+sum);
    }
}