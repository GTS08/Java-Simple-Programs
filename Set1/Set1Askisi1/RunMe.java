class Box
{
    // Instance Variables
    double length ;
    double width ;
    double height ;
    double epi;
    double ogk;

    // Constructors
    Box ( double side )
    {
        width = side ;
        height = side ;
        length = side ;
    }
    
    Box ( double x, double y, double z )
    {
        this.length = x ;
        this.width = y ;
        this.height = z ;
    }
    
    // Methods
    double calculate()
    {
        return (width * height * length)/2 ;
    }
    
    double epifaneia()
    {
        return epi = 2*(length*width + length*height + width*height);
    }    
    
    double ogkos()
    {
        return ogk = this.calculate()*2;
    }
    
    public String toString()
    {
        return epi + "" + ogk;
    }
}

class MyBox extends Box
{   
    MyBox(double x, double y, double z)
    {
        super(x,y,z);
        if(x!=y || y!=z || x!=z)
        {
            System.out.println("There was a mistake");
        }
    }
    
    double epifaneia()
    {
        return epi = 2*(length*width + length*height + width*height);
    }    
    
    double ogkos()
    {
        return ogk = this.calculate()*2;
    }
    
    public String toString()
    {
        return epi + "" + ogk;
    }
}

class Spirtokouto extends Box
{
    double weight;
    
    Spirtokouto(double x, double y, double z, double w)
    {
        super(x,y,z);
        this.weight = w ;
    }
    
    double epifaneia()
    {
        return epi = 2*(length*width + length*height + width*height);
    }    
    
    double ogkos()
    {
        return ogk = this.calculate()*2;
    }
    
    public String toString()
    {
        return epi + "" + ogk;
    }
}

public class RunMe
{
    public static void main( String args[] )
    {
        Box box1 = new Box(2.0, 3.5, 5.0);
        box1.calculate();
        box1.epifaneia();
        box1.ogkos();
        box1.toString();
        System.out.println("Epifaneia " + box1.epi + ", " + "Ogkos " + box1.ogk);
        
        MyBox box2 = new MyBox(4.0, 4.0 ,4.0);
        box2.calculate();
        box2.epifaneia();
        box2.ogkos();
        box2.toString();
        System.out.println("Cube: " + "Epifaneia " + box2.epi + ", " + "Ogkos " + box2.ogk);
        
        Spirtokouto box3 = new Spirtokouto(2.0, 4.0, 3.0, 16.0);
        box3.calculate();
        box3.epifaneia();
        box3.ogkos();
        box3.toString();
        System.out.println("MatchBox: " + "Epifaneia " + box3.epi + ", " + "Ogkos " + box3.ogk + ", " + "Varos " + box3.weight);
        
    }
}