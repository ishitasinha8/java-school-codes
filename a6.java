import java.io.*;
class a6
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader buffy=new BufferedReader(new InputStreamReader(System.in));
        int a[] = new int[5];
        int b[] = new int[5];        
        System.out.println("Enter 5 integers");
        for(int i=0;i<5;i++)
        {
            String z=buffy.readLine();
            a[i]=Integer.parseInt(z);
        }
        System.out.println("Enter 5 integers");
        for(int i=0;i<5;i++)
        {
            String y=buffy.readLine();
            b[i]=Integer.parseInt(y);
        }
        int c[] = new int[10];  
        System.out.println("The merged array is:");
        for(int i=0;i<5;i++)
        {
            c[i]=a[i];
            System.out.println(c[i]);
        }
        for(int i=0;i<5;i++)
        {
            c[i+5]=b[i];
            System.out.println(c[i+5]);
        }
    }
}
        
        