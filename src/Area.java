public class Area
{
    private int height;
    private int breath;
    public int getArea()
    {
        return height*breath;
    }
    public void setDim(int height, int breath)
    {
        this.height = height;
        this.breath = breath;
    }
}
