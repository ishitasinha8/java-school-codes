import java.io.*;
class switch3
{
public static void main (String args []) throws IOException
{
    BufferedReader buffy=new BufferedReader (new InputStreamReader(System.in));
    System.out.println ("1. an Infinite Loop");
    System.out.println ("2. an Empty Loop");
    System.out.println ("enter your choice");
    String ch=buffy.readLine();
    int c=Integer.parseInt(ch);
    switch (c)
    {
        case 1:
        {
            for(int a=1;a<=10;)
            {
                System.out.println("infinite loop");
                System.out.println("enter 0 to stop");
                String st=buffy.readLine();
                int s=Integer.parseInt(st);
                if(s==0)
                break;
            }
        }
        break;
        case 2:
        {
            for(int b=1;b<=10;b++);
        }
        break;
    }
}
}
            
                