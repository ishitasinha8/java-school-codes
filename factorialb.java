import java.io.*;
class factorialb
{
public static void main(String args[])throws IOException
{
    int i=1;
    int K=0;
    while(i<=15)
    {
        K=K+i;
        i=i+2;
    }
    System.out.println(K);
}
}
