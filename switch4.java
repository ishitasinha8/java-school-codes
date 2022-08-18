import java.io.*;
class switch4
{
public static void main (String args []) throws IOException
{
    BufferedReader buffy=new BufferedReader (new InputStreamReader(System.in));
    System.out.println ("1. Natural Logarithm of a number");
    System.out.println ("2. Exponent value of a number");
    System.out.println ("3. Truncated value of a fractional number");
    System.out.println ("4. Rounded value of a decimal number");
    System.out.println ("enter your choice");
    String ch=buffy.readLine();
    int cho=Integer.parseInt(ch);
    switch (cho)
    {
        case 1:
        {
             System.out.println ("enter a number");
             String A=buffy.readLine();
             double a=Double.parseDouble(A);
             double z= Math.log(a);
             System.out.println ("the Natural Logarithm is="+z);
        }
        break;
        case 2:
        {
            System.out.println ("enter a number");
             String B=buffy.readLine();
             double b=Double.parseDouble(B);
             double y= Math.exp(b);
             System.out.println ("the Exponent Value is="+y);
        }
        break;
        case 3:
        {
             System.out.println ("enter a fractional number");
             String C=buffy.readLine();
             double c=Double.parseDouble(C);
             double x= Math.rint(c);
             System.out.println ("the truncated value is="+x);
        }
        break;
        case 4:
        {
            System.out.println ("enter a decimal number");
             String D=buffy.readLine();
             double d=Double.parseDouble(D);
             double w= Math.round(d);
             System.out.println ("the rounded number is="+w);
        }
        break;
    }
}
}
        
            
            
                
                
            