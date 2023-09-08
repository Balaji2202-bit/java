import java.io.*;
import java.util.Scanner;

class Exceptional
{
    public static void main(String[] args)
    {
//        try
//        {
//            Class.forName("Area6");
//        }
//        catch (ClassNotFoundException e)
//        {
////            throw new RuntimeException(e);
//            System.out.println("ClassNotFoundException Occured");
//            // detail View
//            e.printStackTrace();
//            // reason for the error
//            System.out.println(e.getMessage());
//            // error store some new variable
//            System.out.println(e.getStackTrace());
//
//        }
        try
        {
            File file=new File("//text.txt");
            FileReader fileReader=new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
          System.out.println(bufferedReader.read());
            System.out.println(bufferedReader.read());
//            System.out.println(fileReader.read());
//            System.out.println(fileReader.read());
            System.out.println(bufferedReader.read());
//            Scanner sc=new Scanner(file);
//            int string=sc.next();
//        System.out.println(string);

        }
        catch (FileNotFoundException e)
        {
            System.out.println("file not found");
        }
        catch (IOException e)
        {
//            throw new RuntimeException(e);
            System.out.println("IO exceptionl");
        }
    }
}