import java.io.*;
class input4
{
public static void main (String args []) throws IOException
{
    BufferedReader buffy=new BufferedReader (new InputStreamReader(System.in));
    System.out.println ("enter a number");
    String x=buffy.readLine();
    int b=Integer.parseInt(x);
    System.out.println ("enter a number");
    String y=buffy.readLine();
    int a=Integer.parseInt(y);
    System.out.println ("enter a number");
    String z=buffy.readLine();
    int c=Integer.parseInt(z);
    double d=(Math.sqrt((Math.pow(b,2))-(4*a*c)));
    double x1=(-b + d)/(2*a);
    double x2=(-b - d)/(2*a);
    System.out.println("discriminant="+d);
    System.out.println("the value is="+x1 +" or="+x2);
}
}
    