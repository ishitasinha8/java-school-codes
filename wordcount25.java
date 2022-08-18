import java.io.*;
class wordcount25
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader buffy=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your string");
        String z = buffy.readLine();
        int l = z.length();
        String r=" ";
        int count = 0;
        for(int i=0; i<l; i++)
        {
            char c=z.charAt(i);
            if(c!=' ')
                r=r+c;
            else 
            {
                count = count+1;
                System.out.println(r);
                r=" ";
            }
            if (i==(l-1))
            {
                count = count+1;
                System.out.println(r); 
            }
        }
        System.out.println("Number of words = " +count);
    }
}