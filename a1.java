import java.io.*;
class a1
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader buffy=new BufferedReader(new InputStreamReader(System.in));
        String M[] = new String[10];
        String B[] = new String[10];
        System.out.println("Enter 10 names");
        for(int i=0; i<10; i++)
        {
              M[i] = buffy.readLine();
        }
        System.out.println("Enter 10 telephone numbers");
        for(int i=0; i<10; i++)
        {
            B[i] = buffy.readLine();
        }
        System.out.println("The names and telephone numbers are: ");
        for(int i=0; i<10; i++)
        {
            System.out.println(M[i]+" - "+B[i]);
        }
    }
}
