import java.io.*;
class if2
{
public static void main (String args []) throws IOException
{
    BufferedReader buffy=new BufferedReader (new InputStreamReader(System.in));
    System.out.println ("enter your code of item purchased");
    String x=buffy.readLine();
    int a=Integer.parseInt(x);
    System.out.println ("enter the quantity purchased");
    String y=buffy.readLine();
    int b=Integer.parseInt(y);
    System.out.println ("enter the rate");
    String z=buffy.readLine();
    int c=Integer.parseInt(z);
    int p=b*c;
    System.out.println("the purchase price is= Rs"+p);
    if((p>100)&&(p<500))
    System.out.println("your gift is a key chain");
    else if((p>500)&&(p<1000))
    System.out.println("your gift is a leather purse");
    else if(p>1000)
    System.out.println("your gift is a pocket calculator");
}
}
    