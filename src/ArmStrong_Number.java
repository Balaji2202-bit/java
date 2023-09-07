import java.util.Scanner;

public class ArmStrong_Number
{
    public static void main(String[] args)
    {
     Scanner sc= new Scanner(System.in);
      int input=sc.nextInt();
      int input_Assign=input;
      int input_Assign1=input;
      int count=0;
      int sum=0;
      while (input>0)
      {
          count++;
          input=input/10;
      }
      while(input_Assign>0)
      {
          int b=input_Assign%10;
          sum=sum+ArmStrong_Numb(b,count);
          input_Assign /= 10;
      }
      if(input_Assign1==sum)
          System.out.println("Armstrong Number");
      else
          System.out.println("Not Armstrong Number");
    }
    public static int ArmStrong_Numb(int b,int count)
    {
        int c=1;
        while(count>0)
        {
            c=c*b;
            count--;
        }
        return c;
    }
}
