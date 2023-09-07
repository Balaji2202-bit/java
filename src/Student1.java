public class Student1
{
    private String name;
    private int roll_No;
    public static void main(String[] args)
    {
        Student1 s=new Student1("Raju",006);
        System.out.printf("Student Name: "+s.getName()+"%nStudent Roll_no: "+s.getRoll_no());
    }
    Student1(String name,int roll_No)
    {
        this.name=name;
        this.roll_No=roll_No;
    }
    public String getName()
    {
        return name;
    }
    public int getRoll_no()
    {
        return roll_No;
    }
}