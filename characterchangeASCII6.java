import java.io.*;
class characterchangeASCII6
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader buffy=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your string with mixed character");
        String x = buffy.readLine();
        int l = x.length();
        String nw="";
        for(int i=0; i<l; i++)
        {
            char c=x.charAt(i);
            int a= (int) (c);
            if((a!=' ')&&(a>=65)&&(a<=90))
            {
                a=a+32;
                c = (char)a;
                nw=nw+c;
            }
            else if((a!=' ')&&(a>=97)&&(a<=122))
            {
                a=a-32;
                c = (char)a;
                nw=nw+c;
            }
            else if (a==' ')
            {
                a=c;
                c = (char)a;
                nw=nw+c;
            }
        }
        System.out.println(nw);
    }
}