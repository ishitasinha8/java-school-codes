import java.util.*;
import java.io.*;
class File
{
    Scanner sc=new Scanner(System.in);
    void write()throws IOException
    {
        try
        {
            FileWriter fw=new FileWriter("C:\\Users\\Ishita\\Desktop\\ICSE\\Student.txt");
            BufferedWriter bw=new BufferedWriter(fw);
            PrintWriter pw=new PrintWriter(bw);
            for(int i=0;i<3;i++)
            {
                System.out.println("Enter name");
                String a=sc.nextLine();
                pw.println(a);
            }
            pw.close();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
    void read()throws IOException
    {
        
        String abc;
        try
        {   
            FileReader fr=new FileReader("C:\\Users\\Ishita\\Desktop\\ICSE\\Student.txt");
            BufferedReader br=new BufferedReader(fr);
            while((abc=br.readLine())!=null)
            {
                System.out.println(abc);
            }
            br.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
    }
    public static void main(String args[])throws IOException
    {
        File obj=new File();
        obj.write();
        obj.read();
    }
}