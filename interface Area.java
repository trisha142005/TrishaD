Interface Area 
{
    void findArea(int a ,int b);
}
class Rectangle implements Area
{
    public void findArea(int length, int breadth)
{
        System.out.println("Area of Rectangle: " + (length*breadth));
    }
}

class Triangle implements Area
{
    public void findArea(int b, int h)
{
        System.out.println("Area of Triangle: " + (0.5*breadth*height));
    }
}
public class AreaInterface
{
    public static void main(String[] args){
        Rectangle r = new Rectangle();
        r.findArea(5, 10);
        Triangle t = new Triangle();
        t.findArea(5, 10);
    }
}
