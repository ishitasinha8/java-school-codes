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
        
    public void gcd(int p, int q, int num, int lcm)
    {
        if (q>0)
        {
            //System.out.println("1. P="+p+" Q="+q);
            gcd(q,p%q,q,1);
            //System.out.println("2. P="+p+" Q="+q);
        }
        else
        {
            lcm=(p*q)/num;
            
            System.out.println("3. P="+p+" Q="+q);
    }

        
            
    public static void main(String args[])throws IOException
    {
        BufferedReader buffy=new BufferedReader(new InputStreamReader(System.in));
        GCD_recur obj=new GCD_recur();
        System.out.println("Enter a number");
        String z=buffy.readLine();
        int x=Integer.parseInt(z);
        System.out.println("Enter a number");
        String w=buffy.readLine();
        int y=Integer.parseInt(w);
        int a= Math.max(x,y);
        int b= Math.min(x,y);
        //obj.accept();
        obj.gcd(a,b,0,1);
        //System.out.println("GCD = "+d);
    }
}
        
    
    
        