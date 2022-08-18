import java.io.*;
class array4
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader buffy=new BufferedReader(new InputStreamReader(System.in));
        int num[] = new int[20];
        double sq[] = new double[20];
        double cu[] = new double[20];
        for(int i=0; i<20; i++)
        {
            System.out.println("Enter a number");
            String a = buffy.readLine();
            num[i] = Integer.parseInt(a);
            sq[i] = Math.pow(num[i],2);
            cu[i] = Math.pow(num[i],3);
            System.out.println("Square of arrays is = " +sq[i]);
            System.out.println("Cube of arrays is = " +cu[i]);
        }
    }
}
