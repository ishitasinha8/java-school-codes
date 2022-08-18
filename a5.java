import java.io.*;
class a5
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader buffy=new BufferedReader(new InputStreamReader(System.in));
        int M[] = new int[15];
        System.out.println("Enter 15 integers");
        for(int i=0;i<15;i++)
        {
            String a=buffy.readLine();
            M[i]=Integer.parseInt(a);
        }
        int t=0;
        for(int i=0;i<14;i++)
        {
            int min=i;
            for(int j=i+1;j<15;j++)
            {
                if(M[j]<M[min])
                {
                    min=j;
                }
            }
            t=M[i];
            M[i]=M[min];
            M[min]=t;
        }
        System.out.println("The sorted integers in ascending order are:");
        for(int i=0;i<15;i++)
        {
            System.out.println(M[i]);
        }
    }
}

            