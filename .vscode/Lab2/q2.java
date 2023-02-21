public class Triangle
{
    private double a;
    private double b;
    private double c;
    public Triangle(double a, double b, double c)
    {
        boolean isTriangle=true;
        if (a + b<=c || a + c <=b || b + c<=a)
        {
            System.out.println("*ERROR: This is not an triangle");
            isTriangle=false;
        }
        if (a + b > c || a + c > b || b + c > a)
        {    
            System.out.println("This is an triangle");
            
        }
        if (a==b && a==c) 
        {
            System.out.println("This is an Equilateral Triangle ")
        }
        if (a==b || a==c || b==c)
        {
            System.out.println("This is an Isosceles Triangle")
        }
        if (a!=b && a!=c)
        {
            System.out.println("This is a Scalene Triangle")
        }
    }
