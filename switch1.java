import java.io.*;
class switch1
{
    public static void main (String args []) throws IOException
    {
    BufferedReader buffy=new BufferedReader (new InputStreamReader(System.in));
    System.out.println ("1. temperature in Fahrenheit will be converted to Celsius");
    System.out.println ("2. temperature in Celsius will be converted to Fahrenheit");
    System.out.println ("enter your choice");
    String Ch=buffy.readLine();
    int ch=Integer.parseInt(Ch);
    switch (ch)
    {
        case 1:
        {
            System.out.println ("enter temperature in Fahrenheit");
            String f=buffy.readLine();
            float F=Float.parseFloat(f);
            double C=(5*(F-32))/9;
            System.out.println(C +"degrees C");
        }
        break;
        case 2:
        {
            System.out.println ("enter temperature in Celsius");
            String ce=buffy.readLine();
            float CE =Float.parseFloat(ce);
            double FA =(1.8*CE)+32;
            System.out.println(FA +"degrees F");
        }
        break;
        default:
        {
            System.out.println("enter valid choice");
        }
    }
}
}
            
        
            