import java.io.*;
class a7
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader buffy=new BufferedReader(new InputStreamReader(System.in));
        int math[] = new int[5];
        int sci[] = new int[5];
        int comp[] = new int[5];
        int hcg[] = new int[5];
        int rn[] = new int[5];
        System.out.println("Enter 5 Math marks");
        for(int i=0;i<5;i++)
        {
            String a=buffy.readLine();
            math[i]=Integer.parseInt(a);
        }
        System.out.println("Enter 5 Science marks");
        for(int i=0;i<5;i++)
        {
            String b=buffy.readLine();
            sci[i]=Integer.parseInt(b);
        }
        System.out.println("Enter 5 Computer marks");
        for(int i=0;i<5;i++)
        {
            String c=buffy.readLine();
            comp[i]=Integer.parseInt(c);
        }
        System.out.println("Enter 5 History/Geography marks");
        for(int i=0;i<5;i++)
        {
            String d=buffy.readLine();
            hcg[i]=Integer.parseInt(d);
        }
        for(int i=0;i<5;i++)
        {
            
        System.out.println("Enter your roll number between 1 and 50");
        for(int i=0;i<5;i++)
        {
            String e=buffy.readLine();
            rn[i]=Integer.parseInt(e);
        }
        
        
        
        
        
        