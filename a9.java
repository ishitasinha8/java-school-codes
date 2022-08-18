import java.io.*;
class a9
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader buffy=new BufferedReader(new InputStreamReader(System.in));
        String A[] = new String[5];
        String B[] = new String[5];
        System.out.println("Enter 5 countries");
        for(int i=0; i<5; i++)
        {
              A[i] = buffy.readLine();
        }
        System.out.println("Enter the corresponding capitals");
        for(int i=0; i<5; i++)
        {
              B[i] = buffy.readLine();
        }
        System.out.println("Enter a country");
        String co=buffy.readLine();
        int p=0;
        for(int i=0;i<5;i++)
        {
            if(co.equalsIgnoreCase(A[i]))
            {
                System.out.println("The capital of "+co+" is "+B[i]);
                break;
            }
        }
    }
}
        