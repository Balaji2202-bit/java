import java.util.Scanner;

public class AutoMorphic_Number
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int Input=sc.nextInt();
        int Input_Assign=Input;
        int Square_value=Input*Input;
        int Square_value_Assign=Square_value;
        int count=0;
        int count1=0;
        while(Square_value>0)
        {
            count++;
            Square_value=Square_value/10;
        }
        while(Input>0)
        {
            count1++;
            Input=Input/10;
        }
     // int  count2=count-count1;
        int digits=1;
        while(count1>0)
        {
            digits=digits*10;
            count1--;
        }
        int x=Square_value_Assign%digits;
        if(x==Input_Assign)
            System.out.println("Automorphic Number");
        else
            System.out.println("Not Automorphic number");
     //  System.out.println(count+" "+ count1+" "+digits+ Square_value_Assign+" " +x);
    }
}
