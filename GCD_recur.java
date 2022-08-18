import java.io.*;
class GCD_recur
{
    int z,b,j,l; //String x,y;
    /*public void accept()throws IOException
    {
        BufferedReader buffy=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number");
        x=buffy.readLine();
        n=Integer.parseInt(x);
        System.out.println("Enter a number");
        y=buffy.readLine();
        m=Integer.parseInt(y);
        //return(n);
        //l=x.length();
    }*/
        
    public void gcd(int p, int q)
    {
        if (q>0)
        {
            System.out.println("1. P="+p+" Q="+q);
            gcd(q,p%q);
            System.out.println("2. P="+p+" Q="+q);
        }
        System.out.println("3. P="+p+" Q="+q);
    }

        
            
    public static void main(String args[])throws IOException
    {
        BufferedReader buffy=new BufferedReader(new InputStreamReader(System.in));
        GCD_recur obj=new GCD_recur();
        System.out.println("Enter a number");
        String x=buffy.readLine();
        int n=Integer.parseInt(x);
        System.out.println("Enter a number");
        String y=buffy.readLine();
        int m=Integer.parseInt(y);
        //obj.accept();
        obj.gcd(n,m);
        //System.out.println("GCD = "+d);
    }
}
        
    
    
        