import java.io.*;
class factoriala
{
public static void main(String args[])throws IOException
{
    BufferedReader rama=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("1. aunty's method");
    System.out.println("2. ishi's method");
    System.out.println("enter your choice");
    String l=rama.readLine();
    int c=Integer.parseInt(l);
    switch(c)
    {
        case 1:
        {
            System.out.println("enter a number");
            String o=rama.readLine();
            int h=Integer.parseInt(o);
            int p=1;
            while(h>=1)
            {
                p=p*h;
                h--;
                }
                System.out.println("factorial="+p);
                }
                break;
                
         case 2:
         {
            System.out.println("enter a number");
            String j=rama.readLine();
            int n=Integer.parseInt(j);
            int a=1;
            long S=1;
            while(a<=n)
            {
                S=S*a;
                a++;
                }
                System.out.println("factorial="+S);
                }
                break;
            }}}


        