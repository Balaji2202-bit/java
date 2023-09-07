import java.util.Scanner;
public class ArmStrong_range
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        int input2=sc.nextInt();
        for(int i=input; i<input2; i++)
        {
            // assign i value
            int i1 = i;
            // count how many digits
            int count = 0;
            int sum = 0;
            while (i > 0)
            {
                count++;
                i = i / 10;
            }
            sum = ArmStrong_Numb(i1, count);
            if (i1 == sum)
            {
                System.out.println( i1 + " is a Armstrong Number");
            }
            else
                System.out.println( i1+" is Not a Armstrong Number");
        }
    }
    public static int ArmStrong_Numb(int b,int count)
    {
        int c=1;
        int sum=0;
        int count1=count;
        while(b>0)
        {
            int x=b%10;
            while(count1>0)
            {
                c=c*x;
                count1--;
            }
            sum=sum+c;
            b /= 10;
        }
        return sum;
    }
}
