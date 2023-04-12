package Lab1.Q1;
public class Rectangle
{
    private int height;
    private int width;
    public Rectangle(int height, int width)
    {
        if (height <= 0)
        {
            System.out.println("*ERROR: Height cant lesser or equal to zero!");
            height = 1;
            this.height = height;
        }
        else if (width <= 0)
        {    
            System.out.println("*ERROR: Width cant be lesser or equal to zero!");
            width =1;
            this.width = width;
        }
        else
        {
            this.height = height;
            this.width = width;
        }
    }
    public int getHeight()
    {
        return height;
    }
    public int getWidth()
    {
        return width;
    }
    public void VisualizeRectangle()
    {
        for (int i=0;i<=height;i++)
        {
            for(int j=0;j<=width;j++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
