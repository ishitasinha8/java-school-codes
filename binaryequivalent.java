import java.io.*;
class binaryequivalent_2020samplepaper
{
    //2020samplepaperquestion1
    int N,i;int rem[]=new int[10];
    public void accept()throws IOException
    {
        BufferedReader buffy=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number between 2 and 100");
        try
        {
            N=Integer.parseInt(buffy.readLine());
        }
        catch(Exception e)
        {
            System.out.println("EXCEPTION "+e.getMessage());
        }
        if((N>2)&&(N<100))
            System.out.println("INPUT N="+N);
        else
        {
            System.out.println("NUMBER OUT OF RANGE");
            System.exit(0);
        }
            
    }
    public void binary()
    {
        
        i=0;
        while(N!=0)
        {
            rem[i]=N%2;
            i++;
            N=N/2;
            
        }
        --i;
         System.out.print("BINARY EQUIVALENT ");
        for(int j=i;j>=0;j--)
        {
            System.out.print(rem[j]);
        }
        System.out.println();
    }
    public void count()
    {
        int c=0;
        for(int j=0;j<=i;j++)
        {
            if(rem[j]==1)
            c++;
        }
        System.out.println("NUMBER OF 1s= "+c);
        if(c%2==0)
        {
            System.out.println("EVIL NUMBER");
        }
        else
            System.out.println("NOT AN EVIL NUMBER");
    }
     public static void main(String args[])throws IOException
    {
        binaryequivalent_2020samplepaper obj=new binaryequivalent_2020samplepaper();
        obj.accept();
        obj.binary();
        obj.count();
    }
}