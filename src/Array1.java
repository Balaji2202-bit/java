/*public class Array1
{
    public static void main(String[] args)
    {
        try {
            long a[] = new long[2147483647];
            for(long b:a)
        {
            System.out.println(b);
        }
        }
        catch (OutOfMemoryError e){
            System.out.println("out of memory variable reinitialize");
            long a[]=new long[10];
            for(long b:a)
        {
            System.out.println(b);
        }
        }
//        for(int i=0;i<a.length;i++)
//        {
//            System.out.println("hello: ");
//        }
//
int z[]={1,3,4,6,7,8,0};
    }
}
*/

class Students {
    public int roll_no;
    public String name;
    Students(int roll_no, String name)
    {
        this.roll_no = roll_no;
        this.name = name;
    }
}

 /*class content {
    public static void main(String[] args)
    {

        Students[] arr;
        arr = new Students[5];
        arr[0] = new Students(1,"aman");
        arr[1] = new Students(2, "vaibhav");
        arr[2] = new Students(3, "shikar");
        arr[3] = new Students(4, "dharmesh");
        arr[4] = new Students(5, "mohit");
        for (int i = 0; i < arr.length; i++)
            System.out.println("Element at " + i + " : "
                    + arr[i].roll_no + " "
                    + arr[i].name);
    }
} */
 class Test {
     public static void main(String args[])
     {
         int intArray[] = new int[3];
         byte byteArray[] = new byte[3];
         short shortsArray[] = new short[3];

         // array of Strings
         String[] strArray = new String[3];

         System.out.println(intArray.getClass());
         System.out.println(
                 intArray.getClass().getSuperclass());
         System.out.println(byteArray.getClass());
         System.out.println(shortsArray.getClass());
         System.out.println(strArray.getClass());
     }
 }
