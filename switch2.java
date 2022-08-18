import java.io.*;
class switch2
{
   public static void main (String args []) throws IOException
   {
    BufferedReader buffy=new BufferedReader (new InputStreamReader(System.in));
    System.out.println ("i. calculate Simple Interest");
    System.out.println ("ii. calculate Compound Interest");
    System.out.println ("enter your choice");
    String c=buffy.readLine();
    System.out.println ("enter the principle amount");
    String p=buffy.readLine();
    int P=Integer.parseInt(p);
    System.out.println ("enter the time");
    String t=buffy.readLine();
    int T=Integer.parseInt(t);
    System.out.println ("enter the rate");
    String r=buffy.readLine();
    double R=Double.parseDouble(r);
    switch (c)
    {
        case "i":
        {
            double SI= (P*T*R)/100;
            System.out.println("the Simple Interest is"+SI);
        }
        break;
        case "ii":
        {
            int n=T;
            double A=(Math.pow((1+(R/100)),n))*P;
            double CI=A-P;
            System.out.println("the amount is"+A);
            System.out.println("the Compound Interest is"+CI);
        }
        break;
        default:
        {
            System.out.println("enter a valid choice");
        }
    }
}
}
            
            
            
            
    
    