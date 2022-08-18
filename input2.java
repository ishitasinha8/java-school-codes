import java.io.*;
class input2
{
public static void main (String args []) throws IOException
{
    BufferedReader buffy=new BufferedReader (new InputStreamReader(System.in));
    System.out.println ("enter a number");
    String a=buffy.readLine();
    int B=Integer.parseInt(a);
    System.out.println ("enter a smaller number");
    String b=buffy.readLine();
    int S=Integer.parseInt(b);
    int o=(int)((Math.random()*(B-S))+S);
    System.out.println("the random number is="+o);
}
}