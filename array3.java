import java.io.*;
class array3
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader buffy=new BufferedReader(new InputStreamReader(System.in));
        int A[] = new int[8];
        int B[] = new int[8];
        int C[] = new int[8];
        for(int i=0; i<8; i++)
        {
            System.out.println("Enter a number");
            String a = buffy.readLine();
            A[i] = Integer.parseInt(a);
            System.out.println("Enter another number");
            String b = buffy.readLine();
            B[i] = Integer.parseInt(b);
            C[i] = A[i]+B[i];
            System.out.println("Sum of both arrays is = " +C[i]);
        }
    }
}
