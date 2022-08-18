import java.io.*;
class stf10
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader buffy=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a String");
        String x=buffy.readLine();
        int l=x.length();
        int w=1;
        int d=0;
        int cl=0;
        for(int i=0;i<l;i++)
        {
            char c=x.charAt(i);
            if(c==' ')
            {
                w=w+1;
            }
            else if(Character.isDigit(c))
            {
                d=d+1;
            }
            else if(Character.isUpperCase(c))
            {
                cl=cl+1;
            }
        }
        System.out.println("The number of words are "+w);
        System.out.println("The number of digits are "+d);
        System.out.println("The number of capital letters are "+cl);
    }
}
        
            