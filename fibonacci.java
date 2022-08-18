import java.io.*;
class fibonacci
{
public static void main (String args []) throws IOException
{
    int c=0;
    int i=0;
    do
    {
        c++;
        i++;
        i=i+i;
        System.out.print(i+",");
    }
    while(c<=10);
}
}
        