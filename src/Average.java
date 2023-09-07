public class Average
{
    int a,b,c;
    Average()
    {
        this(0,0,0);
    }
    Average(int a)
    {
        this(a,0,0);
    }
    Average(int a ,int b)
    {
        this(a,b,0);
    }
    Average(int a ,int b, int c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public int getAverage()
    {
        int x=0;
        if (a==0 && b==0 && c==0)
        {
            x = 0;
            return x;
        }
        if(b==0 && c==0)
        {
            int z=a;
            x=z;
            return x;
        }
        if(c==0)
        {
            int z=(a+b)/2;
            x=z;
            return x;
        }
        if(a!=0 && b!=0 && c!=0)
        {
            int z=(a+b+c)/3;
            x=z;
        }
        return x;
    }
}
