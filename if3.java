import java.io.*;
class if3
{
public static void main (String args []) throws IOException
{
    BufferedReader buffy=new BufferedReader (new InputStreamReader(System.in));
    System.out.println ("enter your basic salary");
    String x=buffy.readLine();
    int bs=Integer.parseInt(x);
    float da=0;
    float sa=0;
    if(bs<=10000)
    {
        da=(10*bs)/100;
        sa=(5*bs)/100;
    }
    else if((bs>=10001)&&(bs<=20000))
    {
        da=(12*bs)/100;
        sa=(8*bs)/100;
    }
    else if((bs>=20001)&&(bs<=30000))
    {
        da=(15*bs)/100;
        sa=(10*bs)/100;
    }
    else if (bs>=30001)
    {
        da=(20*bs)/100;
        sa=(12*bs)/100;
    }
    float gs=bs+da+sa;
    System.out.println("your gross salary is=" +gs);
}
}