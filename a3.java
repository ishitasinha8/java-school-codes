import java.io.*;
class a3
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader buffy=new BufferedReader(new InputStreamReader(System.in));
        int M[] = new int[10];
        System.out.println("Enter 10 numbers");
        for(int i=0;i<10;i++)
        {
            String a=buffy.readLine();
            M[i]=Integer.parseInt(a);
        }
        int min=M[0];
        int max=M[0];
        for(int i=0;i<10;i++)
        {
            if(M[i]<min)
            {
                min=M[i];
            }
            else
            {
                max=M[i];
            }
        }
        System.out.println("The minimum number is = "+min);
        System.out.println("The maximum number is = "+max);
    }
}
        