public  class GenericDemo1<T> //Generic Cla sses
{
    public static void main(String[] args)
    {
//        GenericDemo1<String> a=new GenericDemo1<String>();
//        GenericDemo1<Student> a1=new GenericDemo1<Student>();
//        System.out.println(a1.getClass().getTypeName());
//        System.out.println(a.getClass().getTypeName());

        demo d=new demo("hello Raj");
        demo d1=new demo(1234);
        d.show();
        d1.show();

    }
}

//class Alpha1 <Timplements >
//{
//    Alpha1<String> a=new Alpha1<String>();
//    Alpha1<Functional_Interface> a1= new Alpha1<>();
//}
class  demo<T>
{
    T t;
    demo(T ob)
    {
        this.t=ob;
    }
    public void show()
    {
        System.out.println("Class of an object is");
        System.out.println(t.getClass().getTypeName());
        String s=t.getClass().getTypeName();
        if(s.equals("java.lang.Integer"))
        {
            System.out.println("Integer Executed....");
        }
        if(s.equals("java.lang.String"))
        {
            System.out.println("String Executed....");
        }
    }
}