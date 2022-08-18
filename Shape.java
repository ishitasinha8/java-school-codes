import java.util.*;
interface Shape
{
    //public void accept();
    public double area();
    public void print();
}
class Circle implements Shape
{
    double radius;
    double ar;
    Circle(double r)
    {
        radius=r;
    }
    
    
//    public void accept()
//    {
//        Scanner sc=new Scanner(System.in);
//        //BufferedReader buffy=new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Enter radius");
//        radius=sc.nextDouble();
//    }
    //@Override
    public double area()
    {
        ar=3.14*radius*radius;
        return(ar);
    }
    //@Override
    public void print()
    {
        System.out.println(ar);
    }
}
class Rectangle implements Shape
{
    double length,breadth,arr;
    Rectangle(double l,double b)
    {
        length=l;
        breadth=b;
    }
    
//    public void accept()
//    {
//        Scanner sc=new Scanner(System.in);
//        //BufferedReader buffy=new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Enter length");
//        length=sc.nextDouble();
//        System.out.println("Enter breadth");
//        breadth=sc.nextDouble();
//    }
    public double area()
    {
        arr=length*breadth;
        return(arr);
    }
    public void print()
    {
        System.out.println(arr);
    }
}
class abc
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        //BufferedReader buffy=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter radius");
        double rad=sc.nextDouble();
        Circle obj=new Circle(rad);
        //obj.accept();
        obj.area();
        obj.print();
        
        System.out.println("Enter length");
        double len=sc.nextDouble();
        System.out.println("Enter breadth");
        double bre=sc.nextDouble();
        Rectangle obj2=new Rectangle(len,bre);
        //obj2.accept();
        obj2.area();
        obj2.print();
    }
}