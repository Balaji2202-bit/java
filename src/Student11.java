import java.util.*;

class Student10
{

    private int id;
    private String name;
    private List<String> sub=new ArrayList<>(Arrays.asList("Tamil","English","Maths","Science","Social"));
    private Map<String, Float> f=new HashMap<>();

    public Student10(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public void setMark(){
        Scanner scanner=new Scanner(System.in);
        for (String sub:
             ) {

        }

    }
}
public class Student11{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int id=s.nextInt();
        Student10 ob=new Student10(id,s.nextLine());

    }
}
