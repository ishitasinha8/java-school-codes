import java.io.*;
class stf8
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader buffy=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a String");
        String x=buffy.readLine();
        int l=x.length();
        String nw="";
        char d,e;
        for(int i=0;i<l;i++)
        {
            char c=x.charAt(i);
            if(Character.isLowerCase(c))
            {
                d=Character.toUpperCase(c);
                nw=nw+d;
            }
            else
            {
                e=Character.toLowerCase(c);
                nw=nw+e;
            }
        }
        System.out.println(nw);
    }
}
            
            