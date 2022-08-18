import java.io.*;
class if1
{
public static void main (String args []) throws IOException
{
    BufferedReader buffy=new BufferedReader (new InputStreamReader(System.in));
    System.out.println ("enter your name");
    String n=buffy.readLine();
    System.out.println ("enter your math marks");
    String a=buffy.readLine();
    int x=Integer.parseInt(a);
    System.out.println ("enter your english marks");
    String b=buffy.readLine();
    int y=Integer.parseInt(b);
    System.out.println ("enter your computer marks");
    String d=buffy.readLine();
    int z=Integer.parseInt(d);
    System.out.println("Your name is "+n);
    if((x>y) && (x>z))
    System.out.println("the maximum score in maths="+x);
    else if((y>x) && (y>z))
    System.out.println("the maximum score in english="+y);
    else if((z>x) && (z>y))
    System.out.println("the maximum score in computer="+z);
}
}
    
    
    
    
    
    
    
    
   