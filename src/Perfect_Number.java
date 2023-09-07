import java.util.Scanner;

public class Perfect_Number
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int num1=sc.nextInt();
        factor(num,num1);
    }
    public static void factor(int a,int b)
    {
        for(int i=a;i<=b;i++)
        {
                prime_Factor(i);
        }
    }
    public static void prime_Factor(int n)
    {
        int count=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                count=count+i;
            }
        }
        if(count==n)
        {
            System.out.println(n+" is a Perfect Factor");
        }
    }
}
