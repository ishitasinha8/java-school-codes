import java.io.*;
class input1
{
public static void main (String args []) throws IOException
{
    BufferedReader buffy=new BufferedReader (new InputStreamReader(System.in));
    System.out.println ("enter a number");
    String a=buffy.readLine();
    int x=Integer.parseInt(a);
    System.out.println ("enter a number");
    String b=buffy.readLine();
    int y=Integer.parseInt(b);
    System.out.println ("enter a number");
    String c=buffy.readLine();
    int n=Integer.parseInt(c);
    int m=x+y;
    double Z=Math.pow(m,n);
    System.out.println("the value is="+Z);
}
}
    