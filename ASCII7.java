import java.io.*;
class ASCII7
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader buffy=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your sentence to get ascii value of all char in sentence");
        String x = buffy.readLine();
        int l = x.length();
        int s=0;
        for(int i=0; i<l; i++)
        {
            char c=x.charAt(i);
            int a= (int) (c);
            s=s+a;
        }
        System.out.println("Sum of ASCII value of each char of sentence = " +s);
    }
}