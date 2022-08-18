import java.io.*;
class charsdigits1
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader buffy=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your sentence");
        String x = buffy.readLine();
        int l = x.length();
        int b=0;
        int d=0;
        int u=0;
        
        for(int i=0; i<l; i++)
        {
            char c=x.charAt(i);
            if (Character.isLowerCase(c))
            b++;
            if (Character.isUpperCase(c))
            u++;
            if (Character.isDigit(c))
            d++;
        }
        System.out.println("Number of characters in lower case = "+b);
        System.out.println("Number of characters in upper case = "+u);
        System.out.println("Number of digits = "+d);
    }
}
        