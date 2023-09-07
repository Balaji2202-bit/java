import java.util.Scanner;

public class Prime_Factors
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        factor(num);
    }
    public static void factor(int a)
    {
        for(int i=1;i<=a;i++)
        {
            if(a%i==0)
            {
                prime_Factor(i);
            }
        }
    }
    public static void prime_Factor(int n)
    {
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0) {
                count++;
            }
        }
        if(count<=2)
        {
            System.out.println(n+"is a prime Factor");
        }
    }
}
