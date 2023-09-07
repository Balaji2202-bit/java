public class Student
{
    public static void main(String ars[])
    {
        Student s=new Student();
        s.setMethod("Jilaba",20);
        System.out.printf("Student Name: "+s.getName()+"%nStudent Roll Number: " +s.getRoll_no());
    }
    private String name;
    private int roll_no;
    public void setMethod(String name,int roll_no)
    {
        this.name=name;
        this.roll_no=roll_no;
    }
    public  String getName()
{
    return name;
}
    public  int getRoll_no()
    {
        return roll_no;
    }

}
