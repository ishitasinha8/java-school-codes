import java.io.*;
class countstring8
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader buffy=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your string");
        String x = buffy.readLine();
        int l = x.length();
        int r=0;
        String nw="";
        for(int i=l-1; i>=0; i--)
        {
            char c=x.charAt(i);
            if((c=='a')||(c=='i')||(c=='e')||(c=='o')||(c=='u'))
            r++;
            nw=nw+c;
        }
        System.out.println("Length of String = " +l);
        System.out.println("Numbers of Vowels = " +r);
        System.out.println("reversed String = " +nw);
        
    }
}
        