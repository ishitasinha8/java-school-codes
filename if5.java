import java.io.*;
class if5
{
public static void main (String args []) throws IOException
{
    BufferedReader buffy=new BufferedReader (new InputStreamReader(System.in));
    System.out.println ("enter your name");
    String v=buffy.readLine();
    System.out.println ("enter your address");
    String w=buffy.readLine();
    System.out.println ("enter your amount of purchase");
    String x=buffy.readLine();
    int a=Integer.parseInt(x);
    System.out.println ("enter the type of purchase; L for laptop, D for desktop");
    char c=(char)buffy.read();
    double dr=0.0;
    if(c=='L')
    { 
        if(a<=25000)
        dr=0;
        else if((a>=25001)&&(a<57000))
        dr=5;
        else if((a>=57001)&&(a<=100000))
        dr=7.5;
        else if(a>=100001)
        dr=10;
    }
    else if(c=='D')
    {
        if(a<=25000)
        dr=5;
        else if((a>=25001)&&(a<57000))
        dr=7.5;
        else if((a>=57001)&&(a<=100000))
        dr=10;
        else if(a>=100001)
        dr=15;
    }
    double d=(dr*a)/100;
    double na=a-d;
    System.out.println("the net amount to be paid= "+na);
    System.out.println("the discount is= "+d);
    System.out.println("your name is "+v);
}
}
    
    
