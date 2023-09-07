import java.util.Scanner;

public class Abundant_Number
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int input=sc.nextInt();
        int sum=0;
        for(int i=2;i<input;i++)
        {
            if(input%i==0)
                sum=sum+i;
        }
        if(sum>input)
            System.out.println("Abundant Number");
        else
            System.out.println("Non-Abundant Number");
    }
}
