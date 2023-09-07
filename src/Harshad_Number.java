import java.util.Scanner;

public class Harshad_Number
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int Input=sc.nextInt();
        int Input_Assign=Input;
        int sum=0;
        while(Input>0)
        {
            int d=Input%10;
            sum=sum+d;
            Input=Input/10;
        }
        int output=Input_Assign%sum;
        if(output==0)
            System.out.println("Harshad Number");
        else
            System.out.println("Non-Harshad Number");
        System.out.println(sum);
    }
}
