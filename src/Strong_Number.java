import java.util.Scanner;

public class Strong_Number
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int input_Assign=input;
        int c=0;
        while (input > 0) {
            int b = input % 10;
            c=c+Strong(b);
            input=input/10;
        }
        if(input_Assign==c)
            System.out.println("Strong number");
        else
            System.out.println("Not a Strong Number");
    }
    private static int Strong(int b)
    {
        int sum=1;
        for(int i=1;i<=b;i++)
        {
            sum=sum*i;
        }
        return sum;
    }
}
