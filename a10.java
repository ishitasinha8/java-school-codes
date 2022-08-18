import java.io.*;
class a10
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader buffy=new BufferedReader(new InputStreamReader(System.in));
        //char M[]={'a','e','i','o','u'};
        char M[] = new char[5];
        char N[]= new char[4]; 
        System.out.println("Enter the 5 vowels in random order");
        for(int j=0;j<M.length;j++)
        {
            M[j]=(char)(buffy.read());
        }
        for(int j=0;j<M.length;j++)
        {
            if(M[j]!='a')
            {
                N[j]=M[j];
            }
        }
        for(int j=0;j<4;j++)
        {
            System.out.println(N[j]);
        }
    }
}
        