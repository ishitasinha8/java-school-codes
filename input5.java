import java.io.*;
class input5
{
public static void main (String args []) throws IOException
{
    BufferedReader buffy=new BufferedReader (new InputStreamReader(System.in));
    System.out.println ("enter a number");
    String x=buffy.readLine();
    int r=Integer.parseInt(x);
    double pi= 3.14;
    double V=(4*pi*(Math.pow(r,3)))/3;
    System.out.println("the volume of the sphere is="+V);
}
}
    