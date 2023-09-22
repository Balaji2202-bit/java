public class Singleton {
    private static Singleton instance;
    Singleton s=new Singleton();
    int a;
     private Singleton()
    {
      new Singleton();
    }
    public static Singleton getInstance()
    {
    if (instance==null)
    {
        instance=new Singleton();
    }
    return instance;
    }

    public static Singleton createNewInstance() {
        instance = new Singleton();
        System.out.println();
        return instance;
    }
    public int ji(int a,double b)
    {
     return a;
    }
    public int ji(int c,int b)
    {
        return c;
    }


}
