import java.io.*;
class a2
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader buffy=new BufferedReader(new InputStreamReader(System.in));
        int M[] = new int[10];
        System.out.println("Enter 10 positive and negative numbers");
        for(int i=0;i<10;i++)
        {
            String a=buffy.readLine();
            M[i]=Integer.parseInt(a);
        }
        int neg=0;
        int poseven=0;
        int posodd=0;
        for(int i=0;i<10;i++)
        {
            if(M[i]<0)
            {
                neg=neg+M[i];
            }
            else if(M[i]%2==0)
            {
                poseven=poseven+M[i];
            }
            else if(M[i]%2!=0)
            {
                posodd=posodd+M[i];
            }
        }
        System.out.println("The sum of negative numbers are = "+neg);
        System.out.println("The sum of positive even numbers are = "+poseven);
        System.out.println("The sum of positive odd numbers are = "+posodd);
    }
}
            