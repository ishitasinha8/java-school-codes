import java.io.*;
class firstcharacter8
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader buffy=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your string");
        String x = buffy.readLine();
        int l = x.length();
        char a=x.charAt(0);
        System.out.println(a);
        for(int i=1; i<l; i++)
        {
            char c=x.charAt(i);
            if(c==' ')
            {
                char d=x.charAt(i+1);
                System.out.println(d);
            }
        }
    }
}