import java.io.*;
class stf9
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader buffy=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a String");
        String x=buffy.readLine();
        int l=x.length();
        int p=x.indexOf(' ');
        String sn=x.substring(p);
        String fn=x.substring(0,p);
        System.out.println(sn+", "+fn);
    }
}
        