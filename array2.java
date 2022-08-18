import java.io.*;
class array2
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader buffy=new BufferedReader(new InputStreamReader(System.in));
        String M[] = new String[10];
        String B[] = new String[10];
        for(int i=0; i<10; i++)
        {
            System.out.println("Enter a name");
            M[i] = buffy.readLine();
            System.out.println("Enter a telephone number");
            B[i] = buffy.readLine();
        }
        System.out.println("Entered name");
        for(int i=0; i<10; i++)
        {
            System.out.println(M[i]);
        }
        System.out.println("Entered telephone number");
        for(int i=0; i<10; i++)
        {
            System.out.println(B[i]);
        }
    }
}
