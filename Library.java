import java.io.*;
class Library
{
public static void main (String args []) throws IOException
{
    BufferedReader buffy=new BufferedReader (new InputStreamReader(System.in));
    System.out.println ("enter your ID");
    String x=buffy.readLine();
    int a=Integer.parseInt(x);
    System.out.println ("enter the member name");
    String y=buffy.readLine();
    System.out.println ("enter the book name");
    String z=buffy.readLine();
    System.out.println ("enter the number of days the book is returned late");
    String w=buffy.readLine();
    int d=Integer.parseInt(w);
    int f=0;
    if(d<=5)
    f=40*5;
    else if((d>=6)&&(d<=10))
    f=(40*5)+((d-5)*65);
    else if(d>=11)
    f=(40*5)+(65*5)+((d-10)*80);
    System.out.println("the fine to be payed is= "+f +"paise");
}
}
    
    
    