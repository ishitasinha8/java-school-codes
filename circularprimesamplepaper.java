import java.io.*;
class circularprimesamplepaper
{
    //samplepaper10question1frombook
    public void check()throws IOException
    {
        int N=0;
        BufferedReader buffy=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number");
        try
        {
            N=Integer.parseInt(buffy.readLine());
        }
        catch(Exception e)
        {
            System.out.println("Exception " +e.getMessage());
            System.exit(0);
        }
        
        
        int i=0,j=0;int M,New=0;
        int b=N;
        int NewN=N;
        int circprime=0;
        while(b!=0)
        {
            b/=10;
            i++;

        }
        while(j!=i)
        { 
            int count=0;
            M=(int)(N%Math.pow(10,i-1));
            N=(int)(N/Math.pow(10,i-1));

            New=(M*10)+N;
            System.out.println(New);
            for(int l=1;l<New;l++)
            {
                if(New%i==0)
                {
                    count++;
                }
            }
            if(count<=1)
                circprime++;
            j++;
            N=New;
        }
        if(circprime==i)
        System.out.println("NUMBER IS CIRCULAR PRIME");
        
    }
    
    public static void main(String args[])throws IOException
    {
        circularprimesamplepaper obj=new circularprimesamplepaper();
        obj.check();
    }
    
    
}