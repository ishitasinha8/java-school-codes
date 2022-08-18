import java.io.*;
class compute
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader buffy=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("1. Sum Series");
        System.out.println("2. Multiple Series");
        System.out.println("Enter your choice");
        String z = buffy.readLine();
        int c = Integer.parseInt(z);
        if (c==1)
        {
            double P = 1;
            System.out.println("enter a number");
            String y=buffy.readLine();
            int x=Integer.parseInt(y);
            System.out.println("enter an even number");
            String w = buffy.readLine();
            int n = Integer.parseInt(w);
            while(n>=2)
            {
                P=P+((Math.pow(x,n))/n);
                n=n-2;
            }
                System.out.println("1. Sum Series" +P);
            }
        if (c==2)
        {
            int i=1;
            int a=3;
            double b=1;
            while(i<=5)
            {
                b=b*(Math.pow(a,i));
                i++;
            }
            System.out.println(b);
        }
    }
}
        
    
            