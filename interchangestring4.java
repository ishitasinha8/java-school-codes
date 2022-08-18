import java.io.*;
class interchangestring4
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader buffy=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your sentence");
        String sentence = buffy.readLine();
        System.out.println("Enter first word from sentence you want to swap from");
        String firstword = buffy.readLine();
        System.out.println("Enter second word from sentence you want to swap to");
        String secondword = buffy.readLine();
        sentence=sentence.replace(secondword,firstword);
        System.out.println(sentence);
    }
}