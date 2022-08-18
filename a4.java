import java.io.*;
class a4
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader buffy=new BufferedReader(new InputStreamReader(System.in));
        String M[] = new String[5];
        System.out.println("Enter 5 names");
        for(int i=0;i<5;i++)
        {
            M[i]=buffy.readLine();
        }
        System.out.println("The names that start and end with 'a' are:");
        for(int i=0;i<5;i++)
        {
            if((M[i].startsWith("a"))&&(M[i].endsWith("a")))
            {
                System.out.println(M[i]);
            }
        }
    }
}
        