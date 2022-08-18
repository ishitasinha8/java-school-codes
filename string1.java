import java.io.*;
class string1
{
    public static void main(String args[])throws IOException
    {
    BufferedReader xyz = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("enter a string");
    String y=xyz.readLine();
    int a = y.length();
    for(int i=0; i<a; i++)
    {
        char c = y.charAt(i);
        System.out.println(c);
    }
}
    
}
