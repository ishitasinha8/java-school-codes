import java.io.*;
class vowel3
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader buffy=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your string");
        String z = buffy.readLine();
        int l = z.length();
        int r=0;
        for(int i=0; i<l; i++)
        {
            char c=z.charAt(i);
            if((c=='a')||(c=='i')||(c=='e')||(c=='o')||(c=='u'))
            r++;
        }
        System.out.println("Numbers of Vowels = " +r);
        System.out.println("Length of String = " +l);
        float v=(r*100)/l;
        System.out.println("Percentage of Vowels = " +v);
        
    }
}
        