import java.io.*;
class characterchange3
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader buffy=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your string");
        String x = buffy.readLine();
        int l = x.length();
        String u="";

        for(int i=0; i<l; i++)
        {
            char c=x.charAt(i);
            if(Character.isUpperCase(c))
            {
                u=u+Character.toLowerCase(c);

            }
             else if(Character.isLowerCase(c))
            {
                u=u+Character.toUpperCase(c);

            }
            else if (c==' ')
            {
                u=u+' ';

            }
        
        }
    System.out.println(u);
}
}
            