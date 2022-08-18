import java.io.*;
class array1
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader buffy=new BufferedReader(new InputStreamReader(System.in));
        int M[] = new int[5];
        int s=0;
        for(int i=0; i<5; i++)
        {
            System.out.println("Enter a number");
            String b = buffy.readLine();
            M[i] = Integer.parseInt(b);
            s=s+M[i];
        }
        System.out.println("sum = " +s);
    }
}